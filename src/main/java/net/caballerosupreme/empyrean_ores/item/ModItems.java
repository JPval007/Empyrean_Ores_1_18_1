package net.caballerosupreme.empyrean_ores.item;

import net.caballerosupreme.empyrean_ores.EmpyreanOres;
import net.caballerosupreme.empyrean_ores.item.custom.*;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, EmpyreanOres.MOD_ID);

    //Low Steel
    public static final RegistryObject<Item> LOW_CARBON_STEEL_INGOT = ITEMS.register("low_carbon_steel_ingot",
            () -> new LowSteel(new Item.Properties().tab(ModCreativeModeTab.EMPYREAN_TAB).rarity(Rarity.UNCOMMON)));

    //Mid Steel
    public static final RegistryObject<Item> MID_CARBON_STEEL_INGOT = ITEMS.register("mid_carbon_steel_ingot",
            () -> new MidSteel(new Item.Properties().tab(ModCreativeModeTab.EMPYREAN_TAB).rarity(Rarity.RARE)));

    //High Steel
    public static final RegistryObject<Item> HIGH_CARBON_STEEL_INGOT = ITEMS.register("high_carbon_steel_ingot",
            () -> new HighSteel(new Item.Properties().tab(ModCreativeModeTab.EMPYREAN_TAB).rarity(Rarity.EPIC)));

    //Helmet of The Mandalor
    public static final RegistryObject<Item> MANDALORIAN_HELMET = ITEMS.register("mandalorian_helmet",
            () -> new MandalorianHelmet(new Item.Properties().tab(ModCreativeModeTab.EMPYREAN_TAB)));

    //Steel Helmet
    public static final RegistryObject<Item> STEEL_HELMET = ITEMS.register("steel_helmet",
            () -> new ArmorItem(ModArmorMaterials.STEEL, EquipmentSlot.HEAD,
                    new Item.Properties().tab(ModCreativeModeTab.EMPYREAN_TAB)));

    //Steel Chestplate
    public static final RegistryObject<Item> STEEL_CHESTPLATE = ITEMS.register("steel_chestplate",
            () -> new ArmorItem(ModArmorMaterials.STEEL,EquipmentSlot.CHEST,
                    new Item.Properties().tab(ModCreativeModeTab.EMPYREAN_TAB)));

    //Steel Leggings
    public static final RegistryObject<Item> STEEL_LEGGINGS = ITEMS.register("steel_leggings",
            () -> new ArmorItem(ModArmorMaterials.STEEL,EquipmentSlot.LEGS,
                    new Item.Properties().tab(ModCreativeModeTab.EMPYREAN_TAB)));

    //Steel Boots
    public static final RegistryObject<Item> STEEL_BOOTS = ITEMS.register("steel_boots",
            () -> new ArmorItem(ModArmorMaterials.STEEL,EquipmentSlot.FEET,
                    new Item.Properties().tab(ModCreativeModeTab.EMPYREAN_TAB)));

    //Steel Pickaxe
    public static final RegistryObject<Item> STEEL_PICKAXE = ITEMS.register("steel_pickaxe",
            () -> new PickaxeItem(ModTiers.STEEL_TIER,2,4f,
                    new Item.Properties().tab(ModCreativeModeTab.EMPYREAN_TAB)));

    //Steel Axe
    public static final RegistryObject<Item> STEEL_AXE = ITEMS.register("steel_axe",
            () -> new AxeItem(ModTiers.STEEL_TIER,2,4f,
                    new Item.Properties().tab(ModCreativeModeTab.EMPYREAN_TAB)));

    //Steel Hoe
    public static final RegistryObject<Item> STEEL_HOE = ITEMS.register("steel_hoe",
            () -> new HoeItem(ModTiers.STEEL_TIER,2,4,
                    new Item.Properties().tab(ModCreativeModeTab.EMPYREAN_TAB)));

    //Steel Shovel
    public static final RegistryObject<Item> STEEL_SHOVEL = ITEMS.register("steel_shovel",
            () -> new ShovelItem(ModTiers.STEEL_TIER,2,4f,
                    new Item.Properties().tab(ModCreativeModeTab.EMPYREAN_TAB)));

    //Steel Sword
    public static final RegistryObject<Item> STEEL_SWORD = ITEMS.register("steel_sword",
            () -> new SwordItem(ModTiers.STEEL_TIER,4,5f,
                    new Item.Properties().tab(ModCreativeModeTab.EMPYREAN_TAB)));



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
