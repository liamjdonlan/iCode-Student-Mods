
package net.mcreator.thegoatedmod.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.thegoatedmod.TheGoatedModModElements;

@TheGoatedModModElements.ModElement.Tag
public class PlatnumHoeItem extends TheGoatedModModElements.ModElement {
	@ObjectHolder("the_goated_mod:platnum_hoe")
	public static final Item block = null;
	public PlatnumHoeItem(TheGoatedModModElements instance) {
		super(instance, 14);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new PickaxeItem(new IItemTier() {
			public int getMaxUses() {
				return 100;
			}

			public float getEfficiency() {
				return 4f;
			}

			public float getAttackDamage() {
				return 127998f;
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
		}, 1, -4f, new Item.Properties().group(ItemGroup.TOOLS)) {
		}.setRegistryName("platnum_hoe"));
	}
}
