package net.caballerosupreme.empyrean_ores.world.feature;


import net.caballerosupreme.empyrean_ores.block.ModBlocks;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;


import java.util.List;

import static net.minecraft.data.worldgen.features.OreFeatures.STONE_ORE_REPLACEABLES;

public class ModConfiguredFeatures {
    //New Replaceable block tag
    //Endstone Ore Replaceables
    //public static final RuleTest END_STONE_ORE_REPLACEABLES = new BlockMatchTest(Blocks.END_STONE);
    //ORE TARGET LISTS
    public static final List<OreConfiguration.TargetBlockState> ORE_ALUMINUM_TARGET_LIST =
            List.of(OreConfiguration.target(STONE_ORE_REPLACEABLES, ModBlocks.ALUMINUM_ORE.get().defaultBlockState()));

    public static final List<OreConfiguration.TargetBlockState> ORE_RUBY_TARGET_LIST =
                List.of(OreConfiguration.target(STONE_ORE_REPLACEABLES, ModBlocks.RUBY_ORE.get().defaultBlockState()));

    public static final List<OreConfiguration.TargetBlockState> ORE_SAPPHIRE_TARGET_LIST =
                List.of(OreConfiguration.target(STONE_ORE_REPLACEABLES, ModBlocks.SAPPHIRE_ORE.get().defaultBlockState()));

    public static final List<OreConfiguration.TargetBlockState> ORE_OPAL_TARGET_LIST =
                List.of(OreConfiguration.target(STONE_ORE_REPLACEABLES, ModBlocks.OPAL_ORE.get().defaultBlockState()));

    public static final List<OreConfiguration.TargetBlockState> ORE_TITANIUM_TARGET_LIST =
                List.of(OreConfiguration.target(STONE_ORE_REPLACEABLES, ModBlocks.TITANIUM_ORE.get().defaultBlockState()));

    public static final List<OreConfiguration.TargetBlockState> ORE_TUNGSTEN_TARGET_LIST =
                List.of(OreConfiguration.target(STONE_ORE_REPLACEABLES, ModBlocks.TUNGSTEN_ORE.get().defaultBlockState()));

    public static final List<OreConfiguration.TargetBlockState> ORE_CITRINE_TARGET_LIST =
                List.of(OreConfiguration.target(STONE_ORE_REPLACEABLES, ModBlocks.CITRINE_ORE.get().defaultBlockState()));

    public static final List<OreConfiguration.TargetBlockState> ORE_TOPAZ_TARGET_LIST =
                List.of(OreConfiguration.target(STONE_ORE_REPLACEABLES, ModBlocks.TOPAZ_ORE.get().defaultBlockState()));

    public static final List<OreConfiguration.TargetBlockState> ORE_ZIRCON_TARGET_LIST =
                List.of(OreConfiguration.target(STONE_ORE_REPLACEABLES, ModBlocks.ZIRCON_ORE.get().defaultBlockState()));

    //Configured Features registration
    //Aluminum
    public static final ConfiguredFeature<?, ?> ALUMINUM_CONFIGURED_FEATURE =
            FeatureUtils.register("aluminum_ore", Feature.ORE.configured(new OreConfiguration(ORE_ALUMINUM_TARGET_LIST, 5)));
                                                                                                            //This number is the vein size

    //Ruby
    public static final ConfiguredFeature<?, ?> RUBY_CONFIGURED_FEATURE =
            FeatureUtils.register("ruby_ore", Feature.ORE.configured(new OreConfiguration(ORE_RUBY_TARGET_LIST, 7)));
                                                                                                            //This number is the vein size

    //Sapphire
    public static final ConfiguredFeature<?, ?> SAPPHIRE_CONFIGURED_FEATURE =
            FeatureUtils.register("sapphire_ore", Feature.ORE.configured(new OreConfiguration(ORE_SAPPHIRE_TARGET_LIST, 5)));
                                                                                                            //This number is the vein size

    //Opal
    public static final ConfiguredFeature<?, ?> OPAL_CONFIGURED_FEATURE =
            FeatureUtils.register("opal_ore", Feature.ORE.configured(new OreConfiguration(ORE_OPAL_TARGET_LIST, 3)));
                                                                                                            //This number is the vein size

    //Titanium
    public static final ConfiguredFeature<?, ?> TITANIUM_CONFIGURED_FEATURE =
            FeatureUtils.register("titanium_ore", Feature.ORE.configured(new OreConfiguration(ORE_TITANIUM_TARGET_LIST, 7)));
                                                                                                            //This number is the vein size

    //Tungsten
    public static final ConfiguredFeature<?, ?> TUNGSTEN_CONFIGURED_FEATURE =
            FeatureUtils.register("tungsten_ore", Feature.ORE.configured(new OreConfiguration(ORE_TUNGSTEN_TARGET_LIST, 7)));
                                                                                                            //This number is the vein size

    //Citrine
    public static final ConfiguredFeature<?, ?> CITRINE_CONFIGURED_FEATURE =
            FeatureUtils.register("citrine_ore", Feature.ORE.configured(new OreConfiguration(ORE_CITRINE_TARGET_LIST, 5)));
                                                                                                            //This number is the vein size

    //Topaz
    public static final ConfiguredFeature<?, ?> TOPAZ_CONFIGURED_FEATURE =
            FeatureUtils.register("topaz_ore", Feature.ORE.configured(new OreConfiguration(ORE_TOPAZ_TARGET_LIST, 5)));
                                                                                                            //This number is the vein size

    //Zircon
    public static final ConfiguredFeature<?, ?> ZIRCON_CONFIGURED_FEATURE =
            FeatureUtils.register("zircon_ore", Feature.ORE.configured(new OreConfiguration(ORE_ZIRCON_TARGET_LIST, 5)));
                                                                                                            //This number is the vein size


}
