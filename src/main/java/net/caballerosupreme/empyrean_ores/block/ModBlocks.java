package net.caballerosupreme.empyrean_ores.block;

import net.caballerosupreme.empyrean_ores.EmpyreanOres;
import net.caballerosupreme.empyrean_ores.item.ModCreativeModeTab;
import net.caballerosupreme.empyrean_ores.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, EmpyreanOres.MOD_ID);

    //Put your blocks here
    //ALUMINUM
    public static final RegistryObject<Block> ALUMINUM_BLOCK = registerBlock("aluminum_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(3f,4f).requiresCorrectToolForDrops()), ModCreativeModeTab.EMPYREAN_TAB);

    public static final RegistryObject<Block> ALUMINUM_ORE = registerBlock("aluminum_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f,3f).requiresCorrectToolForDrops()), ModCreativeModeTab.EMPYREAN_TAB);

    //STEEL
    public static final RegistryObject<Block> LOW_CARBON_STEEL_BLOCK = registerBlock("low_carbon_steel_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
            .strength(3f,7f).requiresCorrectToolForDrops()), ModCreativeModeTab.EMPYREAN_TAB);

    public static final RegistryObject<Block> MID_CARBON_STEEL_BLOCK = registerBlock("mid_carbon_steel_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(5f,7f).requiresCorrectToolForDrops()), ModCreativeModeTab.EMPYREAN_TAB);

    public static final RegistryObject<Block> HIGH_CARBON_STEEL_BLOCK = registerBlock("high_carbon_steel_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(7f,9f).requiresCorrectToolForDrops()), ModCreativeModeTab.EMPYREAN_TAB);

    //RUBY
    public static final RegistryObject<Block> RUBY_BLOCK = registerBlock("ruby_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(5f,7f).requiresCorrectToolForDrops()), ModCreativeModeTab.EMPYREAN_TAB);

    public static final RegistryObject<Block> RUBY_ORE = registerBlock("ruby_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(3f,3f).requiresCorrectToolForDrops()), ModCreativeModeTab.EMPYREAN_TAB);

    //Citrine
    public static final RegistryObject<Block> CITRINE_BLOCK = registerBlock("citrine_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(4f,5f).requiresCorrectToolForDrops()), ModCreativeModeTab.EMPYREAN_TAB);

    public static final RegistryObject<Block> CITRINE_ORE = registerBlock("citrine_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(3f,3f).requiresCorrectToolForDrops()), ModCreativeModeTab.EMPYREAN_TAB);

    //SAPPHIRE
    public static final RegistryObject<Block> SAPPHIRE_BLOCK = registerBlock("sapphire_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(7f,10f).requiresCorrectToolForDrops()), ModCreativeModeTab.EMPYREAN_TAB);

    public static final RegistryObject<Block> SAPPHIRE_ORE = registerBlock("sapphire_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(3f,3f).requiresCorrectToolForDrops()), ModCreativeModeTab.EMPYREAN_TAB);

    //OPAL
    public static final RegistryObject<Block> OPAL_BLOCK = registerBlock("opal_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(8f,13f).requiresCorrectToolForDrops()), ModCreativeModeTab.EMPYREAN_TAB);

    public static final RegistryObject<Block> OPAL_ORE = registerBlock("opal_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(5f,7f).requiresCorrectToolForDrops()), ModCreativeModeTab.EMPYREAN_TAB);

    //TITANIUM
    public static final RegistryObject<Block> TITANIUM_BLOCK = registerBlock("titanium_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(5f,6f).requiresCorrectToolForDrops()), ModCreativeModeTab.EMPYREAN_TAB);

    public static final RegistryObject<Block> TITANIUM_ORE = registerBlock("titanium_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(3f,3f).requiresCorrectToolForDrops()), ModCreativeModeTab.EMPYREAN_TAB);

    //TOPAZ
    public static final RegistryObject<Block> TOPAZ_BLOCK = registerBlock("topaz_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(4f,5f).requiresCorrectToolForDrops()), ModCreativeModeTab.EMPYREAN_TAB);

    public static final RegistryObject<Block> TOPAZ_ORE = registerBlock("topaz_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(3f,3f).requiresCorrectToolForDrops()), ModCreativeModeTab.EMPYREAN_TAB);

    //TUNGSTEN
    public static final RegistryObject<Block> TUNGSTEN_BLOCK = registerBlock("tungsten_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(6f,15f).requiresCorrectToolForDrops()), ModCreativeModeTab.EMPYREAN_TAB);

    public static final RegistryObject<Block> TUNGSTEN_ORE = registerBlock("tungsten_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(3f,5f).requiresCorrectToolForDrops()), ModCreativeModeTab.EMPYREAN_TAB);

    //ZIRCON
    public static final RegistryObject<Block> ZIRCON_BLOCK = registerBlock("zircon_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(4f,5f).requiresCorrectToolForDrops()), ModCreativeModeTab.EMPYREAN_TAB);

    public static final RegistryObject<Block> ZIRCON_ORE = registerBlock("zircon_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(3f,4f).requiresCorrectToolForDrops()), ModCreativeModeTab.EMPYREAN_TAB);

    //ADAMITE
    public static final RegistryObject<Block> ADAMITE_BLOCK = registerBlock("adamite_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(4f,16f).requiresCorrectToolForDrops()), ModCreativeModeTab.EMPYREAN_TAB);

    //ADAMANTITE
    public static final RegistryObject<Block> ADAMANTITE_BLOCK = registerBlock("adamantite_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(6f,17f).requiresCorrectToolForDrops()), ModCreativeModeTab.EMPYREAN_TAB);


    //Register helper methods
    private static <T extends Block>RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab){

        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    //Helper methods (item texture)
    private static <T extends Block>RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block,
                                                                           CreativeModeTab tab){
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(tab)));
    }

    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }

}
