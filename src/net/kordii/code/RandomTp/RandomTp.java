package net.kordii.code.RandomTp;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Server;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.inventory.CraftItemEvent;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.event.inventory.InventoryType.SlotType;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.CraftingInventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class RandomTp
  extends JavaPlugin
  implements Listener
{
  public void onEnable()
  {
    getServer().getPluginManager().registerEvents(this, this);
    saveDefaultConfig();
  }
  
  public void onDisable() {}
  
  public List<Player> getPlayersInRadius(Location location, int size)
  {
    List<Player> players = new ArrayList();
    for (Player p : location.getWorld().getPlayers()) {
      if (location.distance(p.getLocation()) <= size) {
        players.add(p);
      }
    }
    return players;
  }
  
  @EventHandler
  public void onCraft(CraftItemEvent e)
  {
    if ((e.getInventory().getType().equals(InventoryType.WORKBENCH)) && (e.getSlotType().toString().equalsIgnoreCase("RESULT")) && 
      (e.getCurrentItem().getType().name().equalsIgnoreCase("JUKEBOX"))) {
      e.setCancelled(true);
    }
  }
  
  @EventHandler
  public void onCraft1(CraftItemEvent e)
  {
    if ((e.getInventory().getType().equals(InventoryType.WORKBENCH)) && (e.getSlotType().toString().equalsIgnoreCase("RESULT")) && 
      (e.getCurrentItem().getType().name().equalsIgnoreCase("BEACON"))) {
      e.setCancelled(true);
    }
  }
  
  @EventHandler
  public void onInteract(PlayerInteractEvent e)
  {
    if ((e.getAction() == Action.RIGHT_CLICK_BLOCK) && (e.getClickedBlock().getType() == Material.STONE_BUTTON))
    {
      Location block = e.getClickedBlock().getLocation().add(1.0D, 0.0D, 0.0D);
      Location block1 = e.getClickedBlock().getLocation().add(-1.0D, 0.0D, 0.0D);
      Location block2 = e.getClickedBlock().getLocation().add(0.0D, 0.0D, 1.0D);
      Location block3 = e.getClickedBlock().getLocation().add(0.0D, 0.0D, -1.0D);
      if ((block.getBlock().getType() == Material.JUKEBOX) || (block1.getBlock().getType() == Material.JUKEBOX) || (block2.getBlock().getType() == Material.JUKEBOX) || (block3.getBlock().getType() == Material.JUKEBOX))
      {
        Random rand = new Random();
        double x = rand.nextDouble() * 2000.0D - 1000.0D;
        double z = rand.nextDouble() * 2000.0D - 1000.0D;
        for (Player players : getPlayersInRadius(e.getClickedBlock().getLocation(), 5))
        {
          Location loc = new Location(e.getPlayer().getWorld(), x, e.getPlayer().getWorld().getHighestBlockYAt((int)x, (int)z), z);
          e.getPlayer().teleport(loc);
          Location ploc = new Location(e.getPlayer().getWorld(), e.getPlayer().getLocation().getX(), e.getPlayer().getLocation().getY(), e.getPlayer().getLocation().getZ());
          ploc.setY(e.getPlayer().getLocation().getY() + 5.0D);
          e.getPlayer().teleport(ploc);
          players.teleport(e.getPlayer().getLocation());
          players.sendMessage("§8§o» §6Zostales przeteleportowany w losowe miejsce na mapie!");
        }
      }
      if ((block.getBlock().getType() == Material.ENDER_STONE) || (block1.getBlock().getType() == Material.ENDER_STONE) || (block2.getBlock().getType() == Material.ENDER_STONE) || (block3.getBlock().getType() == Material.ENDER_STONE))
      {
        Random rand = new Random();
        double x = rand.nextDouble() * 2000.0D - 1000.0D;
        double z = rand.nextDouble() * 2000.0D - 1000.0D;
        Location loc = new Location(e.getPlayer().getWorld(), x, e.getPlayer().getWorld().getHighestBlockYAt((int)x, (int)z), z);
        e.getPlayer().teleport(loc);
        Location ploc = new Location(e.getPlayer().getWorld(), e.getPlayer().getLocation().getX(), e.getPlayer().getLocation().getY(), e.getPlayer().getLocation().getZ());
        ploc.setY(e.getPlayer().getLocation().getY() + 5.0D);
        e.getPlayer().teleport(ploc);
        e.getPlayer().sendMessage("§8§o» §6Zostales przeteleportowany w losowe miejsce na mapie!");
      }
    }
  }
  
  @EventHandler
  public void onJoin(PlayerJoinEvent e)
  {
    if ((getConfig().getBoolean("config.randomowe_miejsce_po_wejsciu")) && (!e.getPlayer().hasPlayedBefore()))
    {
      Random rand = new Random();
      double x = rand.nextDouble() * 2000.0D - 1000.0D;
      double z = rand.nextDouble() * 2000.0D - 1000.0D;
      Location loc = new Location(e.getPlayer().getWorld(), x, e.getPlayer().getWorld().getHighestBlockYAt((int)x, (int)z), z);
      e.getPlayer().teleport(loc);
      Location ploc = new Location(e.getPlayer().getWorld(), e.getPlayer().getLocation().getX(), e.getPlayer().getLocation().getY(), e.getPlayer().getLocation().getZ());
      ploc.setY(e.getPlayer().getLocation().getY() + 5.0D);
      e.getPlayer().teleport(ploc);
      e.getPlayer().sendMessage("§8§o» §6Zostales przeteleportowany w losowe miejsce na mapie!");
      e.getPlayer().sendMessage("§8§o» §6Nowa edycja wystartowala do gry!");
      ItemStack stonepickaxe = new ItemStack(Material.STONE_PICKAXE);
      ItemStack cookedbeef = new ItemStack(Material.COOKED_BEEF, 128);
      ItemStack enderchest = new ItemStack(Material.ENDER_CHEST);
      e.getPlayer().getInventory().addItem(new ItemStack[] { stonepickaxe });
      e.getPlayer().getInventory().addItem(new ItemStack[] { cookedbeef });
      e.getPlayer().getInventory().addItem(new ItemStack[] { enderchest });
    }
  }
}
