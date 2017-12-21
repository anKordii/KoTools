package net.kordii.code.listeners;

import com.sk89q.worldguard.bukkit.WorldGuardPlugin;
import java.util.ArrayList;
import java.util.List;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.scheduler.BukkitScheduler;
import net.kordii.code.Main;

public class Break
  implements Listener
{
  @EventHandler
  public void BreakStone(final BlockBreakEvent e)
  {
    if (e.getBlock().getType() == Material.STONE)
    {
      final Location loc1 = new Location(e.getBlock().getLocation().getWorld(), 
        e.getBlock().getLocation().getX(), 
        e.getBlock().getLocation().getY() - 1.0D, 
        e.getBlock().getLocation().getZ());
      if (loc1.getBlock().getType() == Material.ENDER_STONE) {
        Bukkit.getScheduler().runTaskLater(Main.getInstance, new Runnable()
        {
          public void run()
          {
            if (loc1.getBlock().getType() == Material.ENDER_STONE) {
              e.getBlock().setType(Material.STONE);
            }
          }
        }, 25L);
      }
    }
  }
  
  @EventHandler
  public void BreakStoneGenerator(BlockBreakEvent e)
  {
    if (e.getPlayer().getGameMode() == GameMode.SURVIVAL)
    {
      List<String> drop_lore = new ArrayList();
      drop_lore.add("§2Aby go calkowicie zniszczyc musisz zniszczyc endstone");
      ItemStack drop = new ItemStack(Material.ENDER_STONE, 1);
      ItemMeta meta = drop.getItemMeta();
      meta.setDisplayName("§fSTONIARKA §7- §6Automatyczny generator kamienia");
      meta.setLore(drop_lore);
      drop.setItemMeta(meta);
      if (e.getBlock().getType() == Material.ENDER_STONE)
      {
        WorldGuardPlugin wg = Main.getWorldGuard();
        wg.getRegionManager((World)Bukkit.getWorlds().get(0));
        if (wg.canBuild(e.getPlayer(), e.getBlock()))
        {
          e.getBlock().setType(Material.AIR);
          e.getBlock().getWorld().dropItemNaturally(e.getBlock().getLocation(), drop);
          e.setCancelled(true);
        }
        else
        {
          e.setCancelled(true);
        }
      }
    }
  }  @EventHandler
  public void BreakEnderChest(BlockBreakEvent e)
  {
    if (e.getPlayer().getGameMode() == GameMode.SURVIVAL)
    {
      List<String> drop_lore = new ArrayList();
      drop_lore.add("§fEnder-Chest");
      ItemStack drop = new ItemStack(Material.ENDER_CHEST, 1);
      ItemMeta meta = drop.getItemMeta();
      meta.setDisplayName("§fEnderChest");
      meta.setLore(drop_lore);
      drop.setItemMeta(meta);
      if (e.getBlock().getType() == Material.ENDER_CHEST)
      {
        WorldGuardPlugin wg = Main.getWorldGuard();
        wg.getRegionManager((World)Bukkit.getWorlds().get(0));
        if (wg.canBuild(e.getPlayer(), e.getBlock()))
        {
          e.getBlock().setType(Material.AIR);
          e.getBlock().getWorld().dropItemNaturally(e.getBlock().getLocation(), drop);
          e.setCancelled(true);
        }
        else
        {
          e.setCancelled(true);
        }
      }
    }
  }
}

