package de.gideonseifert.mccourse.util;

import de.gideonseifert.mccourse.MCCourseMod;
import de.gideonseifert.mccourse.item.ModItems;
import net.fabricmc.fabric.api.registry.FuelRegistry;

public class ModRegistries {
    public static void registerModStuffs() {
        registerFuels();
    }

    private static void registerFuels() {
        System.out.println("Register Fuels for" + MCCourseMod.MOD_ID);
        FuelRegistry registry = FuelRegistry.INSTANCE;

        // 400 / 20 = 20 Seconds
        registry.add(ModItems.COAL_SLIVER, 400);
    }
}
