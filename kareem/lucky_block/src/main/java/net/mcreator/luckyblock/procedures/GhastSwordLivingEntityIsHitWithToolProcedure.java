package net.mcreator.luckyblock.procedures;

import net.minecraft.entity.Entity;

import net.mcreator.luckyblock.LuckyBlockModElements;
import net.mcreator.luckyblock.LuckyBlockMod;

import java.util.Map;

@LuckyBlockModElements.ModElement.Tag
public class GhastSwordLivingEntityIsHitWithToolProcedure extends LuckyBlockModElements.ModElement {
	public GhastSwordLivingEntityIsHitWithToolProcedure(LuckyBlockModElements instance) {
		super(instance, 26);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				LuckyBlockMod.LOGGER.warn("Failed to load dependency entity for procedure GhastSwordLivingEntityIsHitWithTool!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		entity.setFire((int) 10);
	}
}
