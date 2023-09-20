package net.caballerosupreme.empyrean_ores.world.feature;


import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

import static net.caballerosupreme.empyrean_ores.world.feature.ModOrePlacement.*;
//The * is to import everything

public class ModPlacedFeatures {
    //Here we put the placement of the Ores
                                                                                                                        //The number is veins per chunk
    public static final PlacedFeature ALUMINUM_ORE_PLACEMENT =
            PlacementUtils.register("aluminum_ore_placed", ModConfiguredFeatures.ALUMINUM_CONFIGURED_FEATURE.placed(commonOrePlacement(50,
                    HeightRangePlacement.uniform(VerticalAnchor.absolute(50),VerticalAnchor.absolute(140)))));
                                                                        //Bottom                            //Top
                                                                                                                        //The number is veins per chunk
    public static final PlacedFeature RUBY_ORE_PLACEMENT =
            PlacementUtils.register("ruby_ore_placed", ModConfiguredFeatures.RUBY_CONFIGURED_FEATURE.placed(commonOrePlacement(50,
                    HeightRangePlacement.uniform(VerticalAnchor.absolute(35),VerticalAnchor.absolute(80)))));
                                                                        //Bottom                            //Top
    public static final PlacedFeature SAPPHIRE_ORE_PLACEMENT =
            PlacementUtils.register("sapphire_ore_placed", ModConfiguredFeatures.SAPPHIRE_CONFIGURED_FEATURE.placed(commonOrePlacement(55,
                    HeightRangePlacement.uniform(VerticalAnchor.absolute(80),VerticalAnchor.absolute(180)))));
                                                                        //Bottom                            //Top
    public static final PlacedFeature OPAL_ORE_PLACEMENT =
            PlacementUtils.register("opal_ore_placed", ModConfiguredFeatures.OPAL_CONFIGURED_FEATURE.placed(commonOrePlacement(24,
                    HeightRangePlacement.uniform(VerticalAnchor.absolute(100),VerticalAnchor.absolute(180)))));
                                                                        //Bottom                            //Top
    public static final PlacedFeature TITANIUM_ORE_PLACEMENT =
            PlacementUtils.register("titanium_ore_placed", ModConfiguredFeatures.TITANIUM_CONFIGURED_FEATURE.placed(commonOrePlacement(24,
                    HeightRangePlacement.uniform(VerticalAnchor.absolute(50),VerticalAnchor.absolute(110)))));
   public static final PlacedFeature TUNGSTEN_ORE_PLACEMENT =
            PlacementUtils.register("titanium_ore_placed", ModConfiguredFeatures.TUNGSTEN_CONFIGURED_FEATURE.placed(commonOrePlacement(24,
                    HeightRangePlacement.uniform(VerticalAnchor.absolute(50),VerticalAnchor.absolute(110)))));

    public static final PlacedFeature CITRINE_ORE_PLACEMENT =
        PlacementUtils.register("citrine_ore_placed", ModConfiguredFeatures.CITRINE_CONFIGURED_FEATURE.placed(commonOrePlacement(18,
                HeightRangePlacement.uniform(VerticalAnchor.absolute(55),VerticalAnchor.absolute(105)))));
                                                                        //Bottom                            //Top
   public static final PlacedFeature TOPAZ_ORE_PLACEMENT =
        PlacementUtils.register("topaz_ore_placed", ModConfiguredFeatures.TOPAZ_CONFIGURED_FEATURE.placed(commonOrePlacement(12,
                HeightRangePlacement.uniform(VerticalAnchor.absolute(40),VerticalAnchor.absolute(75)))));
                                                                    //Bottom                            //Top
   public static final PlacedFeature ZIRCON_ORE_PLACEMENT =
        PlacementUtils.register("zircon_ore_placed", ModConfiguredFeatures.ZIRCON_CONFIGURED_FEATURE.placed(commonOrePlacement(10,
                HeightRangePlacement.uniform(VerticalAnchor.absolute(60),VerticalAnchor.absolute(100)))));
                                                                    //Bottom                            //Top


}
