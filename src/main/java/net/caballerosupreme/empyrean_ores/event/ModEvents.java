package net.caballerosupreme.empyrean_ores.event;

import net.caballerosupreme.empyrean_ores.EmpyreanOres;
import net.caballerosupreme.empyrean_ores.effect.ModEffects;
import net.caballerosupreme.empyrean_ores.item.ModItems;
import net.caballerosupreme.empyrean_ores.item.custom.LevitationSwordItem;
import net.minecraft.client.gui.components.ChatComponent;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.player.Player;
import net.minecraftforge.event.entity.living.LivingDamageEvent;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.UUID;


/*
 * Use events when you don't have access to the classes
 */
@Mod.EventBusSubscriber(modid = EmpyreanOres.MOD_ID)
public class ModEvents {
    //This is the Mod bus event where you can do anything using events
    //Don't forget to subscribe them to the bus
    //Test Event
    @SubscribeEvent
    public static void onLivingHurt(LivingHurtEvent event){
        if (event.getSource().getDirectEntity() instanceof Player player){
            //Send a System Message prior to 1.19+ forge
            //player.sendMessage(new TextComponent("Punched a Sheep!"), UUID.randomUUID());
            if (player.hasEffect(ModEffects.SPICE.get())){
                //This executes if the player has the Spice effect
                event.getEntity().setSecondsOnFire(2);

            }

        }


    }

    //Cancel hurt when using Levitation Sword
    @SubscribeEvent
    public static void cancelLightingDamage(LivingDamageEvent event){
        //We continue if the entity damaged is a player
        if (event.getEntity() instanceof Player player){
            //Check if the player was damaged by a Lightning Bolt
            if (event.getSource().equals(DamageSource.LIGHTNING_BOLT)){
                //Check if the main hand has a levitation sword type
                if (player.getMainHandItem().getItem() == ModItems.TUNGSTEN_SWORD.get()){
                    //Cancel the event and the entity is not hurt
                    //player.invulnerableTime = 2;
                    event.setCanceled(true);

                }
            }
        }

    }

    @SubscribeEvent
    public static void cancelLightningDamageHurt(LivingHurtEvent event){
        //We continue if the entity damaged is a player
        if (event.getEntity() instanceof Player player){
            //Check if the player was damaged by a Lightning Bolt
            if (event.getSource().equals(DamageSource.LIGHTNING_BOLT)){
                //Check if the main hand has a levitation sword type
                if (player.getMainHandItem().getItem() == ModItems.TUNGSTEN_SWORD.get()){
                    //Cancel the event and the entity is not hurt
                    //player.invulnerableTime = 2;
                    event.setCanceled(true);

                }
            }
        }

    }


}
