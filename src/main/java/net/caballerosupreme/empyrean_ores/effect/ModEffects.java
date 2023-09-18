package net.caballerosupreme.empyrean_ores.effect;

import net.caballerosupreme.empyrean_ores.EmpyreanOres;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEffects {
    public static final DeferredRegister<MobEffect> MOB_EFFECTS
            = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, EmpyreanOres.MOD_ID);

    //Register the Effect inside the class like an item or block
    public static final RegistryObject<MobEffect> FREEZE = MOB_EFFECTS.register("freeze",
            () -> new FreezeEffect(MobEffectCategory.HARMFUL, 3124687));

    //Spicy Effect (Burning particles, speed, haste, some random damage and Fire resistance)
    //Missing fire resistance and setting things on fire when hitting something (with an event)
    public static final RegistryObject<MobEffect> SPICE = MOB_EFFECTS.register("spice",
            () -> new SpiceEffect(MobEffectCategory.BENEFICIAL, 16723456)
                    .addAttributeModifier(Attributes.ATTACK_SPEED, "AF8B6E3F-3328-4C0A-AA36-5BA2BB9DBEF3", (double)0.5F, AttributeModifier.Operation.MULTIPLY_TOTAL)
                    .addAttributeModifier(Attributes.MOVEMENT_SPEED, "7107DE5E-7CE8-4030-940E-514C1F160890", (double)0.8F, AttributeModifier.Operation.MULTIPLY_TOTAL));

    //BlastResistance (inmunity to explosions) (gray)

    //Burning/Irritation (Sets things on fire but as an effect)
    public static final RegistryObject<MobEffect> BURNING = MOB_EFFECTS.register("burning",
            () -> new BurningEffect(MobEffectCategory.NEUTRAL, 16618006));


    public static void register(IEventBus eventBus){
        MOB_EFFECTS.register(eventBus);
    }
}
