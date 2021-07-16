package net.mcreator.luckyblock.entity.renderer;

import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.entity.model.GhastModel;
import net.minecraft.client.renderer.entity.SpriteRenderer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.Minecraft;

import net.mcreator.luckyblock.entity.WaterghastEntity;

@OnlyIn(Dist.CLIENT)
public class WaterghastRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(WaterghastEntity.entity,
					renderManager -> new MobRenderer(renderManager, new GhastModel(), 0.5f) {
						@Override
						public ResourceLocation getEntityTexture(Entity entity) {
							return new ResourceLocation("lucky_block:textures/ghast.png");
						}
					});
			RenderingRegistry.registerEntityRenderingHandler(WaterghastEntity.arrow,
					renderManager -> new SpriteRenderer(renderManager, Minecraft.getInstance().getItemRenderer()));
		}
	}
}
