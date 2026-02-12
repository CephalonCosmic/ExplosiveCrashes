package io.github.CephalonCosmic.explosivecrashes;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ExplosiveCrashes implements ModInitializer {
    public static final String MOD_ID = "ExplosiveCrashes";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.info("BOOM BOOM BOOM!");
    }
}
