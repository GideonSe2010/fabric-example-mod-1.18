package de.gideonseifert.mccourse.enchanment;

import de.gideonseifert.mccourse.MCCourseMod;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;



public class ModEnchanments {

    public static Enchantment LIGHTNING_STRIKER = register("lightning_striker",
            new LightningStrikerEnchantment(Enchantment.Rarity.UNCOMMON,
                    EnchantmentTarget.WEAPON, EquipmentSlot.MAINHAND));


    private static Enchantment register(String name, Enchantment enchantment){
        return Registry.register(Registry.ENCHANTMENT, new Identifier(MCCourseMod.MOD_ID, name), enchantment);
    }

    public static void registerModEnchantments(){
        System.out.println("Register ModEnchantments for" + MCCourseMod.MOD_ID);
    }



}
