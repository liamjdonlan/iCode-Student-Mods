
package net.mcreator.thegoatedmod.item;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.AxeItem;

import net.mcreator.thegoatedmod.TheGoatedModModElements;

@TheGoatedModModElements.ModElement.Tag
public class MroverpoweredItem extends TheGoatedModModElements.ModElement {
	@ObjectHolder("the_goated_mod:mroverpowered")
	public static final Item block = null;
	public MroverpoweredItem(TheGoatedModModElements instance) {
		super(instance, 11);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new AxeItem(new IItemTier() {
			public int getMaxUses() {
				return 392;
			}

			public float getEfficiency() {
				return 10f;
			}

			public float getAttackDamage() {
				return 127998f;
			}

			public int getHarvestLevel() {
				return 1;
			}

			public int getEnchantability() {
				return 24;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}
		}, 1, -4f, new Item.Properties().group(ItemGroup.TOOLS)) {
			@Override
			@OnlyIn(Dist.CLIENT)
			public boolean hasEffect(ItemStack itemstack) {
				return true;
			}
		}.setRegistryName("mroverpowered"));
	}
}
