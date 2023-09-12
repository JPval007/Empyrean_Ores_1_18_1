package net.caballerosupreme.empyrean_ores.datagen;

import net.caballerosupreme.empyrean_ores.EmpyreanOres;
import net.caballerosupreme.empyrean_ores.block.ModBlocks;
import net.caballerosupreme.empyrean_ores.item.ModItems;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.RegistryObject;

public class ModBlocksStateProvider extends BlockStateProvider {
    public ModBlocksStateProvider(DataGenerator gen, ExistingFileHelper exFileHelper) {
        super(gen, EmpyreanOres.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        simpleBlock(ModBlocks.RUBY_BLOCK.get());
        simpleBlock(ModBlocks.RUBY_ORE.get());
        simpleBlockItem(ModBlocks.RUBY_BLOCK.get(), models().cubeAll("ruby_block",new ResourceLocation("empyrean_ores:block/ruby_block")));
        simpleBlockItem(ModBlocks.RUBY_ORE.get(), models().cubeAll("ruby_ore",new ResourceLocation("empyrean_ores:block/ruby_ore")));

        simpleBlock(ModBlocks.ALUMINUM_BLOCK.get());
        simpleBlock(ModBlocks.ALUMINUM_ORE.get());
        simpleBlockItem(ModBlocks.ALUMINUM_BLOCK.get(), models().cubeAll("aluminum_block",new ResourceLocation("empyrean_ores:block/aluminum_block")));
        simpleBlockItem(ModBlocks.ALUMINUM_ORE.get(), models().cubeAll("aluminum_ore",new ResourceLocation("empyrean_ores:block/aluminum_ore")));

        simpleBlock(ModBlocks.CITRINE_BLOCK.get());
        simpleBlock(ModBlocks.CITRINE_ORE.get());
        simpleBlockItem(ModBlocks.CITRINE_BLOCK.get(), models().cubeAll("citrine_block",new ResourceLocation("empyrean_ores:block/citrine_block")));
        simpleBlockItem(ModBlocks.CITRINE_ORE.get(), models().cubeAll("citrine_ore",new ResourceLocation("empyrean_ores:block/citrine_ore")));

        simpleBlock(ModBlocks.SAPPHIRE_BLOCK.get());
        simpleBlock(ModBlocks.SAPPHIRE_ORE.get());
        simpleBlockItem(ModBlocks.SAPPHIRE_BLOCK.get(), models().cubeAll("sapphire_block",new ResourceLocation("empyrean_ores:block/sapphire_block")));
        simpleBlockItem(ModBlocks.SAPPHIRE_ORE.get(), models().cubeAll("sapphire_ore",new ResourceLocation("empyrean_ores:block/sapphire_ore")));

        simpleBlock(ModBlocks.OPAL_BLOCK.get());
        simpleBlock(ModBlocks.OPAL_ORE.get());
        simpleBlockItem(ModBlocks.OPAL_BLOCK.get(), models().cubeAll("opal_block",new ResourceLocation("empyrean_ores:block/opal_block")));
        simpleBlockItem(ModBlocks.OPAL_ORE.get(), models().cubeAll("opal_ore",new ResourceLocation("empyrean_ores:block/opal_ore")));

        simpleBlock(ModBlocks.TITANIUM_BLOCK.get());
        simpleBlock(ModBlocks.TITANIUM_ORE.get());
        simpleBlockItem(ModBlocks.TITANIUM_BLOCK.get(), models().cubeAll("titanium_block",new ResourceLocation("empyrean_ores:block/titanium_block")));
        simpleBlockItem(ModBlocks.TITANIUM_ORE.get(), models().cubeAll("titanium_ore",new ResourceLocation("empyrean_ores:block/titanium_ore")));

        simpleBlock(ModBlocks.TOPAZ_BLOCK.get());
        simpleBlock(ModBlocks.TOPAZ_ORE.get());
        simpleBlockItem(ModBlocks.TOPAZ_BLOCK.get(), models().cubeAll("topaz_block",new ResourceLocation("empyrean_ores:block/topaz_block")));
        simpleBlockItem(ModBlocks.TOPAZ_ORE.get(), models().cubeAll("topaz_ore",new ResourceLocation("empyrean_ores:block/topaz_ore")));

        simpleBlock(ModBlocks.TUNGSTEN_BLOCK.get());
        simpleBlock(ModBlocks.TUNGSTEN_ORE.get());
        simpleBlockItem(ModBlocks.TUNGSTEN_BLOCK.get(), models().cubeAll("tungsten_block",new ResourceLocation("empyrean_ores:block/tungsten_block")));
        simpleBlockItem(ModBlocks.TUNGSTEN_ORE.get(), models().cubeAll("tungsten_ore",new ResourceLocation("empyrean_ores:block/tungsten_ore")));

        simpleBlock(ModBlocks.ZIRCON_BLOCK.get());
        simpleBlock(ModBlocks.ZIRCON_ORE.get());
        simpleBlockItem(ModBlocks.ZIRCON_BLOCK.get(), models().cubeAll("zircon_block",new ResourceLocation("empyrean_ores:block/zircon_block")));
        simpleBlockItem(ModBlocks.ZIRCON_ORE.get(), models().cubeAll("zircon_ore",new ResourceLocation("empyrean_ores:block/zircon_ore")));

        simpleBlock(ModBlocks.ADAMITE_BLOCK.get());
        simpleBlock(ModBlocks.ADAMANTITE_BLOCK.get());
        simpleBlockItem(ModBlocks.ADAMITE_BLOCK.get(), models().cubeAll("adamite_block",new ResourceLocation("empyrean_ores:block/adamite_block")));
        simpleBlockItem(ModBlocks.ADAMANTITE_BLOCK.get(), models().cubeAll("adamantite_block",new ResourceLocation("empyrean_ores:block/adamantite_block")));

    }
}
