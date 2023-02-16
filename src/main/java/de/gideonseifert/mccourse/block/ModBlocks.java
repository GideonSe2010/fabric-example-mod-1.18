package de.gideonseifert.mccourse.block;

import de.gideonseifert.mccourse.MCCourseMod;
import de.gideonseifert.mccourse.block.custom.HasteBlock;
import de.gideonseifert.mccourse.block.custom.HealBlock;
import de.gideonseifert.mccourse.block.custom.ModStairsBlock;
import de.gideonseifert.mccourse.block.custom.SpeedyBlock;
import de.gideonseifert.mccourse.item.ModItemGroups;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.StairsBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {


    public static final Block ORICHALCUM_BLOCK = registerBlock("orichalcum_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(6f)), ModItemGroups.COURSE);
    public static final Block ORICHALCUM_ORE = registerBlock("orichalcum_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(6f)), ModItemGroups.COURSE);
    public static final Block DEEPSLATE_ORICHALCUM_ORE = registerBlock("deepslate_orichalcum_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(6f)), ModItemGroups.COURSE);
    public static final Block RAW_ORICHALCUM_BLOCK = registerBlock("raw_orichalcum_block",
            new Block(FabricBlockSettings.of(Material.STONE).strength(6f)), ModItemGroups.COURSE);
    public static final Block LIDL_BLOCK = registerBlock("lidl_block",
            new Block(FabricBlockSettings.of(Material.WOOL).strength(6f)), ModItemGroups.COURSE);
    public static final Block CHEESE_BLOCK = registerBlock("cheese_block",
            new Block(FabricBlockSettings.of(Material.WOOL).strength(6f)), ModItemGroups.FOOD);
    public static final Block ORICHALCUM_STAIRS = registerBlock("orichalcum_stairs",
            new ModStairsBlock(ModBlocks.ORICHALCUM_BLOCK.getDefaultState()
                    ,FabricBlockSettings.of(Material.STONE).strength(6f)), ModItemGroups.COURSE);
    public static final Block ORICHALCUM_SLAB = registerBlock("orichalcum_slab",
            new SlabBlock(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroups.COURSE);
    public static final Block SPEEDY_BLOCK = registerBlock("speedy_block",
            new SpeedyBlock(FabricBlockSettings.of(Material.STONE).strength(6f)), ModItemGroups.COURSE);
    public static final Block SLIME_BLOCK = registerBlock("slime_block",
            new Block(FabricBlockSettings.of(Material.WOOD).strength(6f)), ModItemGroups.COURSE);
    public static final Block HEALTH_BLOCK = registerBlock("health_block",
            new HealBlock(FabricBlockSettings.of(Material.STONE).strength(6f)), ModItemGroups.COURSE);
    public static final Block HASTE_BLOCK = registerBlock("haste_block",
            new HasteBlock(FabricBlockSettings.of(Material.STONE).strength(6f)), ModItemGroups.COURSE);
    public static final Block ONE_COMPRESSED_STONE_BLOCK = registerBlock("one_compressed_stone_block",
            new Block(FabricBlockSettings.of(Material.STONE).strength(10f)), ModItemGroups.STONE);
    public static final Block DOUBLE_COMPRESSED_STONE_BLOCK = registerBlock("double_compressed_stone_block",
            new Block(FabricBlockSettings.of(Material.STONE).strength(12f)), ModItemGroups.STONE);

    private static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registry.BLOCK, new Identifier(MCCourseMod.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group) {
        return Registry.register(Registry.ITEM, new Identifier(MCCourseMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(group)));
    }

    public static void registerModBlocks() {
        System.out.println("Registering Mod Blocks for " + MCCourseMod.MOD_ID);
    }
}
