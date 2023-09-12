package net.caballerosupreme.empyrean_ores.datagen;

import net.caballerosupreme.empyrean_ores.EmpyreanOres;
import net.caballerosupreme.empyrean_ores.item.ModItems;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;


public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, EmpyreanOres.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(ModItems.RUBY.get());
        simpleItem(ModItems.ALUMINUM_INGOT.get());
        simpleItem(ModItems.RAW_ALUMINUM.get());
        simpleItem(ModItems.SAPPHIRE.get());
        simpleItem(ModItems.CITRINE.get());
        simpleItem(ModItems.OPAL.get());
        simpleItem(ModItems.RAW_TITANIUM.get());
        simpleItem(ModItems.TITANIUM_INGOT.get());
        simpleItem(ModItems.TOPAZ.get());
        simpleItem(ModItems.RAW_TUNGSTEN.get());
        simpleItem(ModItems.TUNGSTEN_INGOT.get());
        simpleItem(ModItems.RAW_ZIRCON.get());
        simpleItem(ModItems.ZIRCON.get());
        simpleItem(ModItems.ADAMITE.get());
        simpleItem(ModItems.ADAMANTITE_INGOT.get());

        handheldItem(ModItems.ALUMINUM_AXE.get());
        handheldItem(ModItems.ALUMINUM_HOE.get());
        handheldItem(ModItems.ALUMINUM_PICKAXE.get());
        handheldItem(ModItems.ALUMINUM_SHOVEL.get());
        handheldItem(ModItems.ALUMINUM_SWORD.get());
        simpleItem(ModItems.ALUMINUM_HELMET.get());
        simpleItem(ModItems.ALUMINUM_CHESTPLATE.get());
        simpleItem(ModItems.ALUMINUM_LEGGINGS.get());
        simpleItem(ModItems.ALUMINUM_BOOTS.get());

        handheldItem(ModItems.SAPPHIRE_AXE.get());
        handheldItem(ModItems.SAPPHIRE_HOE.get());
        handheldItem(ModItems.SAPPHIRE_PICKAXE.get());
        handheldItem(ModItems.SAPPHIRE_SHOVEL.get());
        handheldItem(ModItems.SAPPHIRE_SWORD.get());
        simpleItem(ModItems.SAPPHIRE_HELMET.get());
        simpleItem(ModItems.SAPPHIRE_CHESTPLATE.get());
        simpleItem(ModItems.SAPPHIRE_LEGGINGS.get());
        simpleItem(ModItems.SAPPHIRE_BOOTS.get());

        handheldItem(ModItems.OPAL_AXE.get());
        handheldItem(ModItems.OPAL_HOE.get());
        handheldItem(ModItems.OPAL_PICKAXE.get());
        handheldItem(ModItems.OPAL_SHOVEL.get());
        handheldItem(ModItems.OPAL_SWORD.get());
        simpleItem(ModItems.OPAL_HELMET.get());
        simpleItem(ModItems.OPAL_CHESTPLATE.get());
        simpleItem(ModItems.OPAL_LEGGINGS.get());
        simpleItem(ModItems.OPAL_BOOTS.get());

        handheldItem(ModItems.TUNGSTEN_AXE.get());
        handheldItem(ModItems.TUNGSTEN_HOE.get());
        handheldItem(ModItems.TUNGSTEN_PICKAXE.get());
        handheldItem(ModItems.TUNGSTEN_SHOVEL.get());
        handheldItem(ModItems.TUNGSTEN_SWORD.get());
        simpleItem(ModItems.TUNGSTEN_HELMET.get());
        simpleItem(ModItems.TUNGSTEN_CHESTPLATE.get());
        simpleItem(ModItems.TUNGSTEN_LEGGINGS.get());
        simpleItem(ModItems.TUNGSTEN_BOOTS.get());

        handheldItem(ModItems.ADAMANTITE_AXE.get());
        handheldItem(ModItems.ADAMANTITE_HOE.get());
        handheldItem(ModItems.ADAMANTITE_PICKAXE.get());
        handheldItem(ModItems.ADAMANTITE_SHOVEL.get());
        handheldItem(ModItems.ADAMANTITE_SWORD.get());
        simpleItem(ModItems.ADAMANTITE_HELMET.get());
        simpleItem(ModItems.ADAMANTITE_CHESTPLATE.get());
        simpleItem(ModItems.ADAMANTITE_LEGGINGS.get());
        simpleItem(ModItems.ADAMANTITE_BOOTS.get());

    }
    //Figure out how to do a generator for block item models, since it is missing

    //Simple Item method
    private ItemModelBuilder simpleItem(Item item) {
        return withExistingParent(item.getRegistryName().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(EmpyreanOres.MOD_ID,"item/" + item.getRegistryName().getPath()));
    }

    //Handheld Item method
    private ItemModelBuilder handheldItem(Item item) {
        return withExistingParent(item.getRegistryName().getPath(),
                new ResourceLocation("item/handheld")).texture("layer0",
                new ResourceLocation(EmpyreanOres.MOD_ID,"item/" + item.getRegistryName().getPath()));
    }

    //Block Item method

}
