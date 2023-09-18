package net.caballerosupreme.empyrean_ores.event;

import net.caballerosupreme.empyrean_ores.EmpyreanOres;
import net.minecraft.client.gui.components.ChatComponent;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.world.entity.animal.Sheep;
import net.minecraft.world.entity.player.Player;
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
        if (event.getEntity() instanceof Sheep){
            if (event.getSource().getDirectEntity() instanceof Player player){
                //Send a System Message prior to 1.19+ forge
                player.sendMessage(new TextComponent("Punched a Sheep!"), UUID.randomUUID());

            }
        }
    }

}
