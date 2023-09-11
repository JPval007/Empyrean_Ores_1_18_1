package net.caballerosupreme.empyrean_ores.datagen.loot;

import net.caballerosupreme.empyrean_ores.block.ModBlocks;
import net.caballerosupreme.empyrean_ores.item.ModItems;
import net.minecraft.data.loot.BlockLoot;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockLootTables extends BlockLoot {
    @Override
    protected void addTables() {
        this.dropSelf(ModBlocks.HIGH_CARBON_STEEL_BLOCK.get());
        this.dropSelf(ModBlocks.MID_CARBON_STEEL_BLOCK.get());
        this.dropSelf(ModBlocks.LOW_CARBON_STEEL_BLOCK.get());
        this.dropSelf(ModBlocks.RUBY_BLOCK.get());
        this.add(ModBlocks.RUBY_ORE.get(), (block) -> createOreDrop(ModBlocks.RUBY_ORE.get(), ModItems.RUBY.get()));

        this.dropSelf(ModBlocks.ALUMINUM_BLOCK.get());
        this.add(ModBlocks.ALUMINUM_ORE.get(), (block) -> createOreDrop(ModBlocks.ALUMINUM_ORE.get(), ModItems.RAW_ALUMINUM.get()));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
