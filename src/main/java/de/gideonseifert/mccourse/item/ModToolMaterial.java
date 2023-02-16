package de.gideonseifert.mccourse.item;

import net.fabricmc.yarn.constants.MiningLevels;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.tag.ItemTags;
import net.minecraft.util.Lazy;

import java.util.function.Supplier;

public enum ModToolMaterial implements ToolMaterial {

    ORICHALCUM(MiningLevels.IRON, 450, 4.5F, 3.5F, 25, () ->
        Ingredient.ofItems(ModItems.ORICHALCUM_INGOT)),
    CHEESE(MiningLevels.IRON, 100, 0.75F, 1.5F, 10, () ->
            Ingredient.ofItems(ModItems.CHEESE)),
    EMERALD(MiningLevels.IRON, 75, 0.75F, 1.5F, 10, () ->
            Ingredient.ofItems(Items.EMERALD)),
    OBSIDIAN(MiningLevels.DIAMOND, 150, 4F, 3F, 15, () ->
            Ingredient.ofItems(Items.OBSIDIAN)),
    REDSTONE(MiningLevels.IRON, 100, 2.5F, 2.25F, 13, () ->
            Ingredient.ofItems(Items.REDSTONE)),
    LAPIS_LAZULI(MiningLevels.IRON, 100, 2.5F, 2.25F, 13, () ->
            Ingredient.ofItems(Items.LAPIS_LAZULI)),
    COPPER(MiningLevels.IRON, 75, 0.75F, 1.5F, 10, () ->
            Ingredient.ofItems(Items.COPPER_INGOT));



    private final int miningLevel;
    private final int itemDurability;
    private final float miningSpeed;
    private final float attackDamage;
    private final int enchantability;
    private final Lazy<Ingredient> repairIngredient;

    private ModToolMaterial(int miningLevel, int itemDurability, float miningSpeed, float attackDamage, int enchantability, Supplier<Ingredient> repairIngredient) {
        this.miningLevel = miningLevel;
        this.itemDurability = itemDurability;
        this.miningSpeed = miningSpeed;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairIngredient = new Lazy(repairIngredient);
    }

    public int getDurability() {
        return this.itemDurability;
    }

    public float getMiningSpeedMultiplier() {
        return this.miningSpeed;
    }

    public float getAttackDamage() {
        return this.attackDamage;
    }

    public int getMiningLevel() {
        return this.miningLevel;
    }

    public int getEnchantability() {
        return this.enchantability;
    }

    public Ingredient getRepairIngredient() {
        return (Ingredient)this.repairIngredient.get();
    }
}
