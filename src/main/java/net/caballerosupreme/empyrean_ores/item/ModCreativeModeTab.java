package net.caballerosupreme.empyrean_ores.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab EMPYREAN_TAB = new CreativeModeTab("empyrean_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.LOW_CARBON_STEEL_INGOT.get());
        }
    };

    //Experimental features tab
    public static final CreativeModeTab DEBUG_TAB = new CreativeModeTab("empyrean_experimental_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.TUNGSTEN_HELMET.get());
        }
    };
}
