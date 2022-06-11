package net.zaills.machine_of_war;

import net.fabricmc.api.ModInitializer;
import net.zaills.machine_of_war.block.ModBlocks;
import net.zaills.machine_of_war.enchantment.ModEnchantments;
import net.zaills.machine_of_war.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class Machine_of_War implements ModInitializer {

	public static final String MOD_ID = "machine_of_war";
	public static final Logger LOGGER = LoggerFactory.getLogger("machine_of_war");

	@Override
	public void onInitialize() {

		ModBlocks.registerModBlocks();
		ModItems.registerModItem();
		ModEnchantments.registerModEnchantments();
	}
}
