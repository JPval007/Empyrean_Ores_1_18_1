package net.caballerosupreme.empyrean_ores.datagen;

import net.caballerosupreme.empyrean_ores.block.ModBlocks;
import net.caballerosupreme.empyrean_ores.item.ModItems;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.data.recipes.ShapelessRecipeBuilder;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(DataGenerator pGenerator) {
        super(pGenerator);
    }

    @Override
    protected void buildCraftingRecipes(Consumer<FinishedRecipe> pFinishedRecipeConsumer) {


        ShapedRecipeBuilder.shaped(ModBlocks.HIGH_CARBON_STEEL_BLOCK.get(),1)
                .define('#', ModItems.HIGH_CARBON_STEEL_INGOT.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .unlockedBy("has_high_carbon_steel_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.HIGH_CARBON_STEEL_INGOT.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(ModBlocks.MID_CARBON_STEEL_BLOCK.get(),1)
                        .define('#', ModItems.MID_CARBON_STEEL_INGOT.get())
                        .pattern("###")
                        .pattern("###")
                        .pattern("###")
                        .unlockedBy("has_mid_carbon_steel_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                                .of(ModItems.MID_CARBON_STEEL_INGOT.get()).build()))
                        .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(ModBlocks.LOW_CARBON_STEEL_BLOCK.get(),1)
                .define('#', ModItems.LOW_CARBON_STEEL_INGOT.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .unlockedBy("has_low_carbon_steel_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.LOW_CARBON_STEEL_INGOT.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(ModItems.HIGH_CARBON_STEEL_INGOT.get(),9)
                .requires(ModBlocks.HIGH_CARBON_STEEL_BLOCK.get(),1)
                .unlockedBy("has_high_carbon_steel_block", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.HIGH_CARBON_STEEL_BLOCK.get()).build()))
                .save(pFinishedRecipeConsumer,"high_carbon_steel_ingot_from_block");

        ShapelessRecipeBuilder.shapeless(ModItems.MID_CARBON_STEEL_INGOT.get(),9)
                .requires(ModBlocks.MID_CARBON_STEEL_BLOCK.get(),1)
                .unlockedBy("has_mid_carbon_steel_block", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.MID_CARBON_STEEL_BLOCK.get()).build()))
                .save(pFinishedRecipeConsumer,"mid_carbon_steel_ingot_from_block");

        ShapelessRecipeBuilder.shapeless(ModItems.LOW_CARBON_STEEL_INGOT.get(),9)
                .requires(ModBlocks.LOW_CARBON_STEEL_BLOCK.get(),1)
                .unlockedBy("has_low_carbon_steel_block", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.LOW_CARBON_STEEL_BLOCK.get()).build()))
                .save(pFinishedRecipeConsumer,"low_carbon_steel_ingot_from_block");

        ShapelessRecipeBuilder.shapeless(ModItems.LOW_CARBON_STEEL_INGOT.get(),1)
                .requires(Items.IRON_INGOT,1)
                .requires(ItemTags.COALS)
                .unlockedBy("has_iron_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.IRON_INGOT).build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(ModItems.MID_CARBON_STEEL_INGOT.get(),1)
                .requires(Items.IRON_INGOT,1)
                .requires(ItemTags.COALS)
                .requires(ItemTags.COALS)
                .unlockedBy("has_iron_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.IRON_INGOT).build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(ModItems.HIGH_CARBON_STEEL_INGOT.get(),1)
                .requires(Items.IRON_INGOT,1)
                .requires(ItemTags.COALS)
                .requires(ItemTags.COALS)
                .requires(ItemTags.COALS)
                .unlockedBy("has_iron_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.IRON_INGOT).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(ModItems.STEEL_SWORD.get(),1)
                .define('#', ModItems.HIGH_CARBON_STEEL_INGOT.get())
                .define('E', Items.STICK)
                .pattern("#")
                .pattern("#")
                .pattern("E")
                .unlockedBy("has_high_carbon_steel_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.HIGH_CARBON_STEEL_INGOT.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(ModItems.STEEL_AXE.get(),1)
                .define('#', ModItems.HIGH_CARBON_STEEL_INGOT.get())
                .define('E', Items.STICK)
                .pattern("##")
                .pattern("E#")
                .pattern("E ")
                .unlockedBy("has_high_carbon_steel_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.HIGH_CARBON_STEEL_INGOT.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(ModItems.STEEL_HOE.get(),1)
                .define('#', ModItems.HIGH_CARBON_STEEL_INGOT.get())
                .define('E', Items.STICK)
                .pattern("##")
                .pattern("E ")
                .pattern("E ")
                .unlockedBy("has_high_carbon_steel_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.HIGH_CARBON_STEEL_INGOT.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(ModItems.STEEL_SHOVEL.get(),1)
                .define('#', ModItems.HIGH_CARBON_STEEL_INGOT.get())
                .define('E', Items.STICK)
                .pattern("#")
                .pattern("E")
                .pattern("E")
                .unlockedBy("has_high_carbon_steel_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.HIGH_CARBON_STEEL_INGOT.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(ModItems.STEEL_PICKAXE.get(),1)
                .define('#', ModItems.HIGH_CARBON_STEEL_INGOT.get())
                .define('E', Items.STICK)
                .pattern("###")
                .pattern(" E ")
                .pattern(" E ")
                .unlockedBy("has_high_carbon_steel_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.HIGH_CARBON_STEEL_INGOT.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(ModItems.STEEL_BOOTS.get(),1)
                .define('#', ModItems.MID_CARBON_STEEL_INGOT.get())
                .pattern("# #")
                .pattern("# #")
                .unlockedBy("has_high_carbon_steel_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.MID_CARBON_STEEL_INGOT.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(ModItems.STEEL_LEGGINGS.get(),1)
                .define('#', ModItems.MID_CARBON_STEEL_INGOT.get())
                .pattern("###")
                .pattern("# #")
                .pattern("# #")
                .unlockedBy("has_high_carbon_steel_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.MID_CARBON_STEEL_INGOT.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(ModItems.STEEL_CHESTPLATE.get(),1)
                .define('#', ModItems.MID_CARBON_STEEL_INGOT.get())
                .pattern("# #")
                .pattern("###")
                .pattern("###")
                .unlockedBy("has_high_carbon_steel_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.MID_CARBON_STEEL_INGOT.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(ModItems.STEEL_HELMET.get(),1)
                .define('#', ModItems.MID_CARBON_STEEL_INGOT.get())
                .pattern("###")
                .pattern("# #")
                .unlockedBy("has_high_carbon_steel_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.MID_CARBON_STEEL_INGOT.get()).build()))
                .save(pFinishedRecipeConsumer);

    }
}
