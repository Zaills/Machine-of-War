package net.zaills.machine_of_war.effect;

import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.zaills.machine_of_war.Machine_of_War;

public class Modeffect {
    public static StatusEffects FREEZE = new FreezingEffect(0x98D982);

    public  static  StatusEffects registerStatusEffect(String name){
        return Registry.register(Registry.STATUS_EFFECT, new Identifier(Machine_of_War.MOD_ID, name),
                FREEZE);
    }

    public static void registerEffect(){
        FREEZE = registerStatusEffect("freeze");
    }
}
