package net.mcreator.luckyblock.procedures;

import net.minecraftforge.fml.server.ServerLifecycleHooks;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ChatType;
import net.minecraft.util.Util;
import net.minecraft.server.MinecraftServer;
import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.item.ItemEntity;

import net.mcreator.luckyblock.item.PepperItem;
import net.mcreator.luckyblock.item.ObsidianIarmorItem;
import net.mcreator.luckyblock.item.GhastshovelItem;
import net.mcreator.luckyblock.item.GhastpickaxeItem;
import net.mcreator.luckyblock.item.GhastSwordItem;
import net.mcreator.luckyblock.LuckyBlockModElements;
import net.mcreator.luckyblock.LuckyBlockMod;

import java.util.Map;

@LuckyBlockModElements.ModElement.Tag
public class LuckyblockBlockDestroyedByPlayerProcedure extends LuckyBlockModElements.ModElement {
	public LuckyblockBlockDestroyedByPlayerProcedure(LuckyBlockModElements instance) {
		super(instance, 37);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				LuckyBlockMod.LOGGER.warn("Failed to load dependency x for procedure LuckyblockBlockDestroyedByPlayer!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				LuckyBlockMod.LOGGER.warn("Failed to load dependency y for procedure LuckyblockBlockDestroyedByPlayer!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				LuckyBlockMod.LOGGER.warn("Failed to load dependency z for procedure LuckyblockBlockDestroyedByPlayer!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				LuckyBlockMod.LOGGER.warn("Failed to load dependency world for procedure LuckyblockBlockDestroyedByPlayer!");
			return;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		double lucky_bluck = 0;
		System.out.println(Math.random());
		if (!world.isRemote()) {
			MinecraftServer mcserv = ServerLifecycleHooks.getCurrentServer();
			if (mcserv != null)
				mcserv.getPlayerList().func_232641_a_(new StringTextComponent(""), ChatType.SYSTEM, Util.DUMMY_UUID);
		}
		lucky_bluck = (double) Math.random();
		if ((((lucky_bluck) > 0) && ((lucky_bluck) < 0.1))) {
			if (!world.isRemote()) {
				MinecraftServer mcserv = ServerLifecycleHooks.getCurrentServer();
				if (mcserv != null)
					mcserv.getPlayerList().func_232641_a_(new StringTextComponent("they opend a lucky block"), ChatType.SYSTEM, Util.DUMMY_UUID);
			}
			if (world instanceof World && !world.isRemote()) {
				ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(GhastSwordItem.block, (int) (1)));
				entityToSpawn.setPickupDelay((int) 10);
				entityToSpawn.setNoDespawn();
				world.addEntity(entityToSpawn);
			}
		} else if ((((lucky_bluck) > 0.1) && ((lucky_bluck) < 0.2))) {
			if (!world.isRemote()) {
				MinecraftServer mcserv = ServerLifecycleHooks.getCurrentServer();
				if (mcserv != null)
					mcserv.getPlayerList().func_232641_a_(new StringTextComponent("they opend a lucky block"), ChatType.SYSTEM, Util.DUMMY_UUID);
			}
			if (world instanceof World && !world.isRemote()) {
				ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(GhastpickaxeItem.block, (int) (1)));
				entityToSpawn.setPickupDelay((int) 10);
				entityToSpawn.setNoDespawn();
				world.addEntity(entityToSpawn);
			}
		} else if ((((lucky_bluck) > 0.2) && ((lucky_bluck) < 0.3))) {
			if (!world.isRemote()) {
				MinecraftServer mcserv = ServerLifecycleHooks.getCurrentServer();
				if (mcserv != null)
					mcserv.getPlayerList().func_232641_a_(new StringTextComponent("they opend a lucky block"), ChatType.SYSTEM, Util.DUMMY_UUID);
			}
			if (world instanceof World && !world.isRemote()) {
				ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(GhastshovelItem.block, (int) (1)));
				entityToSpawn.setPickupDelay((int) 10);
				entityToSpawn.setNoDespawn();
				world.addEntity(entityToSpawn);
			}
		} else if ((((lucky_bluck) > 0.3) && ((lucky_bluck) < 0.4))) {
			if (!world.isRemote()) {
				MinecraftServer mcserv = ServerLifecycleHooks.getCurrentServer();
				if (mcserv != null)
					mcserv.getPlayerList().func_232641_a_(new StringTextComponent("they opend a lucky block"), ChatType.SYSTEM, Util.DUMMY_UUID);
			}
			if (world instanceof World && !world.isRemote()) {
				ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(ObsidianIarmorItem.boots, (int) (1)));
				entityToSpawn.setPickupDelay((int) 10);
				entityToSpawn.setNoDespawn();
				world.addEntity(entityToSpawn);
			}
		} else if ((((lucky_bluck) > 0.4) && ((lucky_bluck) < 0.5))) {
			if (!world.isRemote()) {
				MinecraftServer mcserv = ServerLifecycleHooks.getCurrentServer();
				if (mcserv != null)
					mcserv.getPlayerList().func_232641_a_(new StringTextComponent("they opend a lucky block"), ChatType.SYSTEM, Util.DUMMY_UUID);
			}
			if (world instanceof World && !world.isRemote()) {
				ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(ObsidianIarmorItem.legs, (int) (1)));
				entityToSpawn.setPickupDelay((int) 10);
				entityToSpawn.setNoDespawn();
				world.addEntity(entityToSpawn);
			}
		} else if ((((lucky_bluck) > 0.5) && ((lucky_bluck) < 0.6))) {
			if (!world.isRemote()) {
				MinecraftServer mcserv = ServerLifecycleHooks.getCurrentServer();
				if (mcserv != null)
					mcserv.getPlayerList().func_232641_a_(new StringTextComponent("they opend a lucky block"), ChatType.SYSTEM, Util.DUMMY_UUID);
			}
			if (world instanceof World && !world.isRemote()) {
				ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(ObsidianIarmorItem.body, (int) (1)));
				entityToSpawn.setPickupDelay((int) 10);
				entityToSpawn.setNoDespawn();
				world.addEntity(entityToSpawn);
			}
		} else if ((((lucky_bluck) > 0.6) && ((lucky_bluck) < 0.7))) {
			if (!world.isRemote()) {
				MinecraftServer mcserv = ServerLifecycleHooks.getCurrentServer();
				if (mcserv != null)
					mcserv.getPlayerList().func_232641_a_(new StringTextComponent("they opend a lucky block"), ChatType.SYSTEM, Util.DUMMY_UUID);
			}
			if (world instanceof World && !world.isRemote()) {
				ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(ObsidianIarmorItem.helmet, (int) (1)));
				entityToSpawn.setPickupDelay((int) 10);
				entityToSpawn.setNoDespawn();
				world.addEntity(entityToSpawn);
			}
		} else if ((((lucky_bluck) > 0.7) && ((lucky_bluck) < 0.8))) {
			if (!world.isRemote()) {
				MinecraftServer mcserv = ServerLifecycleHooks.getCurrentServer();
				if (mcserv != null)
					mcserv.getPlayerList().func_232641_a_(new StringTextComponent("they opend a lucky block"), ChatType.SYSTEM, Util.DUMMY_UUID);
			}
			if (world instanceof World && !world.isRemote()) {
				ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(Items.ENDER_EYE, (int) (1)));
				entityToSpawn.setPickupDelay((int) 10);
				entityToSpawn.setNoDespawn();
				world.addEntity(entityToSpawn);
			}
		} else if ((((lucky_bluck) > 0.8) && ((lucky_bluck) < 0.9))) {
			if (!world.isRemote()) {
				MinecraftServer mcserv = ServerLifecycleHooks.getCurrentServer();
				if (mcserv != null)
					mcserv.getPlayerList().func_232641_a_(new StringTextComponent("they opend a lucky block"), ChatType.SYSTEM, Util.DUMMY_UUID);
			}
			if (world instanceof World && !world.isRemote()) {
				ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(PepperItem.block, (int) (1)));
				entityToSpawn.setPickupDelay((int) 10);
				entityToSpawn.setNoDespawn();
				world.addEntity(entityToSpawn);
			}
		} else if ((((lucky_bluck) > 0.9) && ((lucky_bluck) < 1))) {
			if (!world.isRemote()) {
				MinecraftServer mcserv = ServerLifecycleHooks.getCurrentServer();
				if (mcserv != null)
					mcserv.getPlayerList().func_232641_a_(new StringTextComponent("they opend a lucky block"), ChatType.SYSTEM, Util.DUMMY_UUID);
			}
			if (world instanceof World && !world.isRemote()) {
				ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(Items.COOKED_MUTTON, (int) (1)));
				entityToSpawn.setPickupDelay((int) 10);
				entityToSpawn.setNoDespawn();
				world.addEntity(entityToSpawn);
			}
		}
	}
}
