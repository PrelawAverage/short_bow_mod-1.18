package net.prelaw.mc;

import net.fabricmc.api.ModInitializer;
import net.prelaw.mc.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ShortBowMod implements ModInitializer {

	public static final String MOD_ID = "short_bow";
	public static final Logger LOGGER = LoggerFactory.getLogger("short_bow");

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric world!");
		ModItems.registerModItems();
	}
}
