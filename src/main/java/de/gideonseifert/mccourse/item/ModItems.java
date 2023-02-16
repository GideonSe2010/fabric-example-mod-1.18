package de.gideonseifert.mccourse.item;

import de.gideonseifert.mccourse.MCCourseMod;
import de.gideonseifert.mccourse.item.custom.*;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
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
    public static final Item ORICHALCUM_PICKAXE = registerItem("orichalcum_pickaxe",
            new ModPickaxeItem(ModToolMaterial.ORICHALCUM,2,2f,
                    new FabricItemSettings().group(ModItemGroups.COURSE)));
    public static final Item ORICHALCUM_AXE = registerItem("orichalcum_axe",
            new ModAxeItem(ModToolMaterial.ORICHALCUM,3,1f,
                    new FabricItemSettings().group(ModItemGroups.COURSE)));
    public static final Item ORICHALCUM_HOE = registerItem("orichalcum_hoe",
            new ModHoeItem(ModToolMaterial.ORICHALCUM,0,0f,
                    new FabricItemSettings().group(ModItemGroups.COURSE)));
    public static final Item ORICHALCUM_SWORD = registerItem("orichalcum_sword",
            new SwordItem(ModToolMaterial.ORICHALCUM,3,3f,
                    new FabricItemSettings().group(ModItemGroups.COURSE)));
    public static final Item ORICHALCUM_SHOVEl = registerItem("orichalcum_shovel",
            new ShovelItem(ModToolMaterial.ORICHALCUM,1,2f,
                    new FabricItemSettings().group(ModItemGroups.COURSE)));
    public static final Item CHEESE_PICKAXE = registerItem("cheese_pickaxe",
            new ModPickaxeItem(ModToolMaterial.CHEESE,1,1f,
                    new FabricItemSettings().group(ModItemGroups.FOOD)));
    public static final Item CHEESE_AXE = registerItem("cheese_axe",
            new ModAxeItem(ModToolMaterial.CHEESE,2,1f,
                    new FabricItemSettings().group(ModItemGroups.FOOD)));
    public static final Item CHEESE_HOE = registerItem("cheese_hoe",
            new ModHoeItem(ModToolMaterial.CHEESE,0,0f,
                    new FabricItemSettings().group(ModItemGroups.FOOD)));
    public static final Item CHEESE_SWORD = registerItem("cheese_sword",
            new ModNauseaSword(ModToolMaterial.CHEESE,3,3f,
                    new FabricItemSettings().group(ModItemGroups.FOOD)));
    public static final Item CHEESE_SHOVEl = registerItem("cheese_shovel",
            new ShovelItem(ModToolMaterial.CHEESE,1,2f,
                    new FabricItemSettings().group(ModItemGroups.FOOD)));
    public static final Item ORICHALCUM_HELMET = registerItem("orichalcum_helmet",
            new ModArmorItem(ModArmorMaterials.ORICHALCUM, EquipmentSlot.HEAD,
                    new FabricItemSettings().group(ModItemGroups.FOOD)));
    public static final Item ORICHALCUM_CHESTPLATE = registerItem("orichalcum_chestplate",
            new ModArmorItem(ModArmorMaterials.ORICHALCUM, EquipmentSlot.CHEST,
                    new FabricItemSettings().group(ModItemGroups.FOOD)));
    public static final Item ORICHALCUM_LEGGINS = registerItem("orichalcum_leggins",
            new ModArmorItem(ModArmorMaterials.ORICHALCUM, EquipmentSlot.LEGS,
                    new FabricItemSettings().group(ModItemGroups.FOOD)));
    public static final Item ORICHALCUM_BOOTS = registerItem("orichalcum_boots",
            new ModArmorItem(ModArmorMaterials.ORICHALCUM, EquipmentSlot.FEET,
                    new FabricItemSettings().group(ModItemGroups.FOOD)));
    public static final Item CHEESE_HELMET = registerItem("cheese_helmet",
            new ModArmorItem(ModArmorMaterials.CHEESE, EquipmentSlot.HEAD,
                    new FabricItemSettings().group(ModItemGroups.FOOD)));
    public static final Item CHEESE_CHESTPLATE = registerItem("cheese_chestplate",
            new ModArmorItem(ModArmorMaterials.CHEESE, EquipmentSlot.CHEST,
                    new FabricItemSettings().group(ModItemGroups.FOOD)));
    public static final Item CHEESE_LEGGINS = registerItem("cheese_leggins",
            new ModArmorItem(ModArmorMaterials.CHEESE, EquipmentSlot.LEGS,
                    new FabricItemSettings().group(ModItemGroups.FOOD)));
    public static final Item CHEESE_BOOTS = registerItem("cheese_boots",
            new ModArmorItem(ModArmorMaterials.CHEESE, EquipmentSlot.FEET,
                    new FabricItemSettings().group(ModItemGroups.FOOD)));
    public static final Item ORICHALCUM_HORSE_ARMOR = registerItem("orichalcum_horse_armor",
            new HorseArmorItem(15,"orichalcum",
                    new FabricItemSettings().group(ModItemGroups.COURSE)));
    public static final Item CHEESE_HORSE_ARMOR = registerItem("cheese_horse_armor",
            new HorseArmorItem(15,"cheese",
                    new FabricItemSettings().group(ModItemGroups.FOOD)));
    public static final Item MLG_STICK = registerItem("mlg_stick",
            new MLGstickITEM(new FabricItemSettings().group(ModItemGroups.COURSE).maxDamage(32)));
    public static final Item GOUDA = registerItem("gouda" ,
            new Item(new FabricItemSettings().group(ModItemGroups.FOOD).food(ModFoodComponents.GOUDA)));
    public static final Item HARD_CHEESE = registerItem("hard_cheese" ,
            new Item(new FabricItemSettings().group(ModItemGroups.FOOD).food(ModFoodComponents.HARD_CHEESE)));
    public static final Item CREAM_CHEESE = registerItem("cream_cheese" ,
            new Item(new FabricItemSettings().group(ModItemGroups.FOOD).food(ModFoodComponents.CREAM_CHEESE)));
    public static final Item CHEESE_CRISPS = registerItem("cheese_crisps" ,
            new Item(new FabricItemSettings().group(ModItemGroups.FOOD).food(ModFoodComponents.CHEESE_CRISPS)));
    public static final Item CHEESE_BREAD = registerItem("cheese_bread" ,
            new Item(new FabricItemSettings().group(ModItemGroups.FOOD).food(ModFoodComponents.CHEESE_BREAD)));
    public static final Item CHEESE_PIZZA = registerItem("cheese_pizza" ,
            new Item(new FabricItemSettings().group(ModItemGroups.FOOD).food(ModFoodComponents.CHEESE_PIZZA)));
    public static final Item PIZZA_DOUGH = registerItem("pizza_dough" ,
            new Item(new FabricItemSettings().group(ModItemGroups.FOOD)));
    public static final Item REDSTONE_HELMET = registerItem("redstone_helmet",
            new ModArmorItem(ModArmorMaterials.REDSTONE, EquipmentSlot.HEAD,
                    new FabricItemSettings().group(ModItemGroups.COURSE)));
    public static final Item REDSTONE_CHESTPLATE = registerItem("redstone_chestplate",
            new ModArmorItem(ModArmorMaterials.REDSTONE, EquipmentSlot.CHEST,
                    new FabricItemSettings().group(ModItemGroups.COURSE)));
    public static final Item REDSTONE_LEGGINS = registerItem("redstone_leggins",
            new ModArmorItem(ModArmorMaterials.REDSTONE, EquipmentSlot.LEGS,
                    new FabricItemSettings().group(ModItemGroups.COURSE)));
    public static final Item REDSTONE_BOOTS = registerItem("redstone_boots",
            new ModArmorItem(ModArmorMaterials.REDSTONE, EquipmentSlot.FEET,
                    new FabricItemSettings().group(ModItemGroups.COURSE)));
    public static final Item EMERALD_HELMET = registerItem("emerald_helmet",
            new ModArmorItem(ModArmorMaterials.EMERALD, EquipmentSlot.HEAD,
                    new FabricItemSettings().group(ModItemGroups.COURSE)));
    public static final Item EMERALD_CHESTPLATE = registerItem("emerald_chestplate",
            new ModArmorItem(ModArmorMaterials.EMERALD, EquipmentSlot.CHEST,
                    new FabricItemSettings().group(ModItemGroups.COURSE)));
    public static final Item EMERALD_LEGGINS = registerItem("emerald_leggins",
            new ModArmorItem(ModArmorMaterials.EMERALD, EquipmentSlot.LEGS,
                    new FabricItemSettings().group(ModItemGroups.COURSE)));
    public static final Item EMERALD_BOOTS = registerItem("emerald_boots",
            new ModArmorItem(ModArmorMaterials.EMERALD, EquipmentSlot.FEET,
                    new FabricItemSettings().group(ModItemGroups.COURSE)));
    public static final Item LAPIS_LAZULI_HELMET = registerItem("lapis_lazuli_helmet",
            new ModArmorItem(ModArmorMaterials.LAPIS_LAZULI, EquipmentSlot.HEAD,
                    new FabricItemSettings().group(ModItemGroups.COURSE)));
    public static final Item LAPIS_LAZULI_CHESTPLATE = registerItem("lapis_lazuli_chestplate",
            new ModArmorItem(ModArmorMaterials.LAPIS_LAZULI, EquipmentSlot.CHEST,
                    new FabricItemSettings().group(ModItemGroups.COURSE)));
    public static final Item LAPIS_LAZULI_LEGGINS = registerItem("lapis_lazuli_leggins",
            new ModArmorItem(ModArmorMaterials.LAPIS_LAZULI, EquipmentSlot.LEGS,
                    new FabricItemSettings().group(ModItemGroups.COURSE)));
    public static final Item LAPIS_LAZULI_BOOTS = registerItem("lapis_lazuli_boots",
            new ModArmorItem(ModArmorMaterials.LAPIS_LAZULI, EquipmentSlot.FEET,
                    new FabricItemSettings().group(ModItemGroups.COURSE)));
    public static final Item OBSIDIAN_HELMET = registerItem("obsidian_helmet",
            new ModArmorItem(ModArmorMaterials.OBSIDIAN, EquipmentSlot.HEAD,
                    new FabricItemSettings().group(ModItemGroups.COURSE)));
    public static final Item OBSIDIAN_CHESTPLATE = registerItem("obsidian_chestplate",
            new ModArmorItem(ModArmorMaterials.OBSIDIAN, EquipmentSlot.CHEST,
                    new FabricItemSettings().group(ModItemGroups.COURSE)));
    public static final Item OBSIDIAN_LEGGINS = registerItem("obsidian_leggins",
            new ModArmorItem(ModArmorMaterials.OBSIDIAN, EquipmentSlot.LEGS,
                    new FabricItemSettings().group(ModItemGroups.COURSE)));
    public static final Item OBSIDIAN_BOOTS = registerItem("obsidian_boots",
            new ModArmorItem(ModArmorMaterials.OBSIDIAN, EquipmentSlot.FEET,
                    new FabricItemSettings().group(ModItemGroups.COURSE)));
    public static final Item COPPER_HELMET = registerItem("copper_helmet",
            new ModArmorItem(ModArmorMaterials.COPPER, EquipmentSlot.HEAD,
                    new FabricItemSettings().group(ModItemGroups.COURSE)));
    public static final Item COPPER_CHESTPLATE = registerItem("copper_chestplate",
            new ModArmorItem(ModArmorMaterials.COPPER, EquipmentSlot.CHEST,
                    new FabricItemSettings().group(ModItemGroups.COURSE)));
    public static final Item COPPER_LEGGINS = registerItem("copper_leggins",
            new ModArmorItem(ModArmorMaterials.COPPER, EquipmentSlot.LEGS,
                    new FabricItemSettings().group(ModItemGroups.COURSE)));
    public static final Item COPPER_BOOTS = registerItem("copper_boots",
            new ModArmorItem(ModArmorMaterials.COPPER, EquipmentSlot.FEET,
                    new FabricItemSettings().group(ModItemGroups.COURSE)));
    public static final Item COPPER_PICKAXE = registerItem("copper_pickaxe",
            new ModPickaxeItem(ModToolMaterial.COPPER,1,1f,
                    new FabricItemSettings().group(ModItemGroups.COURSE)));
    public static final Item COPPER_AXE = registerItem("copper_axe",
            new ModAxeItem(ModToolMaterial.COPPER,2,1f,
                    new FabricItemSettings().group(ModItemGroups.COURSE)));
    public static final Item COPPER_HOE = registerItem("copper_hoe",
            new ModHoeItem(ModToolMaterial.COPPER,0,0f,
                    new FabricItemSettings().group(ModItemGroups.COURSE)));
    public static final Item COPPER_SWORD = registerItem("copper_sword",
            new ModNauseaSword(ModToolMaterial.COPPER,3,3f,
                    new FabricItemSettings().group(ModItemGroups.COURSE)));
    public static final Item COPPER_SHOVEl = registerItem("copper_shovel",
            new ShovelItem(ModToolMaterial.COPPER,1,2f,
                    new FabricItemSettings().group(ModItemGroups.COURSE)));
    public static final Item REDSTONE_PICKAXE = registerItem("redstone_pickaxe",
            new ModPickaxeItem(ModToolMaterial.REDSTONE,2,1.5f,
                    new FabricItemSettings().group(ModItemGroups.COURSE)));
    public static final Item REDSTONE_AXE = registerItem("redstone_axe",
            new ModAxeItem(ModToolMaterial.CHEESE,2.5f,1f,
                    new FabricItemSettings().group(ModItemGroups.COURSE)));
    public static final Item REDSTONE_HOE = registerItem("redstone_hoe",
            new ModHoeItem(ModToolMaterial.REDSTONE,1,1f,
                    new FabricItemSettings().group(ModItemGroups.COURSE)));
    public static final Item REDSTONE_SWORD = registerItem("redstone_sword",
            new ModNauseaSword(ModToolMaterial.REDSTONE,3,3f,
                    new FabricItemSettings().group(ModItemGroups.COURSE)));
    public static final Item REDSTONE_SHOVEl = registerItem("redstone_shovel",
            new ShovelItem(ModToolMaterial.REDSTONE,1,2f,
                    new FabricItemSettings().group(ModItemGroups.COURSE)));
    public static final Item LAPIS_LAZULI_PICKAXE = registerItem("lapis_lazuli_pickaxe",
            new ModPickaxeItem(ModToolMaterial.LAPIS_LAZULI,2,1.5f,
                    new FabricItemSettings().group(ModItemGroups.COURSE)));
    public static final Item LAPIS_LAZULI_AXE = registerItem("lapis_lazuli_axe",
            new ModAxeItem(ModToolMaterial.LAPIS_LAZULI,2.5f,1f,
                    new FabricItemSettings().group(ModItemGroups.COURSE)));
    public static final Item LAPIS_LAZULI_HOE = registerItem("lapis_lazuli_hoe",
            new ModHoeItem(ModToolMaterial.LAPIS_LAZULI,1,1f,
                    new FabricItemSettings().group(ModItemGroups.COURSE)));
    public static final Item LAPIS_LAZULI_SWORD = registerItem("lapis_lazuli_sword",
            new ModNauseaSword(ModToolMaterial.LAPIS_LAZULI,3,3f,
                    new FabricItemSettings().group(ModItemGroups.COURSE)));
    public static final Item LAPIS_LAZULI_SHOVEl = registerItem("lapis_lazuli_shovel",
            new ShovelItem(ModToolMaterial.LAPIS_LAZULI,1,2f,
                    new FabricItemSettings().group(ModItemGroups.COURSE)));
    public static final Item EMERALD_PICKAXE = registerItem("emerald_pickaxe",
            new ModPickaxeItem(ModToolMaterial.EMERALD,1,1f,
                    new FabricItemSettings().group(ModItemGroups.COURSE)));
    public static final Item EMERALD_AXE = registerItem("emerald_axe",
            new ModAxeItem(ModToolMaterial.EMERALD,2,1f,
                    new FabricItemSettings().group(ModItemGroups.COURSE)));
    public static final Item EMERALD_HOE = registerItem("emerald_hoe",
            new ModHoeItem(ModToolMaterial.EMERALD,0,0f,
                    new FabricItemSettings().group(ModItemGroups.COURSE)));
    public static final Item EMERALD_SWORD = registerItem("emerald_sword",
            new ModNauseaSword(ModToolMaterial.EMERALD,3,3f,
                    new FabricItemSettings().group(ModItemGroups.COURSE)));
    public static final Item EMERALD_SHOVEl = registerItem("emerald_shovel",
            new ShovelItem(ModToolMaterial.EMERALD,1,2f,
                    new FabricItemSettings().group(ModItemGroups.COURSE)));
    public static final Item OBSIDIAN_PICKAXE = registerItem("obsidian_pickaxe",
            new ModPickaxeItem(ModToolMaterial.OBSIDIAN,2,2f,
                    new FabricItemSettings().group(ModItemGroups.COURSE)));
    public static final Item OBSIDIAN_AXE = registerItem("obsidian_axe",
            new ModAxeItem(ModToolMaterial.OBSIDIAN,3,1f,
                    new FabricItemSettings().group(ModItemGroups.COURSE)));
    public static final Item OBSIDIAN_HOE = registerItem("obsidian_hoe",
            new ModHoeItem(ModToolMaterial.OBSIDIAN,0,0f,
                    new FabricItemSettings().group(ModItemGroups.COURSE)));
    public static final Item OBSIDIAN_SWORD = registerItem("obsidian_sword",
            new SwordItem(ModToolMaterial.OBSIDIAN,3,3f,
                    new FabricItemSettings().group(ModItemGroups.COURSE)));
    public static final Item OBSIDIAN_SHOVEl = registerItem("obsidian_shovel",
            new ShovelItem(ModToolMaterial.OBSIDIAN,1,2f,
                    new FabricItemSettings().group(ModItemGroups.COURSE)));
    public static final Item SQUID_GAME_HELMET = registerItem("squid_game_helmet",
            new ModArmorItem(ModArmorMaterials.SQUID_GAME, EquipmentSlot.HEAD,
                    new FabricItemSettings().group(ModItemGroups.COURSE)));
    public static final Item SQUID_GAME_CHESTPLATE = registerItem("squid_game_chestplate",
            new ModArmorItem(ModArmorMaterials.SQUID_GAME, EquipmentSlot.CHEST,
                    new FabricItemSettings().group(ModItemGroups.COURSE)));
    public static final Item SQUID_GAME_LEGGINS = registerItem("squid_game_leggins",
            new ModArmorItem(ModArmorMaterials.SQUID_GAME, EquipmentSlot.LEGS,
                    new FabricItemSettings().group(ModItemGroups.COURSE)));
    public static final Item SQUID_GAME_BOOTS = registerItem("squid_game_boots",
            new ModArmorItem(ModArmorMaterials.SQUID_GAME, EquipmentSlot.FEET,
                    new FabricItemSettings().group(ModItemGroups.COURSE)));




    private static Item registerItem(String name, Item item){
        return Registry.register(Registry.ITEM, new Identifier(MCCourseMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        System.out.println("Registriere Items für " + MCCourseMod.MOD_ID);
    }
}
