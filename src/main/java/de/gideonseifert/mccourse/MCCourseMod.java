package de.gideonseifert.mccourse;

import de.gideonseifert.mccourse.block.ModBlocks;
import de.gideonseifert.mccourse.enchanment.ModEnchanments;
import de.gideonseifert.mccourse.item.ModItems;
import de.gideonseifert.mccourse.util.ModRegistries;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MCCourseMod implements ModInitializer {

	public static final String MOD_ID = "mccourse";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModRegistries.registerModStuffs();
		ModEnchanments.registerModEnchantments();
	}
}
