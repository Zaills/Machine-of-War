package net.zaills.machine_of_war.effect;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;

public class FreezingEffect extends StatusEffects {
    public FreezingEffect(int i) {
        super(StatusEffectCategory.HARMFUL, i);
    }

    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        return true;
    }

    public void applyUpdateEffect(LivingEntity entity, int amplifier) {
        if (entity instanceof PlayerEntity) {
            ((PlayerEntity) entity).addExperience(1 << amplifier); // Higher amplifier gives you EXP faster
        }
    }

    }

}