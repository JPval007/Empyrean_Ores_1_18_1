package net.caballerosupreme.empyrean_ores.world.gen;


import net.caballerosupreme.empyrean_ores.world.feature.ModConfiguredFeatures;
import net.caballerosupreme.empyrean_ores.world.feature.ModPlacedFeatures;
import net.minecraft.resources.ResourceKey;
import net.minecraft.sounds.Music;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.level.biome.*;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraftforge.event.world.BiomeLoadingEvent;

import java.util.List;
import java.util.function.Supplier;

public class ModOreGeneration {

    public static void generateOres(final BiomeLoadingEvent event) {
        //Ok so you can add every ore individually like SimpleOres2
        event.getGeneration().addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, ModPlacedFeatures.ALUMINUM_ORE_PLACEMENT); //Outside if loop to spawn everywhere
        //Or you can use a List for convenience like kaupenJoe
//        List<Supplier<PlacedFeature>> GeneratedOresList =
//                event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES);
//
//        GeneratedOresList.add((Supplier<PlacedFeature>) ModPlacedFeatures.ALUMINUM_ORE_PLACEMENT);

        //To spawn in a specific biome use an if

        if (event.getName().toString().contains(Biomes.TAIGA.location().toString()) |
                event.getName().toString().contains(Biomes.SNOWY_TAIGA.location().toString()) |
                event.getName().toString().contains(Biomes.OLD_GROWTH_PINE_TAIGA.location().toString()) |
                event.getName().toString().contains(Biomes.OLD_GROWTH_SPRUCE_TAIGA.location().toString()) ){
            event.getGeneration().addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, ModPlacedFeatures.TOPAZ_ORE_PLACEMENT);
            event.getGeneration().addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, ModPlacedFeatures.TUNGSTEN_ORE_PLACEMENT);
            event.getGeneration().addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, ModPlacedFeatures.SAPPHIRE_ORE_PLACEMENT);

        }

//        if (event.getName().toString().contains(Biomes.OCEAN.location().toString()) |
//                event.getName().toString().contains(Biomes.COLD_OCEAN.location().toString()) |
//                event.getName().toString().contains(Biomes.DEEP_COLD_OCEAN.location().toString()) |
//                event.getName().toString().contains(Biomes.WARM_OCEAN.location().toString()) |
//                event.getName().toString().contains(Biomes.LUKEWARM_OCEAN.location().toString()) |
//                event.getName().toString().contains(Biomes.DEEP_LUKEWARM_OCEAN.location().toString()) ){
//            event.getGeneration().addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, ModPlacedFeatures.RUBY_ORE_PLACEMENT);
//
//        }
//
//        if (event.getName().toString().contains(Biomes.GROVE.location().toString()) |
//                event.getName().toString().contains(Biomes.SNOWY_SLOPES.location().toString()) |
//                event.getName().toString().contains(Biomes.JAGGED_PEAKS.location().toString()) |
//                event.getName().toString().contains(Biomes.FROZEN_PEAKS.location().toString()) |
//                event.getName().toString().contains(Biomes.STONY_PEAKS.location().toString()) |
//                event.getName().toString().contains(Biomes.DRIPSTONE_CAVES.location().toString()) ){
//            event.getGeneration().addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, ModPlacedFeatures.OPAL_ORE_PLACEMENT);
//            event.getGeneration().addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, ModPlacedFeatures.SAPPHIRE_ORE_PLACEMENT);
//
//        }
//
//        if (event.getName().toString().contains(Biomes.WINDSWEPT_FOREST.location().toString()) |
//                event.getName().toString().contains(Biomes.WINDSWEPT_HILLS.location().toString()) |
//                event.getName().toString().contains(Biomes.WINDSWEPT_GRAVELLY_HILLS.location().toString()) |
//                event.getName().toString().contains(Biomes.MEADOW.location().toString()) ){
//            event.getGeneration().addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, ModPlacedFeatures.SAPPHIRE_ORE_PLACEMENT);
//            event.getGeneration().addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, ModPlacedFeatures.TUNGSTEN_ORE_PLACEMENT);
//
//        }
//
//        if (event.getName().toString().contains(Biomes.BADLANDS.location().toString()) |
//                event.getName().toString().contains(Biomes.ERODED_BADLANDS.location().toString()) |
//                event.getName().toString().contains(Biomes.WOODED_BADLANDS.location().toString()) |
//                event.getName().toString().contains(Biomes.DESERT.location().toString()) ){
//            event.getGeneration().addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, ModPlacedFeatures.CITRINE_ORE_PLACEMENT);
//            event.getGeneration().addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, ModPlacedFeatures.TOPAZ_ORE_PLACEMENT);
//
//        }
//
//        if (event.getName().toString().contains(Biomes.RIVER.location().toString()) |
//                event.getName().toString().contains(Biomes.FROZEN_RIVER.location().toString()) |
//                event.getName().toString().contains(Biomes.FOREST.location().toString()) |
//                event.getName().toString().contains(Biomes.FLOWER_FOREST.location().toString()) |
//                event.getName().toString().contains(Biomes.FOREST.location().toString()) |
//                event.getName().toString().contains(Biomes.BIRCH_FOREST.location().toString()) |
//                event.getName().toString().contains(Biomes.OLD_GROWTH_BIRCH_FOREST.location().toString()) |
//                event.getName().toString().contains(Biomes.DARK_FOREST.location().toString()) ){
//            event.getGeneration().addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, ModPlacedFeatures.ZIRCON_ORE_PLACEMENT);
//
//        }
//
//        if (event.getName().toString().contains(Biomes.BEACH.location().toString()) |
//                event.getName().toString().contains(Biomes.SNOWY_BEACH.location().toString()) |
//                event.getName().toString().contains(Biomes.SNOWY_PLAINS.location().toString()) |
//                event.getName().toString().contains(Biomes.PLAINS.location().toString()) |
//                event.getName().toString().contains(Biomes.SUNFLOWER_PLAINS.location().toString()) |
//                event.getName().toString().contains(Biomes.MEADOW.location().toString()) ){
//            event.getGeneration().addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, ModPlacedFeatures.TITANIUM_ORE_PLACEMENT);
//
//        }





    }



}
