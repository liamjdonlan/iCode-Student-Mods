
package net.mcreator.mrderpsmod.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.mrderpsmod.MrderpsModModElements;

@MrderpsModModElements.ModElement.Tag
public class AdreniumSwordItem extends MrderpsModModElements.ModElement {
	@ObjectHolder("mrderps_mod:adrenium_sword")
	public static final Item block = null;
	public AdreniumSwordItem(MrderpsModModElements instance) {
		super(instance, 12);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 1000;
			}

			public float getEfficiency() {
				return 4f;
			}

			public float getAttackDamage() {
				return 6f;
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
		}, 3, 2f, new Item.Properties().group(ItemGroup.COMBAT)) {
		}.setRegistryName("adrenium_sword"));
	}
}
