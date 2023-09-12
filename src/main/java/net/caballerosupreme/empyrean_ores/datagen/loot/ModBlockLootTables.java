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

        this.dropSelf(ModBlocks.CITRINE_BLOCK.get());
        this.add(ModBlocks.CITRINE_ORE.get(), (block) -> createOreDrop(ModBlocks.CITRINE_ORE.get(), ModItems.CITRINE.get()));

        this.dropSelf(ModBlocks.SAPPHIRE_BLOCK.get());
        this.add(ModBlocks.SAPPHIRE_ORE.get(), (block) -> createOreDrop(ModBlocks.SAPPHIRE_ORE.get(), ModItems.SAPPHIRE.get()));

        this.dropSelf(ModBlocks.OPAL_BLOCK.get());
        this.add(ModBlocks.OPAL_ORE.get(), (block) -> createOreDrop(ModBlocks.OPAL_ORE.get(), ModItems.OPAL.get()));

        this.dropSelf(ModBlocks.TITANIUM_BLOCK.get());
        this.add(ModBlocks.TITANIUM_ORE.get(), (block) -> createOreDrop(ModBlocks.TITANIUM_ORE.get(), ModItems.RAW_TITANIUM.get()));

        this.dropSelf(ModBlocks.TOPAZ_BLOCK.get());
        this.add(ModBlocks.TOPAZ_ORE.get(), (block) -> createOreDrop(ModBlocks.TOPAZ_ORE.get(), ModItems.TOPAZ.get()));

        this.dropSelf(ModBlocks.ZIRCON_BLOCK.get());
        this.add(ModBlocks.ZIRCON_ORE.get(), (block) -> createOreDrop(ModBlocks.ZIRCON_ORE.get(), ModItems.ZIRCON.get()));

        this.dropSelf(ModBlocks.TUNGSTEN_BLOCK.get());
        this.add(ModBlocks.TUNGSTEN_ORE.get(), (block) -> createOreDrop(ModBlocks.TUNGSTEN_ORE.get(), ModItems.RAW_TUNGSTEN.get()));

        this.dropSelf(ModBlocks.ADAMITE_BLOCK.get());
        this.dropSelf(ModBlocks.ADAMANTITE_BLOCK.get());


    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
