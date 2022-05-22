package de.gideonseifert.mccourse.item;

import de.gideonseifert.mccourse.MCCourseMod;
import de.gideonseifert.mccourse.item.custom.DowsingRodItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    public static final Item ORICHALCUM_INGOT = registerItem("orichalcum_ingot" ,
            new Item(new FabricItemSettings().group(ModItemGroups.COURSE)));
    public static final Item ORICHALCUM_NUGGET = registerItem("orichalcum_nugget" ,
            new Item(new FabricItemSettings().group(ModItemGroups.COURSE)));
    public static final Item RAW_ORICHALCUM = registerItem("raw_orichalcum" ,
            new Item(new FabricItemSettings().group(ModItemGroups.COURSE)));
    public static final Item MILK = registerItem("milk" ,
            new Item(new FabricItemSettings().group(ModItemGroups.FOOD)));
    public static final Item CHEESE = registerItem("cheese" ,
            new Item(new FabricItemSettings().group(ModItemGroups.FOOD).food(ModFoodComponents.CHEESE)));
    public static final Item CHEDDAR = registerItem("cheddar" ,
            new Item(new FabricItemSettings().group(ModItemGroups.FOOD).food(ModFoodComponents.CHEDDAR)));
    public static final Item TURNIP = registerItem("turnip" ,
            new Item(new FabricItemSettings().group(ModItemGroups.COURSE).food(ModFoodComponents.TURNIP)));
    public static final Item TOMATO = registerItem("tomato" ,
            new Item(new FabricItemSettings().group(ModItemGroups.FOOD).food(ModFoodComponents.TOMATO)));
    public static final Item CUCUMBER = registerItem("cucumber" ,
            new Item(new FabricItemSettings().group(ModItemGroups.FOOD)));
    public static final Item LETTUCE = registerItem("lettuce" ,
            new Item(new FabricItemSettings().group(ModItemGroups.FOOD)));
    public static final Item SESAME = registerItem("sesame" ,
            new Item(new FabricItemSettings().group(ModItemGroups.FOOD)));
    public static final Item BURGERBREAD = registerItem("burgerbread" ,
            new Item(new FabricItemSettings().group(ModItemGroups.FOOD)));
    public static final Item PATTIE = registerItem("pattie" ,
            new Item(new FabricItemSettings().group(ModItemGroups.FOOD)));
    public static final Item BURGER = registerItem("burger" ,
            new Item(new FabricItemSettings().group(ModItemGroups.FOOD).food(ModFoodComponents.BURGER)));
    public static final Item CHOCOLATE = registerItem("chocolate",
            new Item(new FabricItemSettings().group(ModItemGroups.FOOD).food(ModFoodComponents.CHOCOLATE)));
    public static final Item ICE_TOMATO = registerItem("ice_tomato",
            new Item(new FabricItemSettings().group(ModItemGroups.FOOD).food(ModFoodComponents.ICE_TOMATO)));
    public static final Item COAL_SLIVER = registerItem("coal_sliver",
            new Item(new FabricItemSettings().group(ModItemGroups.COURSE)));
    public static final Item DOWSING_ROD = registerItem("dowsing_rod",
            new DowsingRodItem(new FabricItemSettings().group(ModItemGroups.COURSE).maxDamage(32)));




    private static Item registerItem(String name, Item item){
        return Registry.register(Registry.ITEM, new Identifier(MCCourseMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        System.out.println("Registriere Items für " + MCCourseMod.MOD_ID);
    }
}
