
package net.mcreator.thegoatedmod.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.item.UseAction;
import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.Food;
import net.minecraft.entity.LivingEntity;

import net.mcreator.thegoatedmod.procedures.SquidioFoodEatenProcedure;
import net.mcreator.thegoatedmod.TheGoatedModModElements;

import java.util.Map;
import java.util.HashMap;

@TheGoatedModModElements.ModElement.Tag
public class SquidioItem extends TheGoatedModModElements.ModElement {
	@ObjectHolder("the_goated_mod:squidio")
	public static final Item block = null;
	public SquidioItem(TheGoatedModModElements instance) {
		super(instance, 33);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new FoodItemCustom());
	}
	public static class FoodItemCustom extends Item {
		public FoodItemCustom() {
			super(new Item.Properties().group(ItemGroup.FOOD).maxStackSize(64).rarity(Rarity.COMMON)
					.food((new Food.Builder()).hunger(40).saturation(100f).setAlwaysEdible().build()));
			setRegistryName("squidio");
		}

		@Override
		public int getUseDuration(ItemStack stack) {
			return 4;
		}

		@Override
		public UseAction getUseAction(ItemStack itemstack) {
			return UseAction.EAT;
		}

		@Override
		public ItemStack onItemUseFinish(ItemStack itemstack, World world, LivingEntity entity) {
			ItemStack retval = super.onItemUseFinish(itemstack, world, entity);
			double x = entity.getPosX();
			double y = entity.getPosY();
			double z = entity.getPosZ();
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				SquidioFoodEatenProcedure.executeProcedure($_dependencies);
			}
			return retval;
		}
	}
}
