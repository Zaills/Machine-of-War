package net.zaills.machine_of_war.mixin;

import net.zaills.machine_of_war.Machine_of_War;
import net.minecraft.client.gui.screen.TitleScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(TitleScreen.class)
public class MoW_Mixin {
	@Inject(at = @At("HEAD"), method = "init()V")
	private void init(CallbackInfo info) {
		Machine_of_War.LOGGER.info("This line is printed by an example mod mixin!");
	}
}
