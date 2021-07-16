package net.mcreator.luckyblock.procedures;

import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.luckyblock.LuckyBlockModElements;
import net.mcreator.luckyblock.LuckyBlockMod;

import java.util.Map;

@LuckyBlockModElements.ModElement.Tag
public class PepperFoodEatenProcedure extends LuckyBlockModElements.ModElement {
	public PepperFoodEatenProcedure(LuckyBlockModElements instance) {
		super(instance, 38);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				LuckyBlockMod.LOGGER.warn("Failed to load dependency entity for procedure PepperFoodEaten!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.SPEED, (int) 1e+26, (int) 100));
	}
}
