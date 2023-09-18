package net.caballerosupreme.empyrean_ores.effect;

import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;

import java.util.Random;


public class SpiceEffect extends MobEffect {

    protected SpiceEffect(MobEffectCategory category, int color) {
        super(category, color);
    }

    int TickCounter = 0; //Tick counter to see if

    @Override
    public void applyEffectTick(LivingEntity pLivingEntity, int pAmplifier) {
        TickCounter++; //Increment Tick Counter every time this increments

        if (!pLivingEntity.level.isClientSide()) {
            Double x = pLivingEntity.getX();
            Double y = pLivingEntity.getY();
            Double z = pLivingEntity.getZ();

            //MobEffectInstance fireproof = new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 20,0,true,true, true);

            pLivingEntity.setSharedFlagOnFire(true); //Just activate the fire animation

            //This detects if the Tick we are in is divisible into 20, if it is then we do something every second because
            //20 Ticks = 1 second
            if (TickCounter%20==0){

                //Here we generate a random number between 0.0 and 1.0 and if it is higher than 0.60 then we do something
                //Meaning a 40% change of doing something approximately
                randomDamageTicks(0.4f,pLivingEntity);

            }




        }
        super.applyEffectTick(pLivingEntity, pAmplifier);
    }

    //Function to get a random number in an inclusive range
    public float randomRange(int min, int max){
        float result = 0.5f;
        Random random = new Random();
        result = (float) (random.nextInt(max-min+1)+min);

        return result;
    }

    //Deals low damage randomly every tick (default method if you don't put anything)
    public void randomDamageTicks(LivingEntity pLiningEntity){
        //change is a number between 0.0 and 1.0 so that 0.
        if(new Random().nextFloat() > 0.6f) { // 40% of damaging the armor! Possibly!
            //player.getInventory().hurtArmor(DamageSource.MAGIC, 1f, new int[]{0, 1, 2, 3});
            //Put your effect here
            pLiningEntity.hurt(DamageSource.MAGIC.bypassArmor().bypassMagic(),0.5f);

        }

    }

    //Deals low damage randomly every tick (just to annoy players)
    public void randomDamageTicks(float chance, LivingEntity pLivingEntity){
        //change is a number between 0.0 and 1.0 so that 0.
        if(new Random().nextFloat() > (1-chance)) { // 40% of damaging the armor! Possibly!
            //player.getInventory().hurtArmor(DamageSource.MAGIC, 1f, new int[]{0, 1, 2, 3});
            //Put your effect here
            pLivingEntity.hurt(DamageSource.MAGIC,0.5f);
        }

    }


    @Override
    public boolean isDurationEffectTick(int pDuration, int pAmplifier) {
        return true;
    }

}
