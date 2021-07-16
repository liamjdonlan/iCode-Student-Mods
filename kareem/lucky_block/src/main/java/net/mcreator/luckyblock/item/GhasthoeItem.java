
package net.mcreator.luckyblock.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.HoeItem;

import net.mcreator.luckyblock.LuckyBlockModElements;

@LuckyBlockModElements.ModElement.Tag
public class GhasthoeItem extends LuckyBlockModElements.ModElement {
	@ObjectHolder("lucky_block:ghasthoe")
	public static final Item block = null;
	public GhasthoeItem(LuckyBlockModElements instance) {
		super(instance, 16);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new HoeItem(new IItemTier() {
			public int getMaxUses() {
				return 100;
			}

			public float getEfficiency() {
				return 4f;
			}

			public float getAttackDamage() {
				return 2f;
			}

			public int getHarvestLevel() {
				return 0;
			}

			public int getEnchantability() {
				return 2;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}
		}, 0, -3f, new Item.Properties().group(ItemGroup.TOOLS)) {
		}.setRegistryName("ghasthoe"));
	}
}
