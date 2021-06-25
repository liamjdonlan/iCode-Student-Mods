
package net.mcreator.acombinationofweirdthings.block;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.loot.LootContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.BlockItem;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.BlockState;
import net.minecraft.block.Block;

import net.mcreator.acombinationofweirdthings.ACombinationOfWeirdThingsModElements;

import java.util.List;
import java.util.Collections;

@ACombinationOfWeirdThingsModElements.ModElement.Tag
public class WeirdBlockBlock extends ACombinationOfWeirdThingsModElements.ModElement {
	@ObjectHolder("a_combination_of_weird_things:weird_block")
	public static final Block block = null;
	public WeirdBlockBlock(ACombinationOfWeirdThingsModElements instance) {
		super(instance, 2);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items
				.add(() -> new BlockItem(block, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName(block.getRegistryName()));
	}
	public static class CustomBlock extends Block {
		public CustomBlock() {
			super(Block.Properties.create(Material.IRON).sound(SoundType.PLANT).hardnessAndResistance(0.7999999999999999f, 40f).setLightLevel(s -> 1)
					.slipperiness(3f).speedFactor(1.5f).jumpFactor(4f).setNeedsPostProcessing((bs, br, bp) -> true)
					.setEmmisiveRendering((bs, br, bp) -> true));
			setRegistryName("weird_block");
		}

		@Override
		public MaterialColor getMaterialColor() {
			return MaterialColor.IRON;
		}

		@Override
		public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
			List<ItemStack> dropsOriginal = super.getDrops(state, builder);
			if (!dropsOriginal.isEmpty())
				return dropsOriginal;
			return Collections.singletonList(new ItemStack(this, 1));
		}
	}
}
