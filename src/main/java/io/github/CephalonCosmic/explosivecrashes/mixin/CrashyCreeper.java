package io.github.CephalonCosmic.explosivecrashes.mixin;

import net.minecraft.CrashReport;
import net.minecraft.client.Minecraft;
import net.minecraft.world.entity.monster.Creeper;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import io.github.CephalonCosmic.explosivecrashes.ExplosiveCrashes;
import io.github.CephalonCosmic.explosivecrashes.ExplosiveCreeper;

import java.io.File;

@Mixin(Creeper.class)
abstract class CrashyCreeper {
    @Inject(method = "explodeCreeper", at = @At(value = "TAIL"))
    private void crashOnExplosion(CallbackInfo ci) {
        ExplosiveCrashes.LOGGER.error("Womp Womp.");
        CrashReport crashReport = new CrashReport("Womp womp.", new ExplosiveCreeper("You installed this mod and a Creeper exploded? what did you expect to happen??"));
        //? if >=1.21 {
        Minecraft.crash(Minecraft.getInstance(), new File("."), crashReport);
        //?} else {
        /*Minecraft.crash(crashReport);
        *///?}
    }
}
