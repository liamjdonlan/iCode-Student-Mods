
package net.mcreator.luckyblock.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.AxeItem;
import net.minecraft.entity.LivingEntity;

import net.mcreator.luckyblock.procedures.GhastSwordLivingEntityIsHitWithToolProcedure;
import net.mcreator.luckyblock.LuckyBlockModElements;

import java.util.Map;
import java.util.HashMap;

@LuckyBlockModElements.ModElement.Tag
public class GhastSwordItem extends LuckyBlockModElements.ModElement {
	@ObjectHolder("lucky_block:ghast_sword")
	public static final Item block = null;
	public GhastSwordItem(LuckyBlockModElements instance) {
		super(instance, 13);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new AxeItem(new IItemTier() {
			public int getMaxUses() {
				return 128000;
			}

			public float getEfficiency() {
				return 13f;
			}

			public float getAttackDamage() {
				return 127998f;
			}

			public int getHarvestLevel() {
				return 13;
			}

			public int getEnchantability() {
				return 119;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}
		}, 1, -4f, new Item.Properties().group(ItemGroup.COMBAT).isImmuneToFire()) {
			@Override
			public boolean hitEntity(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
				boolean retval = super.hitEntity(itemstack, entity, sourceentity);
				double x = entity.getPosX();
				double y = entity.getPosY();
				double z = entity.getPosZ();
				World world = entity.world;
				{
					Map<String, Object> $_dependencies = new HashMap<>();
					$_dependencies.put("entity", entity);
					GhastSwordLivingEntityIsHitWithToolProcedure.executeProcedure($_dependencies);
				}
				return retval;
			}
		}.setRegistryName("ghast_sword"));
	}
}
