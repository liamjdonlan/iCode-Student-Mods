
package net.mcreator.mrderpsmod.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.mrderpsmod.MrderpsModModElements;

@MrderpsModModElements.ModElement.Tag
public class AdreniumPickaxeItem extends MrderpsModModElements.ModElement {
	@ObjectHolder("mrderps_mod:adrenium_pickaxe")
	public static final Item block = null;
	public AdreniumPickaxeItem(MrderpsModModElements instance) {
		super(instance, 11);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new PickaxeItem(new IItemTier() {
			public int getMaxUses() {
				return 800;
			}

			public float getEfficiency() {
				return 9f;
			}

			public float getAttackDamage() {
				return 4f;
			}

			public int getHarvestLevel() {
				return 3;
			}

			public int getEnchantability() {
				return 15;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(AdraniumingotItem.block, (int) (1)));
			}
		}, 1, -2.7000000000000002f, new Item.Properties().group(ItemGroup.TOOLS).isImmuneToFire()) {
		}.setRegistryName("adrenium_pickaxe"));
	}
}
