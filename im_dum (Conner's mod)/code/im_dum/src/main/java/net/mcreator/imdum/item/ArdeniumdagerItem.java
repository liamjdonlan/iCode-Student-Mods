
package net.mcreator.imdum.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.imdum.ImDumModElements;

@ImDumModElements.ModElement.Tag
public class ArdeniumdagerItem extends ImDumModElements.ModElement {
	@ObjectHolder("im_dum:ardeniumdager")
	public static final Item block = null;
	public ArdeniumdagerItem(ImDumModElements instance) {
		super(instance, 10);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 101;
			}

			public float getEfficiency() {
				return 4f;
			}

			public float getAttackDamage() {
				return 28f;
			}

			public int getHarvestLevel() {
				return 1;
			}

			public int getEnchantability() {
				return 2;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}
		}, 3, -2.4000000000000001f, new Item.Properties().group(ItemGroup.COMBAT).isImmuneToFire()) {
		}.setRegistryName("ardeniumdager"));
	}
}
