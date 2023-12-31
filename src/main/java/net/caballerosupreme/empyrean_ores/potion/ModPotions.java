package net.caballerosupreme.empyrean_ores.potion;

import net.caballerosupreme.empyrean_ores.EmpyreanOres;
import net.caballerosupreme.empyrean_ores.effect.ModEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.item.alchemy.Potion;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModPotions {
    public static final DeferredRegister<Potion> POTIONS
            = DeferredRegister.create(ForgeRegistries.POTIONS, EmpyreanOres.MOD_ID);

    //Add your potions like any item or block
    public static final RegistryObject<Potion> FREEZE_POTION =
            POTIONS.register("freeze_potion", () -> new Potion(new MobEffectInstance(ModEffects.FREEZE.get(),200,0)));

    public static final RegistryObject<Potion> SPICE_POTION =
            POTIONS.register("spice_potion", ()-> new Potion(new MobEffectInstance(ModEffects.SPICE.get(),200,0)));

    public static void register(IEventBus eventBus){
        POTIONS.register(eventBus);
    }
}
