package net.kordii.code.listeners;

import net.kordii.code.Main;
import net.kordii.code.utils.DataUtil;
import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class onType implements Listener {

    @EventHandler
    public void onType(AsyncPlayerChatEvent e){
        if(!(DataUtil.chatStatus)){
            if(!(e.getPlayer().hasPermission("chat.core"))) {
                e.setCancelled(true);
                e.getPlayer().sendMessage(Main.getInst().getConfig().getString(ChatColor.translateAlternateColorCodes('&', Main.getInst().getConfig().getString("chatOff"))));
            }
        }
    }
}
