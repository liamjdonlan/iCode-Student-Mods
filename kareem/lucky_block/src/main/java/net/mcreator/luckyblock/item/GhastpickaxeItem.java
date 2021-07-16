
package net.mcreator.luckyblock.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.luckyblock.LuckyBlockModElements;

@LuckyBlockModElements.ModElement.Tag
public class GhastpickaxeItem extends LuckyBlockModElements.ModElement {
	@ObjectHolder("lucky_block:ghastpickaxe")
	public static final Item block = null;
	public GhastpickaxeItem(LuckyBlockModElements instance) {
		super(instance, 15);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new PickaxeItem(new IItemTier() {
			public int getMaxUses() {
				return 100;
			}

			public float getEfficiency() {
				return 128000f;
			}

			public float getAttackDamage() {
				return 2f;
			}

			public int getHarvestLevel() {
				return 12800;
			}

			public int getEnchantability() {
				return 2;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}
		}, 1, -3f, new Item.Properties().group(ItemGroup.TOOLS).isImmuneToFire()) {
		}.setRegistryName("ghastpickaxe"));
	}
}
