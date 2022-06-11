package net.zaills.machine_of_war.enchantment;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.zaills.machine_of_war.Machine_of_War;

public class ModEnchantments {

    public static Enchantment Bane_Of_Illager = register("bane_of_illager",
            new Bane_of_Illager(Enchantment.Rarity.UNCOMMON, EnchantmentTarget.WEAPON, EquipmentSlot.MAINHAND));


    private static Enchantment register(String name, Enchantment enchantment){
        return Registry.register(Registry.ENCHANTMENT, new Identifier(Machine_of_War.MOD_ID, name), enchantment);
    }

    public static void registerModEnchantments(){
        System.out.println("Registering Enchantment for" + Machine_of_War.MOD_ID);
    }
}
