package net.caballerosupreme.empyrean_ores.item.custom;

import net.minecraft.ChatFormatting;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;


public class MandalorianHelmet extends Item {
    public MandalorianHelmet(Properties pProperties) {
        super(pProperties);
    }

    //Tooltip


    @Override
    public void appendHoverText(ItemStack stack, @Nullable Level pLevel, List<Component> componentList, TooltipFlag tooltipFlag) {
        //If shift key is pressed then show the first text, otherwise show the second
        if (Screen.hasShiftDown()){
            componentList.add(new TranslatableComponent("tooltip.empyrean_ores.mandalorian_helmet.tooltip.shift")
                    .withStyle(ChatFormatting.AQUA)); //Translating it in en_us
            //componentList.add(new TextComponent("SampleText").withStyle(ChatFormatting.BLUE)); //This is the literal way, add a string directly
        } else {
            componentList.add(new TranslatableComponent("tooltip.empyrean_ores.mandalorian_helmet.tooltip")
                    .withStyle(ChatFormatting.YELLOW)); //Translating it in en_us
        }


        super.appendHoverText(stack, pLevel, componentList, tooltipFlag);
    }
}
