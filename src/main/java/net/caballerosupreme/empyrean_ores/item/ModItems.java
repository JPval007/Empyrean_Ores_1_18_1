package net.caballerosupreme.empyrean_ores.item;

import net.caballerosupreme.empyrean_ores.EmpyreanOres;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, EmpyreanOres.MOD_ID);

    public static final RegistryObject<Item> LOW_CARBON_STEEL_INGOT = ITEMS.register("low_carbon_steel_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.EMPYREAN_TAB).rarity(Rarity.UNCOMMON)));

    public static final RegistryObject<Item> MID_CARBON_STEEL_INGOT = ITEMS.register("mid_carbon_steel_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.EMPYREAN_TAB).rarity(Rarity.RARE)));

    public static final RegistryObject<Item> HIGH_CARBON_STEEL_INGOT = ITEMS.register("high_carbon_steel_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.EMPYREAN_TAB).rarity(Rarity.EPIC)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
