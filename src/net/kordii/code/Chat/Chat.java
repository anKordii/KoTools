package net.kordii.code.Chat;

import java.util.HashMap;
import net.kordii.code.Main;
import org.bukkit.Bukkit;
import org.bukkit.Server;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.PluginCommand;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.plugin.PluginManager;

public class Chat
  implements CommandExecutor, Listener
{
  Main plugin;
  final HashMap<Player, Boolean> muted;
  public static boolean muteall = false;
  
  public Chat(Main plugin)
  {
    this.muted = new HashMap();
    this.plugin = plugin;
    this.plugin.getCommand("chat").setExecutor(this);
    this.plugin.getServer().getPluginManager().registerEvents(this, plugin);
  }
  
  public void muteall()
  {
    muteall = false;
    Bukkit.broadcastMessage("§8------------- §fKontrola Chatu §8-------------");
    Bukkit.broadcastMessage("§8» §6Aktualnie chat jest wylaczony");
    Bukkit.broadcastMessage("§8----------------------------------------------");
  }
  
  @EventHandler
  public void onPlayerChatEvent(AsyncPlayerChatEvent event)
  {
    Player chatter = event.getPlayer();
    if (!this.muted.containsKey(chatter)) {
      this.muted.put(chatter, Boolean.valueOf(false));
    }
    if ((!chatter.hasPermission("KoTools.chat")) && ((muteall) || (((Boolean)this.muted.get(chatter)).booleanValue())))
    {
      event.setCancelled(true);
      chatter.sendMessage("§8------------- §fKontrola Chatu §8-------------");
      chatter.sendMessage("§8» §6Aktualnie chat jest wylaczony");
      chatter.sendMessage("§8----------------------------------------------");
    }
  }
  
  public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
  {
    Player p = (Player)sender;
    if (!p.hasPermission("chat.cmd"))
    {
      p.sendMessage("§8» §cBrak dostepu do tej komendy §7(chat.cmd).");
      return true;
    }
    if (args.length == 0)
    {
      p.sendMessage("§8------------- §fKontrola Chatu §8-------------");
      p.sendMessage("§8» §fWzor komendy: §6§o/chat <cc|on|off>");
      p.sendMessage("§8----------------------------------------------");
      return true;
    }
    if ((args.length == 1) && (args[0].equalsIgnoreCase("on")))
    {
      if (!muteall)
      {
        p.sendMessage("§8------------- §fKontrola Chatu §8-------------");
        p.sendMessage("§8» §fMusisz najpierw §6wylaczyc chat!");
        p.sendMessage("§8----------------------------------------------");
        return true;
      }
      muteall = false;
      Bukkit.broadcastMessage("§8------------- §fKontrola Chatu §8-------------");
      Bukkit.broadcastMessage("§8» §fChat zostal wlaczony przez §6Administracje.");
      Bukkit.broadcastMessage("§8----------------------------------------------");
    }
    if ((args.length == 1) && (args[0].equalsIgnoreCase("off")))
    {
      if (muteall)
      {
          p.sendMessage("§8------------- §3Kontrola Chatu §8-------------");
          p.sendMessage("§8» §fMusisz najpierw §6wlaczyc chat!");
          p.sendMessage("§8----------------------------------------------");
        return true;
      }
      muteall = true;
      Bukkit.broadcastMessage("§8------------- §3Kontrola Chatu §8-------------");
      Bukkit.broadcastMessage("§8» §fChat zostal wylaczony przez §6Administracje.");
      Bukkit.broadcastMessage("§8----------------------------------------------");
    }
    if ((args.length == 1) && (args[0].equalsIgnoreCase("cc"))) {
      for (int i = 0; i < 100; i++) {
        if (i == 95) {
            Bukkit.broadcastMessage("               §8» §fChat zostal wyczyszczony!");
          } else if (i == 94) {
            Bukkit.broadcastMessage("                           §6Kontrola Chatu");
          } else {
            Bukkit.broadcastMessage(" ");
        }
      }
    }
    return false;
  }
}

