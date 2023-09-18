package net.caballerosupreme.empyrean_ores.block.custom;

import net.minecraft.ChatFormatting;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.OreBlock;
import net.minecraft.world.level.block.RedstoneTorchBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityTicker;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.ticks.TickPriority;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class GlowOre extends OreBlock implements BlockEntityTicker {
    public static final BooleanProperty LIT = RedstoneTorchBlock.LIT;
    //This needs to be a BooleanProperty so that every block has its own LIT value independent from each other.
    public int tickCount = 0;

    public GlowOre(Properties properties, UniformInt uniformInt) {
        super(properties, uniformInt);
        //default state off
        this.registerDefaultState(this.defaultBlockState().setValue(LIT, Boolean.valueOf(false)));
    }

    //LIT IS TRUE WHEN YOU STEP ON IT
    @Override
    public void stepOn(Level pLevel, BlockPos pPos, BlockState pState, Entity pEntity) {
        if (!pState.getValue(LIT)){
            pLevel.setBlock(pPos, pState.setValue(LIT, Boolean.valueOf(true)),3);
        }

        super.stepOn(pLevel, pPos, pState, pEntity);
    }

    //LIT IS TRUE WHEN YOU ATTACK IT
    @Override
    public void attack(BlockState pState, Level pLevel, BlockPos pPos, Player pPlayer) {
        if (!pState.getValue(LIT)){
            pLevel.setBlock(pPos, pState.setValue(LIT, Boolean.valueOf(true)),3);
        }

        super.attack(pState, pLevel, pPos, pPlayer);
    }

    //This enables the random tick method when LIT is true
    @Override
    public boolean isRandomlyTicking(BlockState pState) {
        return pState.getValue(LIT);
    }

    //Every game tick if LIT is true, then count 40 game Ticks on the server and set LIT to false
    //Random Tick is apparently just a name because the BlockEntity Ticker calls the tick function inside of randomTick
    @Override
    public void tick(Level pLevel, BlockPos pPos, BlockState pState, BlockEntity pBlockEntity) {
        //Put a tick counter that counts only when plevel is not on the clientside
        //When the tick count is 40 then set LIT to false
        if (pState.getValue(LIT)){
            pLevel.setBlock(pPos, pState.setValue(LIT, Boolean.valueOf(false)), 3);

        }
    }

    @Override
    public void appendHoverText(ItemStack pStack, @Nullable BlockGetter pLevel, List<Component> pTooltip, TooltipFlag pFlag) {
        pTooltip.add(new TextComponent("Glows with power!").withStyle(ChatFormatting.BOLD).withStyle(ChatFormatting.GOLD));
        super.appendHoverText(pStack, pLevel, pTooltip, pFlag);
    }

    //We must add the blockstate definition to be used on the class, otherwise it doesn't work
    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> pBuilder) {
        super.createBlockStateDefinition(pBuilder.add(LIT));
    }


}
