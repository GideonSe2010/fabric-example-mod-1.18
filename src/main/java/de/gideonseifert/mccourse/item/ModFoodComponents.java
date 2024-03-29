package de.gideonseifert.mccourse.item;

import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
    public static FoodComponent TURNIP = new FoodComponent.Builder().hunger(2).saturationModifier(0.3f)
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 5), 1f).build();
    public static FoodComponent CHEESE = new FoodComponent.Builder().hunger(2).saturationModifier(0.3f)
            .statusEffect(new StatusEffectInstance(StatusEffects.SATURATION, 5, 10), 1f).build();
    public static FoodComponent CHEDDAR = new FoodComponent.Builder().hunger(2).saturationModifier(0.3f)
            .statusEffect(new StatusEffectInstance(StatusEffects.SATURATION, 5, 10), 1f).build();
    public static FoodComponent TOMATO = new FoodComponent.Builder().hunger(1).saturationModifier(0.3f).build();
    public static FoodComponent CUCUMBER = new FoodComponent.Builder().hunger(1).saturationModifier(0.3f).build();
    public static FoodComponent BURGER = new FoodComponent.Builder().hunger(10).saturationModifier(0.3f).build();
    public static FoodComponent CHOCOLATE = new FoodComponent.Builder().hunger(3).saturationModifier(0.3f).build();
    public static FoodComponent ICE_TOMATO = new FoodComponent.Builder().hunger(3).saturationModifier(0.3f)
            .statusEffect(new StatusEffectInstance(StatusEffects.HEALTH_BOOST, 5, 10),1f).build();
    public static FoodComponent HARD_CHEESE = new FoodComponent.Builder().hunger(2).saturationModifier(0.3f)
            .statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 600, 2), 1f).build();
    public static FoodComponent CREAM_CHEESE = new FoodComponent.Builder().hunger(2).saturationModifier(0.3f)
            .statusEffect(new StatusEffectInstance(StatusEffects.LUCK, 600, 2), 1f).build();
    public static FoodComponent GOUDA = new FoodComponent.Builder().hunger(2).saturationModifier(0.3f)
            .statusEffect(new StatusEffectInstance(StatusEffects.HASTE, 600, 2), 1f).build();
    public static FoodComponent CHEESE_BREAD = new FoodComponent.Builder().hunger(8).saturationModifier(0.3f).build();
    public static FoodComponent CHEESE_CRISPS = new FoodComponent.Builder().hunger(4).saturationModifier(0.3f)
            .statusEffect(new StatusEffectInstance(StatusEffects.HEALTH_BOOST, 400, 2), 1f).build();
    public static FoodComponent CHEESE_PIZZA = new FoodComponent.Builder().hunger(15).saturationModifier(0.3f).build();





}
