package de.gideonseifert.mccourse.item;

import de.gideonseifert.mccourse.MCCourseMod;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup COURSE = FabricItemGroupBuilder.build(new Identifier(MCCourseMod.MOD_ID,"course"),
            () -> new ItemStack(ModItems.ORICHALCUM_INGOT));
    public static final ItemGroup FOOD = FabricItemGroupBuilder.build(new Identifier(MCCourseMod.MOD_ID,"food"),
            () -> new ItemStack(ModItems.LETTUCE));
}
