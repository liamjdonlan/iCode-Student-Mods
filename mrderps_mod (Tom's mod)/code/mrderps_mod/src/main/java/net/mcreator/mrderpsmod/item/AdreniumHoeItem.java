
package net.mcreator.mrderpsmod.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.HoeItem;

import net.mcreator.mrderpsmod.MrderpsModModElements;

@MrderpsModModElements.ModElement.Tag
public class AdreniumHoeItem extends MrderpsModModElements.ModElement {
	@ObjectHolder("mrderps_mod:adrenium_hoe")
	public static final Item block = null;
	public AdreniumHoeItem(MrderpsModModElements instance) {
		super(instance, 19);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new HoeItem(new IItemTier() {
			public int getMaxUses() {
				return 1200;
			}

			public float getEfficiency() {
				return 5f;
			}

			public float getAttackDamage() {
				return 0.5f;
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
		}, 0, -3f, new Item.Properties().group(ItemGroup.TOOLS).isImmuneToFire()) {
		}.setRegistryName("adrenium_hoe"));
	}
}
