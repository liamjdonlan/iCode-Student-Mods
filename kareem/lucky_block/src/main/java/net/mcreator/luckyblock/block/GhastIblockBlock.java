
package net.mcreator.luckyblock.block;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.common.ToolType;

import net.minecraft.loot.LootContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.BlockItem;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.BlockState;
import net.minecraft.block.Block;

import net.mcreator.luckyblock.LuckyBlockModElements;

import java.util.List;
import java.util.Collections;

@LuckyBlockModElements.ModElement.Tag
public class GhastIblockBlock extends LuckyBlockModElements.ModElement {
	@ObjectHolder("lucky_block:ghast_iblock")
	public static final Block block = null;
	public GhastIblockBlock(LuckyBlockModElements instance) {
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
			super(Block.Properties.create(Material.IRON).sound(SoundType.METAL).hardnessAndResistance(20f, 1000f).setLightLevel(s -> 0)
					.harvestLevel(4).harvestTool(ToolType.PICKAXE).setRequiresTool());
			setRegistryName("ghast_iblock");
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
