package net.zaills.machine_of_war.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.zaills.machine_of_war.Machine_of_War;
import net.zaills.machine_of_war.block.ModBlocks;

public class ModItemGroup {
    public static final ItemGroup MoW = FabricItemGroupBuilder.build(new Identifier(Machine_of_War.MOD_ID,"mow"),
            () -> new ItemStack(ModBlocks.Redstone_Lantern));
}
