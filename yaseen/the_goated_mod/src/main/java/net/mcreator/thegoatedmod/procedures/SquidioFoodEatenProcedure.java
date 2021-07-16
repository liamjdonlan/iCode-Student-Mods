package net.mcreator.thegoatedmod.procedures;

import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.thegoatedmod.TheGoatedModModElements;
import net.mcreator.thegoatedmod.TheGoatedModMod;

import java.util.Map;

@TheGoatedModModElements.ModElement.Tag
public class SquidioFoodEatenProcedure extends TheGoatedModModElements.ModElement {
	public SquidioFoodEatenProcedure(TheGoatedModModElements instance) {
		super(instance, 33);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				TheGoatedModMod.LOGGER.warn("Failed to load dependency entity for procedure SquidioFoodEaten!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.SPEED, (int) 1000000000, (int) 1000));
	}
}
