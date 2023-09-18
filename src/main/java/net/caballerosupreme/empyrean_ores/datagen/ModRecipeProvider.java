package net.caballerosupreme.empyrean_ores.datagen;

import net.caballerosupreme.empyrean_ores.block.ModBlocks;
import net.caballerosupreme.empyrean_ores.item.ModItems;
import net.caballerosupreme.empyrean_ores.item.util.ModTags;
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

        //--------------------------------------------------------------------------------------------------------------
        //STEEL RECIPES
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
        //--------------------------------------------------------------------------------------------------------------
        //Aluminum
        ShapedRecipeBuilder.shaped(ModBlocks.ALUMINUM_BLOCK.get(),1)
                .define('#', ModItems.ALUMINUM_INGOT.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .unlockedBy("has_aluminum_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.ALUMINUM_INGOT.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(ModItems.ALUMINUM_INGOT.get(),9)
                .requires(ModBlocks.ALUMINUM_BLOCK.get(),1)
                .unlockedBy("has_aluminum_block", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.ALUMINUM_BLOCK.get()).build()))
                .save(pFinishedRecipeConsumer,"aluminum_ingot_from_block");


        ShapedRecipeBuilder.shaped(ModItems.ALUMINUM_SWORD.get(),1)
                .define('#', ModItems.ALUMINUM_INGOT.get())
                .define('E', Items.STICK)
                .pattern("#")
                .pattern("#")
                .pattern("E")
                .unlockedBy("has_aluminum_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.ALUMINUM_INGOT.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(ModItems.ALUMINUM_AXE.get(),1)
                .define('#', ModItems.ALUMINUM_INGOT.get())
                .define('E', Items.STICK)
                .pattern("##")
                .pattern("E#")
                .pattern("E ")
                .unlockedBy("has_aluminum_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.ALUMINUM_INGOT.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(ModItems.ALUMINUM_HOE.get(),1)
                .define('#', ModItems.ALUMINUM_INGOT.get())
                .define('E', Items.STICK)
                .pattern("##")
                .pattern("E ")
                .pattern("E ")
                .unlockedBy("has_aluminum_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.ALUMINUM_INGOT.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(ModItems.ALUMINUM_SHOVEL.get(),1)
                .define('#', ModItems.ALUMINUM_INGOT.get())
                .define('E', Items.STICK)
                .pattern("#")
                .pattern("E")
                .pattern("E")
                .unlockedBy("has_aluminum_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.ALUMINUM_INGOT.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(ModItems.ALUMINUM_PICKAXE.get(),1)
                .define('#', ModItems.ALUMINUM_INGOT.get())
                .define('E', Items.STICK)
                .pattern("###")
                .pattern(" E ")
                .pattern(" E ")
                .unlockedBy("has_aluminum_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.ALUMINUM_INGOT.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(ModItems.ALUMINUM_BOOTS.get(),1)
                .define('#', ModItems.ALUMINUM_INGOT.get())
                .pattern("# #")
                .pattern("# #")
                .unlockedBy("has_aluminum_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.ALUMINUM_INGOT.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(ModItems.ALUMINUM_LEGGINGS.get(),1)
                .define('#', ModItems.ALUMINUM_INGOT.get())
                .pattern("###")
                .pattern("# #")
                .pattern("# #")
                .unlockedBy("has_aluminum_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.ALUMINUM_INGOT.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(ModItems.ALUMINUM_CHESTPLATE.get(),1)
                .define('#', ModItems.ALUMINUM_INGOT.get())
                .pattern("# #")
                .pattern("###")
                .pattern("###")
                .unlockedBy("has_aluminum_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.ALUMINUM_INGOT.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(ModItems.ALUMINUM_HELMET.get(),1)
                .define('#', ModItems.ALUMINUM_INGOT.get())
                .pattern("###")
                .pattern("# #")
                .unlockedBy("has_aluminum_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.ALUMINUM_INGOT.get()).build()))
                .save(pFinishedRecipeConsumer);

        //--------------------------------------------------------------------------------------------------------------
        //Ruby Recipes
        ShapedRecipeBuilder.shaped(ModBlocks.RUBY_BLOCK.get(),1)
                .define('#', ModItems.RUBY.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .unlockedBy("has_ruby", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.RUBY.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(ModItems.RUBY.get(),9)
                .requires(ModBlocks.RUBY_BLOCK.get(),1)
                .unlockedBy("has_ruby_block", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.RUBY_BLOCK.get()).build()))
                .save(pFinishedRecipeConsumer,"ruby_from_block");

        //--------------------------------------------------------------------------------------------------------------
        //Sapphire Recipes
        ShapedRecipeBuilder.shaped(ModBlocks.SAPPHIRE_BLOCK.get(),1)
                .define('#', ModItems.SAPPHIRE.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .unlockedBy("has_sapphire", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.SAPPHIRE.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(ModItems.SAPPHIRE.get(),9)
                .requires(ModBlocks.SAPPHIRE_BLOCK.get(),1)
                .unlockedBy("has_sapphire_block", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.SAPPHIRE_BLOCK.get()).build()))
                .save(pFinishedRecipeConsumer,"sapphire_from_block");

        ShapedRecipeBuilder.shaped(ModItems.SAPPHIRE_SWORD.get(),1)
                .define('#', ModItems.SAPPHIRE.get())
                .define('E', Items.STICK)
                .pattern("#")
                .pattern("#")
                .pattern("E")
                .unlockedBy("has_sapphire", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.SAPPHIRE.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(ModItems.SAPPHIRE_AXE.get(),1)
                .define('#', ModItems.SAPPHIRE.get())
                .define('E', Items.STICK)
                .pattern("##")
                .pattern("E#")
                .pattern("E ")
                .unlockedBy("has_sapphire", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.SAPPHIRE.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(ModItems.SAPPHIRE_HOE.get(),1)
                .define('#', ModItems.SAPPHIRE.get())
                .define('E', Items.STICK)
                .pattern("##")
                .pattern("E ")
                .pattern("E ")
                .unlockedBy("has_sapphire", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.SAPPHIRE.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(ModItems.SAPPHIRE_SHOVEL.get(),1)
                .define('#', ModItems.SAPPHIRE.get())
                .define('E', Items.STICK)
                .pattern("#")
                .pattern("E")
                .pattern("E")
                .unlockedBy("has_sapphire", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.SAPPHIRE.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(ModItems.SAPPHIRE_PICKAXE.get(),1)
                .define('#', ModItems.SAPPHIRE.get())
                .define('E', Items.STICK)
                .pattern("###")
                .pattern(" E ")
                .pattern(" E ")
                .unlockedBy("has_sapphire", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.SAPPHIRE.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(ModItems.SAPPHIRE_BOOTS.get(),1)
                .define('#', ModItems.SAPPHIRE.get())
                .pattern("# #")
                .pattern("# #")
                .unlockedBy("has_sapphire", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.SAPPHIRE.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(ModItems.SAPPHIRE_LEGGINGS.get(),1)
                .define('#', ModItems.SAPPHIRE.get())
                .pattern("###")
                .pattern("# #")
                .pattern("# #")
                .unlockedBy("has_sapphire", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.SAPPHIRE.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(ModItems.SAPPHIRE_CHESTPLATE.get(),1)
                .define('#', ModItems.SAPPHIRE.get())
                .pattern("# #")
                .pattern("###")
                .pattern("###")
                .unlockedBy("has_sapphire", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.SAPPHIRE.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(ModItems.SAPPHIRE_HELMET.get(),1)
                .define('#', ModItems.SAPPHIRE.get())
                .pattern("###")
                .pattern("# #")
                .unlockedBy("has_sapphire", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.SAPPHIRE.get()).build()))
                .save(pFinishedRecipeConsumer);

        //--------------------------------------------------------------------------------------------------------------
        //Opal Recipes
        ShapedRecipeBuilder.shaped(ModBlocks.OPAL_BLOCK.get(),1)
                .define('#', ModItems.OPAL.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .unlockedBy("has_opal", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.OPAL.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(ModItems.OPAL.get(),9)
                .requires(ModBlocks.OPAL_BLOCK.get(),1)
                .unlockedBy("has_opal_block", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.OPAL_BLOCK.get()).build()))
                .save(pFinishedRecipeConsumer,"opal_from_block");

        ShapedRecipeBuilder.shaped(ModItems.OPAL_SWORD.get(),1)
                .define('#', ModItems.OPAL.get())
                .define('E', Items.STICK)
                .pattern("#")
                .pattern("#")
                .pattern("E")
                .unlockedBy("has_opal", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.OPAL.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(ModItems.OPAL_AXE.get(),1)
                .define('#', ModItems.OPAL.get())
                .define('E', Items.STICK)
                .pattern("##")
                .pattern("E#")
                .pattern("E ")
                .unlockedBy("has_opal", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.OPAL.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(ModItems.OPAL_HOE.get(),1)
                .define('#', ModItems.OPAL.get())
                .define('E', Items.STICK)
                .pattern("##")
                .pattern("E ")
                .pattern("E ")
                .unlockedBy("has_opal", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.OPAL.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(ModItems.OPAL_SHOVEL.get(),1)
                .define('#', ModItems.OPAL.get())
                .define('E', Items.STICK)
                .pattern("#")
                .pattern("E")
                .pattern("E")
                .unlockedBy("has_opal", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.OPAL.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(ModItems.OPAL_PICKAXE.get(),1)
                .define('#', ModItems.OPAL.get())
                .define('E', Items.STICK)
                .pattern("###")
                .pattern(" E ")
                .pattern(" E ")
                .unlockedBy("has_opal", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.OPAL.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(ModItems.OPAL_BOOTS.get(),1)
                .define('#', ModItems.OPAL.get())
                .pattern("# #")
                .pattern("# #")
                .unlockedBy("has_opal", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.OPAL.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(ModItems.OPAL_LEGGINGS.get(),1)
                .define('#', ModItems.OPAL.get())
                .pattern("###")
                .pattern("# #")
                .pattern("# #")
                .unlockedBy("has_opal", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.OPAL.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(ModItems.OPAL_CHESTPLATE.get(),1)
                .define('#', ModItems.OPAL.get())
                .pattern("# #")
                .pattern("###")
                .pattern("###")
                .unlockedBy("has_opal", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.OPAL.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(ModItems.OPAL_HELMET.get(),1)
                .define('#', ModItems.OPAL.get())
                .pattern("###")
                .pattern("# #")
                .unlockedBy("has_opal", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.OPAL.get()).build()))
                .save(pFinishedRecipeConsumer);

        //--------------------------------------------------------------------------------------------------------------
        //Topaz Recipes
        ShapedRecipeBuilder.shaped(ModBlocks.TOPAZ_BLOCK.get(),1)
                .define('#', ModItems.TOPAZ.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .unlockedBy("has_topaz", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.TOPAZ.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(ModItems.TOPAZ.get(),9)
                .requires(ModBlocks.TOPAZ_BLOCK.get(),1)
                .unlockedBy("has_topaz_block", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.TOPAZ_BLOCK.get()).build()))
                .save(pFinishedRecipeConsumer,"topaz_from_block");

        //--------------------------------------------------------------------------------------------------------------
        //Adamantite Recipes
        ShapedRecipeBuilder.shaped(ModBlocks.ADAMANTITE_BLOCK.get(),1)
                .define('#', ModItems.ADAMANTITE_INGOT.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .unlockedBy("has_adamantite_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.ADAMANTITE_INGOT.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(ModItems.ADAMANTITE_INGOT.get(),9)
                .requires(ModBlocks.ADAMANTITE_BLOCK.get(),1)
                .unlockedBy("has_adamantite_block", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.ADAMITE_BLOCK.get()).build()))
                .save(pFinishedRecipeConsumer,"adamantite_ingot_from_block");

        ShapedRecipeBuilder.shaped(ModItems.ADAMANTITE_SWORD.get(),1)
                .define('#', ModItems.ADAMANTITE_INGOT.get())
                .define('E', Items.STICK)
                .pattern("#")
                .pattern("#")
                .pattern("E")
                .unlockedBy("has_adamantite_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.ADAMANTITE_INGOT.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(ModItems.ADAMANTITE_AXE.get(),1)
                .define('#', ModItems.ADAMANTITE_INGOT.get())
                .define('E', Items.STICK)
                .pattern("##")
                .pattern("E#")
                .pattern("E ")
                .unlockedBy("has_adamantite_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.ADAMANTITE_INGOT.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(ModItems.ADAMANTITE_HOE.get(),1)
                .define('#', ModItems.ADAMANTITE_INGOT.get())
                .define('E', Items.STICK)
                .pattern("##")
                .pattern("E ")
                .pattern("E ")
                .unlockedBy("has_adamantite_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.ADAMANTITE_INGOT.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(ModItems.ADAMANTITE_SHOVEL.get(),1)
                .define('#', ModItems.ADAMANTITE_INGOT.get())
                .define('E', Items.STICK)
                .pattern("#")
                .pattern("E")
                .pattern("E")
                .unlockedBy("has_adamantite_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.ADAMANTITE_INGOT.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(ModItems.ADAMANTITE_PICKAXE.get(),1)
                .define('#', ModItems.ADAMANTITE_INGOT.get())
                .define('E', Items.STICK)
                .pattern("###")
                .pattern(" E ")
                .pattern(" E ")
                .unlockedBy("has_adamantite_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.ADAMANTITE_INGOT.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(ModItems.ADAMANTITE_BOOTS.get(),1)
                .define('#', ModItems.ADAMANTITE_INGOT.get())
                .pattern("# #")
                .pattern("# #")
                .unlockedBy("has_adamantite_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.ADAMANTITE_INGOT.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(ModItems.ADAMANTITE_LEGGINGS.get(),1)
                .define('#', ModItems.ADAMANTITE_INGOT.get())
                .pattern("###")
                .pattern("# #")
                .pattern("# #")
                .unlockedBy("has_adamantite_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.ADAMANTITE_INGOT.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(ModItems.ADAMANTITE_CHESTPLATE.get(),1)
                .define('#', ModItems.ADAMANTITE_INGOT.get())
                .pattern("# #")
                .pattern("###")
                .pattern("###")
                .unlockedBy("has_adamantite_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.ADAMANTITE_INGOT.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(ModItems.ADAMANTITE_HELMET.get(),1)
                .define('#', ModItems.ADAMANTITE_INGOT.get())
                .pattern("###")
                .pattern("# #")
                .unlockedBy("has_adamantite_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.ADAMANTITE_INGOT.get()).build()))
                .save(pFinishedRecipeConsumer);

        //Adamite
        ShapedRecipeBuilder.shaped(ModBlocks.ADAMITE_BLOCK.get(),1)
                .define('#', ModItems.ADAMITE.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .unlockedBy("has_adamite", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.ADAMITE.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(ModItems.ADAMITE.get(),9)
                .requires(ModBlocks.ADAMITE_BLOCK.get(),1)
                .unlockedBy("has_adamite_block", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.ADAMITE_BLOCK.get()).build()))
                .save(pFinishedRecipeConsumer,"adamite_from_block");

        //Crafting with all gems
        ShapelessRecipeBuilder.shapeless(ModItems.ADAMITE.get(),1)
                .requires(ModItems.SAPPHIRE.get(),1)
                .requires(ModItems.OPAL.get(),1)
                .requires(ModItems.RUBY.get(),1)
                .requires(ModItems.ZIRCON.get(),1)
                .requires(ModItems.CITRINE.get(),1)
                .requires(ModItems.TOPAZ.get(),1)
                .requires(ModItems.TUNGSTEN_INGOT.get(),1)
                .requires(ModItems.TITANIUM_INGOT.get(),1)
                .requires(ModItems.HIGH_CARBON_STEEL_INGOT.get(),1)
                .unlockedBy("has_all_gems", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModTags.Items.ADAMITE_CRAFTING_ITEMS).build()))
                .save(pFinishedRecipeConsumer,"adamite_from_gems");

        //--------------------------------------------------------------------------------------------------------------
        //Titanium Recipes
        ShapedRecipeBuilder.shaped(ModBlocks.TITANIUM_BLOCK.get(),1)
                .define('#', ModItems.TITANIUM_INGOT.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .unlockedBy("has_titanium_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.TITANIUM_INGOT.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(ModItems.TITANIUM_INGOT.get(),9)
                .requires(ModBlocks.TITANIUM_BLOCK.get(),1)
                .unlockedBy("has_titanium_block", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.TITANIUM_BLOCK.get()).build()))
                .save(pFinishedRecipeConsumer,"titanium_ingot_from_block");

        //--------------------------------------------------------------------------------------------------------------
        //Tungsten Recipes
        ShapedRecipeBuilder.shaped(ModBlocks.TUNGSTEN_BLOCK.get(),1)
                .define('#', ModItems.TUNGSTEN_INGOT.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .unlockedBy("has_tungsten_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.TUNGSTEN_INGOT.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(ModItems.TUNGSTEN_INGOT.get(),9)
                .requires(ModBlocks.TUNGSTEN_BLOCK.get(),1)
                .unlockedBy("has_tungsten_block", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.TUNGSTEN_BLOCK.get()).build()))
                .save(pFinishedRecipeConsumer,"tungsten_ingot_from_block");

        //--------------------------------------------------------------------------------------------------------------
        //Citrine
        ShapedRecipeBuilder.shaped(ModBlocks.CITRINE_BLOCK.get(),1)
                .define('#', ModItems.CITRINE.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .unlockedBy("has_citrine", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.CITRINE.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(ModItems.CITRINE.get(),9)
                .requires(ModBlocks.CITRINE_BLOCK.get(),1)
                .unlockedBy("has_citrine_block", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.CITRINE_BLOCK.get()).build()))
                .save(pFinishedRecipeConsumer,"citrine_from_block");

        //--------------------------------------------------------------------------------------------------------------
        //Zircon
        ShapedRecipeBuilder.shaped(ModBlocks.ZIRCON_BLOCK.get(),1)
                .define('#', ModItems.ZIRCON.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .unlockedBy("has_zircon", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.ZIRCON.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(ModItems.ZIRCON.get(),9)
                .requires(ModBlocks.ZIRCON_BLOCK.get(),1)
                .unlockedBy("has_zircon_block", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.ZIRCON_BLOCK.get()).build()))
                .save(pFinishedRecipeConsumer,"zircon_from_block");

    }
}
