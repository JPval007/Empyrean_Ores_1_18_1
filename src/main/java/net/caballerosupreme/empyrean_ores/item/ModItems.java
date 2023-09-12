package net.caballerosupreme.empyrean_ores.item;

import net.caballerosupreme.empyrean_ores.EmpyreanOres;
import net.caballerosupreme.empyrean_ores.item.custom.*;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, EmpyreanOres.MOD_ID);
    //Gems

    //RUBY
    public static final RegistryObject<Item> RUBY = ITEMS.register("ruby",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.EMPYREAN_TAB)));

    //SAPPHIRE
    public static final RegistryObject<Item> SAPPHIRE = ITEMS.register("sapphire",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.EMPYREAN_TAB)));

    //Citrine
    public static final RegistryObject<Item> CITRINE = ITEMS.register("citrine",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.EMPYREAN_TAB)));

    //Opal
    public static final RegistryObject<Item> OPAL = ITEMS.register("opal",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.EMPYREAN_TAB)));

    //Titanium
    public static final RegistryObject<Item> TITANIUM_INGOT = ITEMS.register("titanium_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.EMPYREAN_TAB)));

    //Raw Titanium
    public static final RegistryObject<Item> RAW_TITANIUM = ITEMS.register("raw_titanium",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.EMPYREAN_TAB)));

    //Tungsten
    public static final RegistryObject<Item> TUNGSTEN_INGOT = ITEMS.register("tungsten_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.EMPYREAN_TAB)));

    //Raw Tungsten
    public static final RegistryObject<Item> RAW_TUNGSTEN = ITEMS.register("raw_tungsten",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.EMPYREAN_TAB)));

    //Topaz
    public static final RegistryObject<Item> TOPAZ = ITEMS.register("topaz",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.EMPYREAN_TAB)));

    //Adamite
    public static final RegistryObject<Item> ADAMITE = ITEMS.register("adamite",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.EMPYREAN_TAB)));

    //Adamantite Ingot
    public static final RegistryObject<Item> ADAMANTITE_INGOT = ITEMS.register("adamantite_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.EMPYREAN_TAB)));

    //Zircon
    public static final RegistryObject<Item> ZIRCON = ITEMS.register("zircon",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.EMPYREAN_TAB)));

    //Raw Zircon
    public static final RegistryObject<Item> RAW_ZIRCON = ITEMS.register("raw_zircon",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.EMPYREAN_TAB)));

    //Aluminum
    public static final RegistryObject<Item> ALUMINUM_INGOT = ITEMS.register("aluminum_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.EMPYREAN_TAB)));

    //Raw Aluminum
    public static final RegistryObject<Item> RAW_ALUMINUM = ITEMS.register("raw_aluminum",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.EMPYREAN_TAB)));

    //------------------------------------------------------------------------------------------------------------------
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


    //------------------------------------------------------------------------------------------------------------------
    //Citrine Items

    //------------------------------------------------------------------------------------------------------------------
    //Ruby Items

    //------------------------------------------------------------------------------------------------------------------
    //Sapphire Items
    //Sapphire Pickaxe
    public static final RegistryObject<Item> SAPPHIRE_PICKAXE = ITEMS.register("sapphire_pickaxe",
            () -> new PickaxeItem(ModTiers.SAPPHIRE_TIER,2,4f,
                    new Item.Properties().tab(ModCreativeModeTab.EMPYREAN_TAB)));

    //Sapphire Axe
    public static final RegistryObject<Item> SAPPHIRE_AXE = ITEMS.register("sapphire_axe",
            () -> new AxeItem(ModTiers.SAPPHIRE_TIER,2,4f,
                    new Item.Properties().tab(ModCreativeModeTab.EMPYREAN_TAB)));

    //Sapphire Hoe
    public static final RegistryObject<Item> SAPPHIRE_HOE = ITEMS.register("sapphire_hoe",
            () -> new HoeItem(ModTiers.SAPPHIRE_TIER,2,4,
                    new Item.Properties().tab(ModCreativeModeTab.EMPYREAN_TAB)));

    //Sapphire Shovel
    public static final RegistryObject<Item> SAPPHIRE_SHOVEL = ITEMS.register("sapphire_shovel",
            () -> new ShovelItem(ModTiers.SAPPHIRE_TIER,2,4f,
                    new Item.Properties().tab(ModCreativeModeTab.EMPYREAN_TAB)));

    //Sapphire Sword
    public static final RegistryObject<Item> SAPPHIRE_SWORD = ITEMS.register("sapphire_sword",
            () -> new SwordItem(ModTiers.SAPPHIRE_TIER,2,5f,
                    new Item.Properties().tab(ModCreativeModeTab.EMPYREAN_TAB)));

    //Sapphire Helmet
    public static final RegistryObject<Item> SAPPHIRE_HELMET = ITEMS.register("sapphire_helmet",
            () -> new ArmorItem(ModArmorMaterials.SAPPHIRE, EquipmentSlot.HEAD,
                    new Item.Properties().tab(ModCreativeModeTab.EMPYREAN_TAB)));

    //Sapphire Chestplate
    public static final RegistryObject<Item> SAPPHIRE_CHESTPLATE = ITEMS.register("sapphire_chestplate",
            () -> new ArmorItem(ModArmorMaterials.SAPPHIRE,EquipmentSlot.CHEST,
                    new Item.Properties().tab(ModCreativeModeTab.EMPYREAN_TAB)));

    //Sapphire Leggings
    public static final RegistryObject<Item> SAPPHIRE_LEGGINGS = ITEMS.register("sapphire_leggings",
            () -> new ArmorItem(ModArmorMaterials.SAPPHIRE,EquipmentSlot.LEGS,
                    new Item.Properties().tab(ModCreativeModeTab.EMPYREAN_TAB)));

    //Sapphire Boots
    public static final RegistryObject<Item> SAPPHIRE_BOOTS = ITEMS.register("sapphire_boots",
            () -> new ArmorItem(ModArmorMaterials.SAPPHIRE,EquipmentSlot.FEET,
                    new Item.Properties().tab(ModCreativeModeTab.EMPYREAN_TAB)));
    //------------------------------------------------------------------------------------------------------------------
    //Opal Items

    //Opal Pickaxe
    public static final RegistryObject<Item> OPAL_PICKAXE = ITEMS.register("opal_pickaxe",
            () -> new PickaxeItem(ModTiers.OPAL_TIER,4,4f,
                    new Item.Properties().tab(ModCreativeModeTab.EMPYREAN_TAB)));

    //Opal Axe
    public static final RegistryObject<Item> OPAL_AXE = ITEMS.register("opal_axe",
            () -> new AxeItem(ModTiers.OPAL_TIER,4,4f,
                    new Item.Properties().tab(ModCreativeModeTab.EMPYREAN_TAB)));

    //Opal Hoe
    public static final RegistryObject<Item> OPAL_HOE = ITEMS.register("opal_hoe",
            () -> new HoeItem(ModTiers.OPAL_TIER,4,4,
                    new Item.Properties().tab(ModCreativeModeTab.EMPYREAN_TAB)));

    //Opal Shovel
    public static final RegistryObject<Item> OPAL_SHOVEL = ITEMS.register("opal_shovel",
            () -> new ShovelItem(ModTiers.OPAL_TIER,4,4f,
                    new Item.Properties().tab(ModCreativeModeTab.EMPYREAN_TAB)));

    //Opal Sword
    public static final RegistryObject<Item> OPAL_SWORD = ITEMS.register("opal_sword",
            () -> new SwordItem(ModTiers.OPAL_TIER,4,5f,
                    new Item.Properties().tab(ModCreativeModeTab.EMPYREAN_TAB)));

    //Opal Helmet
    public static final RegistryObject<Item> OPAL_HELMET = ITEMS.register("opal_helmet",
            () -> new ArmorItem(ModArmorMaterials.OPAL, EquipmentSlot.HEAD,
                    new Item.Properties().tab(ModCreativeModeTab.EMPYREAN_TAB)));

    //Opal Chestplate
    public static final RegistryObject<Item> OPAL_CHESTPLATE = ITEMS.register("opal_chestplate",
            () -> new ArmorItem(ModArmorMaterials.OPAL,EquipmentSlot.CHEST,
                    new Item.Properties().tab(ModCreativeModeTab.EMPYREAN_TAB)));

    //Opal Leggings
    public static final RegistryObject<Item> OPAL_LEGGINGS = ITEMS.register("opal_leggings",
            () -> new ArmorItem(ModArmorMaterials.OPAL,EquipmentSlot.LEGS,
                    new Item.Properties().tab(ModCreativeModeTab.EMPYREAN_TAB)));

    //Opal Boots
    public static final RegistryObject<Item> OPAL_BOOTS = ITEMS.register("opal_boots",
            () -> new ArmorItem(ModArmorMaterials.OPAL,EquipmentSlot.FEET,
                    new Item.Properties().tab(ModCreativeModeTab.EMPYREAN_TAB)));
    //------------------------------------------------------------------------------------------------------------------
    //Zircon Items

    //------------------------------------------------------------------------------------------------------------------
    //Topaz Items

    //------------------------------------------------------------------------------------------------------------------
    //Titanium Items

    //------------------------------------------------------------------------------------------------------------------
    //Tungsten Items
    //Tungsten Helmet
    public static final RegistryObject<Item> TUNGSTEN_HELMET = ITEMS.register("tungsten_helmet",
            () -> new ArmorItem(ModArmorMaterials.TUNGSTEN, EquipmentSlot.HEAD,
                    new Item.Properties().tab(ModCreativeModeTab.EMPYREAN_TAB)));

    //Tungsten Chestplate
    public static final RegistryObject<Item> TUNGSTEN_CHESTPLATE = ITEMS.register("tungsten_chestplate",
            () -> new ArmorItem(ModArmorMaterials.TUNGSTEN,EquipmentSlot.CHEST,
                    new Item.Properties().tab(ModCreativeModeTab.EMPYREAN_TAB)));

    //Tungsten Leggings
    public static final RegistryObject<Item> TUNGSTEN_LEGGINGS = ITEMS.register("tungsten_leggings",
            () -> new ArmorItem(ModArmorMaterials.TUNGSTEN,EquipmentSlot.LEGS,
                    new Item.Properties().tab(ModCreativeModeTab.EMPYREAN_TAB)));

    //Tungsten Boots
    public static final RegistryObject<Item> TUNGSTEN_BOOTS = ITEMS.register("tungsten_boots",
            () -> new ArmorItem(ModArmorMaterials.TUNGSTEN,EquipmentSlot.FEET,
                    new Item.Properties().tab(ModCreativeModeTab.EMPYREAN_TAB)));


    //Tungsten Pickaxe
    public static final RegistryObject<Item> TUNGSTEN_PICKAXE = ITEMS.register("tungsten_pickaxe",
            () -> new PickaxeItem(ModTiers.TUNGSTEN_TIER,5,-4.1F,
                    new Item.Properties().tab(ModCreativeModeTab.EMPYREAN_TAB)));

    //Tungsten Axe
    public static final RegistryObject<Item> TUNGSTEN_AXE = ITEMS.register("tungsten_axe",
            () -> new AxeItem(ModTiers.TUNGSTEN_TIER,5,-4.1F,
                    new Item.Properties().tab(ModCreativeModeTab.EMPYREAN_TAB)));

    //Tungsten Hoe
    public static final RegistryObject<Item> TUNGSTEN_HOE = ITEMS.register("tungsten_hoe",
            () -> new HoeItem(ModTiers.TUNGSTEN_TIER,5,-4.1F,
                    new Item.Properties().tab(ModCreativeModeTab.EMPYREAN_TAB)));

    //Tungsten Shovel
    public static final RegistryObject<Item> TUNGSTEN_SHOVEL = ITEMS.register("tungsten_shovel",
            () -> new ShovelItem(ModTiers.TUNGSTEN_TIER,5,-4.1F,
                    new Item.Properties().tab(ModCreativeModeTab.EMPYREAN_TAB)));

    //Tungsten Sword
    public static final RegistryObject<Item> TUNGSTEN_SWORD = ITEMS.register("tungsten_sword",
            () -> new SwordItem(ModTiers.TUNGSTEN_TIER,8,-4.1F,
                    new Item.Properties().tab(ModCreativeModeTab.EMPYREAN_TAB)));

    //------------------------------------------------------------------------------------------------------------------
    //Aluminum Items
    //Tools
    public static final RegistryObject<Item> ALUMINUM_SWORD = ITEMS.register("aluminum_sword",
            () -> new SwordItem(ModTiers.ALUMINUM_TIER,3,2.4f,
                    new Item.Properties().tab(ModCreativeModeTab.EMPYREAN_TAB)));

    public static final RegistryObject<Item> ALUMINUM_SHOVEL = ITEMS.register("aluminum_shovel",
            () -> new ShovelItem(ModTiers.ALUMINUM_TIER,1f,3f,
                    new Item.Properties().tab(ModCreativeModeTab.EMPYREAN_TAB)));

    public static final RegistryObject<Item> ALUMINUM_HOE = ITEMS.register("aluminum_hoe",
            () -> new HoeItem(ModTiers.ALUMINUM_TIER,1,2f,
                    new Item.Properties().tab(ModCreativeModeTab.EMPYREAN_TAB)));

    public static final RegistryObject<Item> ALUMINUM_AXE = ITEMS.register("aluminum_axe",
            () -> new AxeItem(ModTiers.ALUMINUM_TIER,7,3.2f,
                    new Item.Properties().tab(ModCreativeModeTab.EMPYREAN_TAB)));

    public static final RegistryObject<Item> ALUMINUM_PICKAXE = ITEMS.register("aluminum_pickaxe",
            () -> new PickaxeItem(ModTiers.ALUMINUM_TIER,1,2,
                    new Item.Properties().tab(ModCreativeModeTab.EMPYREAN_TAB)));

    //Armor
    public static final RegistryObject<Item> ALUMINUM_HELMET = ITEMS.register("aluminum_helmet",
            () -> new ArmorItem(ModArmorMaterials.ALUMINUM,EquipmentSlot.HEAD,
                    new Item.Properties().tab(ModCreativeModeTab.EMPYREAN_TAB)));

    public static final RegistryObject<Item> ALUMINUM_CHESTPLATE = ITEMS.register("aluminum_chestplate",
            () -> new ArmorItem(ModArmorMaterials.ALUMINUM,EquipmentSlot.CHEST,
                    new Item.Properties().tab(ModCreativeModeTab.EMPYREAN_TAB)));

    public static final RegistryObject<Item> ALUMINUM_LEGGINGS = ITEMS.register("aluminum_leggings",
            () -> new ArmorItem(ModArmorMaterials.ALUMINUM,EquipmentSlot.LEGS,
                    new Item.Properties().tab(ModCreativeModeTab.EMPYREAN_TAB)));

    public static final RegistryObject<Item> ALUMINUM_BOOTS = ITEMS.register("aluminum_boots",
            () -> new ArmorItem(ModArmorMaterials.ALUMINUM,EquipmentSlot.FEET,
                    new Item.Properties().tab(ModCreativeModeTab.EMPYREAN_TAB)));
    //------------------------------------------------------------------------------------------------------------------
    //Adamantite Items
    //Adamantite Pickaxe
    public static final RegistryObject<Item> ADAMANTITE_PICKAXE = ITEMS.register("adamantite_pickaxe",
            () -> new PickaxeItem(ModTiers.ADAMANTITE_TIER,4,4f,
                    new Item.Properties().tab(ModCreativeModeTab.EMPYREAN_TAB)));

    //Adamantite Axe
    public static final RegistryObject<Item> ADAMANTITE_AXE = ITEMS.register("adamantite_axe",
            () -> new AxeItem(ModTiers.ADAMANTITE_TIER,4,4f,
                    new Item.Properties().tab(ModCreativeModeTab.EMPYREAN_TAB)));

    //Adamantite Hoe
    public static final RegistryObject<Item> ADAMANTITE_HOE = ITEMS.register("adamantite_hoe",
            () -> new HoeItem(ModTiers.ADAMANTITE_TIER,4,4,
                    new Item.Properties().tab(ModCreativeModeTab.EMPYREAN_TAB)));

    //Adamantite Shovel
    public static final RegistryObject<Item> ADAMANTITE_SHOVEL = ITEMS.register("adamantite_shovel",
            () -> new ShovelItem(ModTiers.ADAMANTITE_TIER,4,4f,
                    new Item.Properties().tab(ModCreativeModeTab.EMPYREAN_TAB)));

    //Adamantite Sword
    public static final RegistryObject<Item> ADAMANTITE_SWORD = ITEMS.register("adamantite_sword",
            () -> new SwordItem(ModTiers.ADAMANTITE_TIER,4,5f,
                    new Item.Properties().tab(ModCreativeModeTab.EMPYREAN_TAB)));

    //Adamantite Helmet
    public static final RegistryObject<Item> ADAMANTITE_HELMET = ITEMS.register("adamantite_helmet",
            () -> new ArmorItem(ModArmorMaterials.ADAMANTITE, EquipmentSlot.HEAD,
                    new Item.Properties().tab(ModCreativeModeTab.EMPYREAN_TAB)));

    //Adamantite Chestplate
    public static final RegistryObject<Item> ADAMANTITE_CHESTPLATE = ITEMS.register("adamantite_chestplate",
            () -> new ArmorItem(ModArmorMaterials.ADAMANTITE,EquipmentSlot.CHEST,
                    new Item.Properties().tab(ModCreativeModeTab.EMPYREAN_TAB)));

    //Adamantite Leggings
    public static final RegistryObject<Item> ADAMANTITE_LEGGINGS = ITEMS.register("adamantite_leggings",
            () -> new ArmorItem(ModArmorMaterials.ADAMANTITE,EquipmentSlot.LEGS,
                    new Item.Properties().tab(ModCreativeModeTab.EMPYREAN_TAB)));

    //Adamantite Boots
    public static final RegistryObject<Item> ADAMANTITE_BOOTS = ITEMS.register("adamantite_boots",
            () -> new ArmorItem(ModArmorMaterials.ADAMANTITE,EquipmentSlot.FEET,
                    new Item.Properties().tab(ModCreativeModeTab.EMPYREAN_TAB)));

    //------------------------------------------------------------------------------------------------------------------


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
