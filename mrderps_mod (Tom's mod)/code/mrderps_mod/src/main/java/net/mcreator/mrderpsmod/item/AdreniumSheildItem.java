
package net.mcreator.mrderpsmod.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.mrderpsmod.MrderpsModModElements;

@MrderpsModModElements.ModElement.Tag
public class AdreniumSheildItem extends MrderpsModModElements.ModElement {
	@ObjectHolder("mrderps_mod:adrenium_sheild")
	public static final Item block = null;
	public AdreniumSheildItem(MrderpsModModElements instance) {
		super(instance, 30);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 100000;
			}

			public float getEfficiency() {
				return 20f;
			}

			public float getAttackDamage() {
				return 4998f;
			}

			public int getHarvestLevel() {
				return 1;
			}

			public int getEnchantability() {
				return 20000;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}
		}, 3, 6f, new Item.Properties().group(ItemGroup.TOOLS).isImmuneToFire()) {
		}.setRegistryName("adrenium_sheild"));
	}
}
