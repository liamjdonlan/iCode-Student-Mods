
package net.mcreator.mrderpsmod.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.AxeItem;

import net.mcreator.mrderpsmod.MrderpsModModElements;

@MrderpsModModElements.ModElement.Tag
public class AdreniumAxeItem extends MrderpsModModElements.ModElement {
	@ObjectHolder("mrderps_mod:adrenium_axe")
	public static final Item block = null;
	public AdreniumAxeItem(MrderpsModModElements instance) {
		super(instance, 17);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new AxeItem(new IItemTier() {
			public int getMaxUses() {
				return 1000;
			}

			public float getEfficiency() {
				return 8f;
			}

			public float getAttackDamage() {
				return 11f;
			}

			public int getHarvestLevel() {
				return 1;
			}

			public int getEnchantability() {
				return 16;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}
		}, 1, -3f, new Item.Properties().group(ItemGroup.TOOLS).isImmuneToFire()) {
		}.setRegistryName("adrenium_axe"));
	}
}
