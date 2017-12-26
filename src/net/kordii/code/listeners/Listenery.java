package net.kordii.code.listeners;

import org.bukkit.Color;
import org.bukkit.FireworkEffect;
import org.bukkit.FireworkEffect.Type;
import org.bukkit.Material;
import org.bukkit.entity.Cow;
import org.bukkit.entity.Firework;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.inventory.PrepareItemCraftEvent;
import org.bukkit.event.player.PlayerInteractEntityEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;

public class Listenery implements Listener{
	
	ItemStack db = new ItemStack(Material.DIAMOND_SWORD, 1);
	ItemStack db1 = new ItemStack(Material.DIAMOND_HELMET, 1);
	ItemStack db2 = new ItemStack(Material.DIAMOND_CHESTPLATE, 1);
	ItemStack db3 = new ItemStack(Material.DIAMOND_LEGGINGS, 1);
	ItemStack db4 = new ItemStack(Material.DIAMOND_LEGGINGS, 1);
	ItemStack db5 = new ItemStack(Material.GOLDEN_APPLE, 1);
	ItemStack db6 = new ItemStack(Material.ENDER_CHEST, 1);
	
	@EventHandler
	public void onPrepare(PrepareItemCraftEvent e){
		if(e.getInventory().getResult().equals(db)){
			e.getInventory().setResult(new ItemStack(Material.AIR, 1));
		}
		if(e.getInventory().getResult().equals(db1)){
			e.getInventory().setResult(new ItemStack(Material.AIR, 1));
		}
		if(e.getInventory().getResult().equals(db2)){
			e.getInventory().setResult(new ItemStack(Material.AIR, 1));
		}
		if(e.getInventory().getResult().equals(db3)){
			e.getInventory().setResult(new ItemStack(Material.AIR, 1));
		}
		if(e.getInventory().getResult().equals(db4)){
			e.getInventory().setResult(new ItemStack(Material.AIR, 1));
		}
		if(e.getInventory().getResult().equals(db5)){
			e.getInventory().setResult(new ItemStack(Material.AIR, 1));
		}
		if(e.getInventory().getResult().equals(db6)){
			e.getInventory().setResult(new ItemStack(Material.AIR, 1));
		}
	}
}
