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
    //Aluminum Tier
    public static final Tier ALUMINUM_TIER = TierSortingRegistry.registerTier(
            new ForgeTier(Tiers.STONE.getLevel(), 200, 4.0F, 1.0F, 8
                    , ModTags.Blocks.ALUMINUM_TIER_TAG, ()->Ingredient.of( ModItems.ALUMINUM_INGOT.get())),
            new ResourceLocation(EmpyreanOres.MOD_ID, "aluminum_tier"),List.of(Tiers.STONE), List.of(Tiers.IRON));

    //Steel properties
    public static final Tier STEEL_TIER = TierSortingRegistry.registerTier(
            new ForgeTier(2, 800, 8.0f, 2.0f, 15
                    , ModTags.Blocks.STEEL_TIER_TAG,()->Ingredient.of(ModItems.HIGH_CARBON_STEEL_INGOT.get())),
            new ResourceLocation(EmpyreanOres.MOD_ID, "steel_tier"), List.of(Tiers.IRON), List.of(Tiers.DIAMOND));

    //Sapphire Tier
    public static final Tier SAPPHIRE_TIER = TierSortingRegistry.registerTier(
            new ForgeTier(Tiers.NETHERITE.getLevel(), 2200, 9.0f, 4.0f, 15
                    , ModTags.Blocks.SAPPHIRE_TIER_TAG,()->Ingredient.of(ModItems.SAPPHIRE.get())),
            new ResourceLocation(EmpyreanOres.MOD_ID, "sapphire_tier"), List.of(Tiers.DIAMOND), List.of(Tiers.NETHERITE));

    //Opal Tier
    public static final Tier OPAL_TIER = TierSortingRegistry.registerTier(
            new ForgeTier(Tiers.NETHERITE.getLevel(), 2600, 11.0f, 6.0f, 18
                    , ModTags.Blocks.OPAL_TIER_TAG,()->Ingredient.of(ModItems.OPAL.get())),
            new ResourceLocation(EmpyreanOres.MOD_ID, "opal_tier"), List.of(Tiers.NETHERITE), List.of());

    //Tungsten Tier
    public static final Tier TUNGSTEN_TIER = TierSortingRegistry.registerTier(
            new ForgeTier(5, 2800, 1.0f, 10.0f, 20
                    , ModTags.Blocks.TUNGSTEN_TIER_TAG,()->Ingredient.of(ModItems.TUNGSTEN_INGOT.get())),
            new ResourceLocation(EmpyreanOres.MOD_ID, "tungsten_tier"), List.of(ModTiers.OPAL_TIER), List.of());

    //Adamantite Tier
    public static final Tier ADAMANTITE_TIER = TierSortingRegistry.registerTier(
            new ForgeTier(5, 3500, 20.0f, 15.0f, 30
                    , ModTags.Blocks.ADAMANTITE_TIER_TAG,()->Ingredient.of(ModItems.ADAMANTITE_INGOT.get())),
            new ResourceLocation(EmpyreanOres.MOD_ID, "adamantite_tier"), List.of(ModTiers.TUNGSTEN_TIER), List.of());

    //These multiply with the ModItem class modifiers
}
