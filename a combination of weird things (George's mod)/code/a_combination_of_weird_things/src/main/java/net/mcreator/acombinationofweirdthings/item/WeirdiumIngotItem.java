
package net.mcreator.acombinationofweirdthings.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.mcreator.acombinationofweirdthings.ACombinationOfWeirdThingsModElements;

@ACombinationOfWeirdThingsModElements.ModElement.Tag
public class WeirdiumIngotItem extends ACombinationOfWeirdThingsModElements.ModElement {
	@ObjectHolder("a_combination_of_weird_things:weirdium_ingot")
	public static final Item block = null;
	public WeirdiumIngotItem(ACombinationOfWeirdThingsModElements instance) {
		super(instance, 1);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(ItemGroup.MATERIALS).maxStackSize(64).isImmuneToFire().rarity(Rarity.RARE));
			setRegistryName("weirdium_ingot");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}
