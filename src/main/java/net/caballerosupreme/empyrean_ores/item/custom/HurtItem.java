package net.caballerosupreme.empyrean_ores.item.custom;

import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.damagesource.EntityDamageSource;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

import java.util.Random;

public class HurtItem extends Item {
    public HurtItem(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level pLevel, Player pPlayer, InteractionHand pUsedHand) {
        //damageSource
        DamageSource damage = DamageSource.LIGHTNING_BOLT.setExplosion().bypassArmor().bypassMagic();

        if (!pLevel.isClientSide()){
            pPlayer.hurt(damage,2.0f);


        }

        return super.use(pLevel, pPlayer, pUsedHand);
    }
}
