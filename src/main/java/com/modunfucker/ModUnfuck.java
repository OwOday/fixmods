package com.modunfucker;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ModUnfuck implements ModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("modid");

	@Override
	public void onInitialize() {
        LOGGER.info("Unfuck initialized");
	}
}