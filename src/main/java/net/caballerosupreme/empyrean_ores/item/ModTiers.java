package net.caballerosupreme.empyrean_ores.item;

import net.caballerosupreme.empyrean_ores.EmpyreanOres;
import net.caballerosupreme.empyrean_ores.item.ModItems;
import net.caballerosupreme.empyrean_ores.item.util.ModTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;

import java.util.List;

public class ModTiers {

    //Steel properties
    public static final Tier STEEL_TIER = TierSortingRegistry.registerTier(
            new ForgeTier(2, 800, 8.0f, 2.0f, 15
                    , ModTags.Blocks.STEEL_TIER_TAG,()->Ingredient.of(ModItems.HIGH_CARBON_STEEL_INGOT.get())),
            new ResourceLocation(EmpyreanOres.MOD_ID, "steel_tier"), List.of(Tiers.IRON), List.of(Tiers.DIAMOND));
    //These multiply with the ModItem class modifiers
}
