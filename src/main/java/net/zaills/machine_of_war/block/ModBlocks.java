package net.zaills.machine_of_war.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.*;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableTextContent;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.World;
import net.zaills.machine_of_war.Machine_of_War;
import net.zaills.machine_of_war.item.ModItemGroup;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class ModBlocks {

    public static final Block Redstone_Lantern = registerBlock("redstone_lantern",
            new Block(FabricBlockSettings.of(Material.METAL).strength(0.3f)), ModItemGroup.MoF);

    private static Block registerBlock(String name, Block block, ItemGroup group){
     registerBlockItem(name, block, group);
     return Registry.register(Registry.BLOCK, new Identifier(Machine_of_War.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group){
        return Registry.register(Registry.ITEM, new Identifier(Machine_of_War.MOD_ID, name),
        new BlockItem(block, new FabricItemSettings().group(group)));
            }

    public static void registerModBlocks(){
        Machine_of_War.LOGGER.info("Registering ModBlock for" + Machine_of_War.MOD_ID);
    }
}