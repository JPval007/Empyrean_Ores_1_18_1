package net.caballerosupreme.empyrean_ores.datagen;

import net.caballerosupreme.empyrean_ores.EmpyreanOres;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent;

@Mod.EventBusSubscriber(modid = EmpyreanOres.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event){
        DataGenerator generator = event.getGenerator();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();

        //Data generator for recipes
        generator.addProvider(new ModRecipeProvider(generator));
        //Data generator for Block Loot Tables
        generator.addProvider(new ModLootTableProvider(generator));
    }
}
