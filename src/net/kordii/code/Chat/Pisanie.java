package net.kordii.code.Chat;

import net.kordii.code.Main;
import org.bukkit.Server;
import org.bukkit.event.Listener;
import org.bukkit.plugin.PluginManager;

public class Pisanie
  implements Listener
{
  Main plugin;
  
  public Pisanie(Main plugin)
  {
    this.plugin = plugin;
    plugin.getServer().getPluginManager().registerEvents(this, plugin);
  }
}
