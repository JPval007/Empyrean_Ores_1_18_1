package net.caballerosupreme.empyrean_ores.item.custom;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class LowSteel extends Item {
    public LowSteel(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable Level pLevel, List<Component> componentList, TooltipFlag tooltipFlag) {

        //componentList.add(new TextComponent("SampleText").withStyle(ChatFormatting.BLUE));
        componentList.add(new TextComponent("Low carbon steel (0-0.3%) is great for structures").withStyle(ChatFormatting.BLUE));

        super.appendHoverText(stack, pLevel, componentList, tooltipFlag);
    }
}
