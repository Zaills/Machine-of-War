package net.zaills.machine_of_war.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.zaills.machine_of_war.Machine_of_War;

public class ModItems {

    public static final Item Test = registerItem("test",
            new Item(new FabricItemSettings().group(ItemGroup.REDSTONE)));


    private static Item registerItem(String name,Item item){
        return Registry.register(Registry.ITEM, new Identifier(Machine_of_War.MOD_ID, name),item);
    }

    public static void registerModItem(){
        Machine_of_War.LOGGER.info("Registering Mod Items for" + Machine_of_War.MOD_ID);
    }
}
