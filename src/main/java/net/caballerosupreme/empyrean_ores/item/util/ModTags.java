package net.caballerosupreme.empyrean_ores.item.util;

import net.caballerosupreme.empyrean_ores.EmpyreanOres;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.Tags;

public class ModTags {

    //Block Tags
    public static class Blocks {
        //Steel blocks tag example
        public static final Tags.IOptionalNamedTag<Block> STEEL_BLOCKS =
                tag("steel_blocks");

        //Steel Tier Tag
        public static final Tags.IOptionalNamedTag<Block> STEEL_TIER_TAG =
                tag("needs_steel_tool");

        //Aluminum Tier Tag
                public static final Tags.IOptionalNamedTag<Block> ALUMINUM_TIER_TAG =
                        tag("needs_aluminum_tool");

        //Sapphire Tier Tag
                public static final Tags.IOptionalNamedTag<Block> SAPPHIRE_TIER_TAG =
                        tag("needs_sapphire_tool");

        //Ruby Tier Tag
                public static final Tags.IOptionalNamedTag<Block> RUBY_TIER_TAG =
                        tag("needs_ruby_tool");

        //Opal Tier Tag
                public static final Tags.IOptionalNamedTag<Block> OPAL_TIER_TAG =
                        tag("needs_opal_tool");

        //Tungsten Tier Tag
                public static final Tags.IOptionalNamedTag<Block> TUNGSTEN_TIER_TAG =
                        tag("needs_tungsten_tool");

        //Adamantite Tier Tag
                public static final Tags.IOptionalNamedTag<Block> ADAMANTITE_TIER_TAG =
                        tag("needs_adamantite_tool");


        //Tag helper methods
        private static Tags.IOptionalNamedTag<Block> tag(String name) {

            return BlockTags.createOptional(new ResourceLocation(EmpyreanOres.MOD_ID, name));
        }

        private static Tags.IOptionalNamedTag<Block> forgetag(String name) {

            return BlockTags.createOptional(new ResourceLocation("forge", name));
        }

    }

    //Item Tags
    public static class Items {

        //Put your item tags here

        //Example steel ingot tag
        public static final Tags.IOptionalNamedTag<Item> STEEL_INGOTS =
                tag("steel_ingots");


        //Helper Methods
        private static Tags.IOptionalNamedTag<Item> tag(String name) {

            return ItemTags.createOptional(new ResourceLocation(EmpyreanOres.MOD_ID, name));
        }

        private static Tags.IOptionalNamedTag<Item> forgetag(String name) {

            return ItemTags.createOptional(new ResourceLocation("forge", name));
        }

    }

    //Biome Tags (worldgen)

    //ModTier Tags

}
