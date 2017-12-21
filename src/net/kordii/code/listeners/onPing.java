package net.kordii.code.listeners;

import net.kordii.code.Main;
import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.server.ServerListPingEvent;

public class onPing implements Listener {

    @EventHandler
    public void onPing(ServerListPingEvent e){
        if(Main.getInst().getConfig().getBoolean("useMotd")) {
            e.setMotd(ChatColor.translateAlternateColorCodes('&', Main.getInst().getConfig().getString("msgMotd")));
        }
        if(Main.getInst().getConfig().getBoolean("useFakePlayers")){
            e.setMaxPlayers(Main.getInst().getConfig().getInt("fakePlayers"));
        }
        if(Main.getInst().getConfig().getBoolean("useServerIcon")){
        }
    }
}
