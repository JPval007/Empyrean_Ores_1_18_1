package net.caballerosupreme.empyrean_ores.block.custom;

import net.minecraft.ChatFormatting;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class SpeedyBlock extends Block {
    public SpeedyBlock(Properties properties) {
        super(properties);
    }

    @Override
    public void stepOn(Level pLevel, BlockPos pPos, BlockState pState, Entity pEntity) {
        if (!pLevel.isClientSide()){
            if (pEntity instanceof LivingEntity){
                LivingEntity livingEntity = ((LivingEntity) pEntity);
                //We casted the entity that stepped on it, as a Living Entity type, no matter if it was a player, mob, blockentity or other...
                livingEntity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED,300));
                //Add speed effect to entity for 15 seconds
            }
        }
        super.stepOn(pLevel, pPos, pState, pEntity);

    }


    @Override
    public void appendHoverText(ItemStack pStack, @Nullable BlockGetter pLevel, List<Component> pTooltip, TooltipFlag pFlag) {
        //Block item tool tip
        pTooltip.add(new TextComponent("Makes you fast like Sonic the Hedgehog!").withStyle(ChatFormatting.AQUA));


        super.appendHoverText(pStack, pLevel, pTooltip, pFlag);
    }
}
