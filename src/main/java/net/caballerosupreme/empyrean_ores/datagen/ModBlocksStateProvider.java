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

    }
}
