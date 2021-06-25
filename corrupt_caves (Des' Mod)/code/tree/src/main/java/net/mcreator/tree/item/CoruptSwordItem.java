
package net.mcreator.tree.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.tree.TreeModElements;

@TreeModElements.ModElement.Tag
public class CoruptSwordItem extends TreeModElements.ModElement {
	@ObjectHolder("tree:corupt_sword")
	public static final Item block = null;
	public CoruptSwordItem(TreeModElements instance) {
		super(instance, 7);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 100;
			}

			public float getEfficiency() {
				return 11f;
			}

			public float getAttackDamage() {
				return 198f;
			}

			public int getHarvestLevel() {
				return 4;
			}

			public int getEnchantability() {
				return 11;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(ArdaniumingotItem.block, (int) (1)));
			}
		}, 3, -2f, new Item.Properties().group(ItemGroup.COMBAT).isImmuneToFire()) {
		}.setRegistryName("corupt_sword"));
	}
}
