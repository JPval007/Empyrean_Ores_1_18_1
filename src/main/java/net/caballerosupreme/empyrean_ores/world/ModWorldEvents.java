package net.caballerosupreme.empyrean_ores.world;

import net.caballerosupreme.empyrean_ores.EmpyreanOres;
import net.caballerosupreme.empyrean_ores.world.gen.ModOreGeneration;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = EmpyreanOres.MOD_ID)
public class ModWorldEvents {

    @SubscribeEvent
    public static void biomeLoadingEvent(final BiomeLoadingEvent event){
        //Put this in the correct order dictated by GenerationStep.Decoration.UNDERGROUNDORES
        //Custom Ore generation
        ModOreGeneration.generateOres(event);

        //Put Custom Flower generation

        //Put Custom Tree generation


    }


}
