package net.zaills.machine_of_war.enchantment;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.*;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;

public class Bane_of_Illager extends Enchantment {
    public boolean Bane = false;

    public Bane_of_Illager(Rarity weight, EnchantmentTarget type, EquipmentSlot... slotTypes) {
        super(weight, type, slotTypes);
    }

    @Override
    public float getAttackDamage(int level, EntityGroup group) {
        if(group == EntityGroup.ILLAGER) {
            return 2.5F * level;
        }
        else{
            return 0.0F;
        }
    }

    @Override
    public void onTargetDamaged(LivingEntity user, Entity target, int level) {
        if (target instanceof LivingEntity livingEntity){
            if(livingEntity.getGroup() == EntityGroup.ILLAGER){
                int i = 20 + user.getRandom().nextInt(10 * level);
            }
        }
    }

    @Override
    public int getMaxLevel() {
        return 5;
    }
}
