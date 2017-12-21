package net.kordii.code.Chat;

import java.util.ArrayList;
import net.kordii.code.Main;
import net.kordii.code.Chat.Chat;
import org.bukkit.ChatColor;
import org.bukkit.Server;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.plugin.PluginManager;
import org.bukkit.scheduler.BukkitScheduler;

public class Slow
  implements Listener
{
  Main plugin;
  private ArrayList<String> MUTED;
  
  public Slow(Main plugin)
  {
    this.MUTED = new ArrayList();
    this.plugin = plugin;
    plugin.getServer().getPluginManager().registerEvents(this, plugin);
  }
  
  @EventHandler
  public void Slow(final AsyncPlayerChatEvent e)
  {
    Player p = e.getPlayer();
    if ((!p.hasPermission("KoTools.Cooldown")) && (!Chat.muteall)) {
      if (this.MUTED.contains(p.getName()))
      {
        e.setCancelled(true);
        String msg = ChatColor.RED + "§8» §cKolejna wiadomosc mozesz napisac dopiero za " + ChatColor.GOLD + "§720 sekund" + ChatColor.RED + "§c!";
        p.sendMessage(msg);
      }
      else
      {
        this.MUTED.add(p.getName());
        this.plugin.getServer().getScheduler().runTaskLater(this.plugin, new Runnable()
        {
          public void run()
          {
            Slow.this.MUTED.remove(e.getPlayer().getName());
          }
        }, 400L);
      }
    }
  }
}

