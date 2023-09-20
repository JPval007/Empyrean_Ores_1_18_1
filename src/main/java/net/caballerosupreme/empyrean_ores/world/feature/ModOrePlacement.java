package net.caballerosupreme.empyrean_ores.world.feature;

import net.minecraft.world.level.levelgen.placement.*;

import java.util.List;

public class ModOrePlacement {
    //This is a helper Class to use this methods I guess for organization sake
    //In my next mod I could just use them in the ModPlacedFeatures class

    //Helper Methods for placing ores in the world (taken from OrePlacements.java)
    //Super important to make them public so you can use them outside the class
    public static List<PlacementModifier> orePlacement(PlacementModifier modifier, PlacementModifier modifier1) {
        return List.of(modifier, InSquarePlacement.spread(), modifier1, BiomeFilter.biome());
    }

    public static List<PlacementModifier> commonOrePlacement(int count, PlacementModifier heightRange) {
        return orePlacement(CountPlacement.of(count), heightRange);
    }

    public static List<PlacementModifier> rareOrePlacement(int OnceEveryBlocks, PlacementModifier heightRange) {
        return orePlacement(RarityFilter.onAverageOnceEvery(OnceEveryBlocks), heightRange);


    }
}
