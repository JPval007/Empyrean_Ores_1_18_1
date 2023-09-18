package net.caballerosupreme.empyrean_ores.item.custom;


import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;


public class LevitationSwordItem extends SwordItem {
    public LevitationSwordItem(Tier pTier, int pAttackDamageModifier, float pAttackSpeedModifier, Properties pProperties) {
        super(pTier, pAttackDamageModifier, pAttackSpeedModifier, pProperties);
    }

    @Override
    public boolean hurtEnemy(ItemStack pStack, LivingEntity pTarget, LivingEntity pAttacker) {
        //Define the new mob effect instance
        MobEffectInstance night_vision = new MobEffectInstance(MobEffects.NIGHT_VISION,300,0,false,false,false,null);
        //This new mob Effect instance is hidden, to actuallly hide it from player's inventory you have to intercept the server packet that shows it.

        pTarget.addEffect(new MobEffectInstance(MobEffects.LEVITATION, 200), pAttacker);
        pAttacker.addEffect(night_vision);
        pAttacker.hurt(new DamageSource("lightningBolt").bypassArmor().bypassMagic().setExplosion(),0.5f);

        //Add explosion inmmunity effect for 1 second
        //Add Fire resistance effect for 1 second
        //Hide this effects

        if (!pAttacker.level.isClientSide()){
            ServerLevel world = ((ServerLevel) pAttacker.level);
            BlockPos position = pTarget.getOnPos();

            //Summon a lighting bolt only when in server
            pTarget.setSecondsOnFire(5); //Set something in fire
            EntityType.LIGHTNING_BOLT.spawn(world, null, null, position, MobSpawnType.TRIGGERED, true, true);



        }

        return super.hurtEnemy(pStack, pTarget, pAttacker);
    }


}
