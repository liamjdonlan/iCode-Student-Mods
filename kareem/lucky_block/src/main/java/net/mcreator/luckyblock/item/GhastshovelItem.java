
package net.mcreator.luckyblock.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.luckyblock.LuckyBlockModElements;

@LuckyBlockModElements.ModElement.Tag
public class GhastshovelItem extends LuckyBlockModElements.ModElement {
	@ObjectHolder("lucky_block:ghastshovel")
	public static final Item block = null;
	public GhastshovelItem(LuckyBlockModElements instance) {
		super(instance, 14);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ShovelItem(new IItemTier() {
			public int getMaxUses() {
				return 128000;
			}

			public float getEfficiency() {
				return 128000f;
			}

			public float getAttackDamage() {
				return 2f;
			}

			public int getHarvestLevel() {
				return 128000;
			}

			public int getEnchantability() {
				return 2;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}
		}, 1, -3f, new Item.Properties().group(ItemGroup.TOOLS).isImmuneToFire()) {
		}.setRegistryName("ghastshovel"));
	}
}
