package net.kordii.code.listeners;

import net.kordii.code.Main;
import net.kordii.code.utils.ColorFix;
import net.kordii.code.utils.messagesUtil;
import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

public class onQuit implements Listener {

    @EventHandler
    public void onQuit(PlayerQuitEvent e){
        e.setQuitMessage("");
    }
}
