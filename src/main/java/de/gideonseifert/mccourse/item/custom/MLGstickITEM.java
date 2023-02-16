package de.gideonseifert.mccourse.item.custom;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.BlockPos;

public class MLGstickITEM extends Item {
    public MLGstickITEM(Settings settings) {super(settings);}
    public ActionResult useOnBlock(ItemUsageContext context){
        PlayerEntity player = context.getPlayer();
        player.addStatusEffect(new StatusEffectInstance(StatusEffects.SLOW_FALLING,100 ,255));
        player.sendMessage(new TranslatableText("item.mccourse.mlg_stick.getreadyforthis"),false);
        player.setPosition(player.getX(), 219, player.getZ());
        return super.useOnBlock(context);
    }
}
