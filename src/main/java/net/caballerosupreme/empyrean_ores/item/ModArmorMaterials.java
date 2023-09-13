package net.caballerosupreme.empyrean_ores.item;

import net.caballerosupreme.empyrean_ores.EmpyreanOres;
import net.caballerosupreme.empyrean_ores.item.ModItems;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.LazyLoadedValue;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.function.Supplier;

public enum ModArmorMaterials implements ArmorMaterial {
    ALUMINUM ("aluminum", 9, new int[]{1, 2, 3, 2}, 8,
            SoundEvents.ARMOR_EQUIP_CHAIN, 0.0F, 0.0F,
            () -> { return Ingredient.of(ModItems.ALUMINUM_INGOT.get()); }),
    STEEL("steel", 20, new int[]{3, 6, 7, 3}, 15,
            SoundEvents.ARMOR_EQUIP_IRON, 1.0F, 0.0F,
            () -> { return Ingredient.of(ModItems.MID_CARBON_STEEL_INGOT.get()); }),
    SAPPHIRE("sapphire", 37, new int[]{3, 6, 8, 3}, 15,
            SoundEvents.ARMOR_EQUIP_NETHERITE, 2.0F, 0.2F,
            () -> { return Ingredient.of(ModItems.SAPPHIRE.get()); }),
    OPAL("opal", 40, new int[]{4, 7, 9, 4}, 18,
            SoundEvents.ARMOR_EQUIP_DIAMOND, 2.5F, 0.2F,
            () -> { return Ingredient.of(ModItems.OPAL.get()); }),
    TUNGSTEN("tungsten", 38, new int[]{4, 7, 9, 4}, 14,
            SoundEvents.ARMOR_EQUIP_GOLD, 1.0F, 0.5F,
            () -> { return Ingredient.of(ModItems.TUNGSTEN_INGOT.get()); }),
    ADAMANTITE("adamantite", 43, new int[]{5, 8, 10, 5}, 30,
            SoundEvents.ARMOR_EQUIP_DIAMOND, 1.0F, 0.2F,
            () -> { return Ingredient.of(ModItems.ADAMANTITE_INGOT.get()); }),

    RUBY("ruby", 20, new int[]{2, 5, 6, 2}, 15,
    SoundEvents.ARMOR_EQUIP_DIAMOND, 0.0F, 0.0F,
            () -> { return Ingredient.of(ModItems.RUBY.get()); }),

    TOPAZ("topaz", 18, new int[]{2, 5, 6, 2}, 19,
            SoundEvents.ARMOR_EQUIP_GOLD, 0.0F, 0.0F,
            () -> { return Ingredient.of(ModItems.TOPAZ.get()); }),

    TITANIUM("titanium", 10, new int[]{1, 4, 5, 2}, 20,
            SoundEvents.ARMOR_EQUIP_GOLD, 0.0F, 0.0F,
            () -> { return Ingredient.of(ModItems.TITANIUM_INGOT.get()); });

    private static final int[] HEALTH_PER_SLOT = new int[]{13, 15, 16, 11};
    private final String name;
    private final int durabilityMultiplier;
    private final int[] slotProtections;
    private final int enchantmentValue;
    private final SoundEvent sound;
    private final float toughness;
    private final float knockbackResistance;
    private final LazyLoadedValue<Ingredient> repairIngredient;

    private ModArmorMaterials(String pName, int pDurabilityMultiplier, int[] pSlotProtections, int pEnchantmentValue, SoundEvent pSound, float pToughness, float pKnockbackResistance, Supplier<Ingredient> pRepairIngredient) {
        this.name = pName;
        this.durabilityMultiplier = pDurabilityMultiplier;
        this.slotProtections = pSlotProtections;
        this.enchantmentValue = pEnchantmentValue;
        this.sound = pSound;
        this.toughness = pToughness;
        this.knockbackResistance = pKnockbackResistance;
        this.repairIngredient = new LazyLoadedValue<>(pRepairIngredient);
    }

    public int getDurabilityForSlot(EquipmentSlot pSlot) {
        return HEALTH_PER_SLOT[pSlot.getIndex()] * this.durabilityMultiplier;
    }

    public int getDefenseForSlot(EquipmentSlot pSlot) {
        return this.slotProtections[pSlot.getIndex()];
    }

    public int getEnchantmentValue() {
        return this.enchantmentValue;
    }

    public SoundEvent getEquipSound() {
        return this.sound;
    }

    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }

    public String getName() {
        return EmpyreanOres.MOD_ID + ":" + this.name;
    }

    public float getToughness() {
        return this.toughness;
    }

    /**
     * Gets the percentage of knockback resistance provided by armor of the material.
     */
    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }
}
