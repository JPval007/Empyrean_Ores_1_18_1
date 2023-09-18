package net.caballerosupreme.empyrean_ores.effect;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.block.Block;

public class BurningEffect extends MobEffect {

    protected BurningEffect(MobEffectCategory effectCategory, int color) {
        super(effectCategory, color);
    }

    @Override
    public void applyEffectTick(LivingEntity pLivingEntity, int pAmplifier) {
        //Put here what this effect does
        if(!pLivingEntity.level.isClientSide()){
            pLivingEntity.setSecondsOnFire(10);
            //pLivingEntity.setInvulnerable(false); //makes the entity invulnerable
            //If you manage to set the hasVisualFire variable in the Entity class you can have the fire particles only
            //It is a private boolean type so, you could create a subclass and try to use it
            //pLivingEntity.setSharedFlagOnFire(true); //This sets the visual Fire without actual fire
            //pLivingEntity.fireImmune(); //Makes the entity immune to fire

        }


        super.applyEffectTick(pLivingEntity, pAmplifier);
    }

    @Override
    public boolean isDurationEffectTick(int pDuration, int pAmplifier) {
        return true;
    }
}
