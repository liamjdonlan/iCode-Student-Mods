
package net.mcreator.mrderpsmod.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.mrderpsmod.MrderpsModModElements;

@MrderpsModModElements.ModElement.Tag
public class SlayerItem extends MrderpsModModElements.ModElement {
	@ObjectHolder("mrderps_mod:slayer")
	public static final Item block = null;
	public SlayerItem(MrderpsModModElements instance) {
		super(instance, 22);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 100000;
			}

			public float getEfficiency() {
				return 7f;
			}

			public float getAttackDamage() {
				return 18f;
			}

			public int getHarvestLevel() {
				return 1;
			}

			public int getEnchantability() {
				return 200;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}
		}, 3, 0f, new Item.Properties().group(ItemGroup.COMBAT).isImmuneToFire()) {
		}.setRegistryName("slayer"));
	}
}
