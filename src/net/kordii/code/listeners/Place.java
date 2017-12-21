package net.kordii.code.listeners;

import com.sk89q.worldguard.bukkit.WorldGuardPlugin;
import java.util.List;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.scheduler.BukkitScheduler;
import net.kordii.code.Main;
import net.minecraft.server.v1_8_R3.EnumParticle;
import net.minecraft.server.v1_8_R3.PacketPlayOutWorldParticles;
import net.minecraft.server.v1_8_R3.PacketPlayOutWorldParticles;

public class Place
  implements Listener
{
  @EventHandler
  public void PlaceStoneGenerator(BlockPlaceEvent e)
  {
    if (e.getBlock().getType() == Material.ENDER_STONE)
    {
      final Location loc1 = new Location(e.getBlock().getLocation().getWorld(), 
        e.getBlock().getLocation().getX(), 
        e.getBlock().getLocation().getY() + 1.0D, 
        e.getBlock().getLocation().getZ());
      if (loc1.getBlock().getType() == Material.AIR)
      {
        e.getBlock().getLocation();
        e.getBlock().getWorld();
        WorldGuardPlugin wg = Main.getWorldGuard();
        wg.getRegionManager((World)Bukkit.getWorlds().get(0));
        if (wg.canBuild(e.getPlayer(), e.getBlock()))
        {
          Bukkit.getScheduler().runTaskLater(Main.getInstance, new Runnable()
          {
            public void run()
            {
              loc1.getBlock().setType(Material.STONE);
            }
          }, 60L);
        }
        else
        {
          e.setCancelled(true);
          e.getPlayer().sendMessage(ChatColor.RED + "Nie mozesz tu stawiac stoniarek!");
        }
      }
      else
      {
        e.getPlayer().sendMessage(ChatColor.RED + "Nad stoniarka jest juz jakis blok!");
      }
    }
  }
}

