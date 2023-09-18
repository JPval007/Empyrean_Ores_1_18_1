package net.caballerosupreme.empyrean_ores.event;

import net.caballerosupreme.empyrean_ores.EmpyreanOres;
import net.minecraft.client.particle.CritParticle;
import net.minecraft.client.particle.ExplodeParticle;
import net.minecraft.client.particle.FireworkParticles;
import net.minecraft.core.particles.*;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.Level;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.awt.*;

/*
 * Use events when you don't have access to the classes
 */
@Mod.EventBusSubscriber(modid = EmpyreanOres.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEvents {
    //This is the Mod bus event where you can do anything using events
    //Don't forget to subscribe them to the bus
    //Test Event
/*
    @SubscribeEvent
    public static void onDamageTaken(LivingHurtEvent event){
        LivingEntity entity = event.getEntityLiving();
        Level level = entity.level;

        if (event.getSource() == DamageSource.LIGHTNING_BOLT){

            level.addParticle(DustParticleOptions.REDSTONE, entity.getX(),entity.getY(), entity.getZ(),0.0D,0.3D,0.0D);
        }

    }
*/

}
