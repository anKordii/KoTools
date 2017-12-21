package net.kordii.code.listeners;

import net.kordii.code.Main;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;


public class onDeath implements Listener {

    @EventHandler
    public void onDeath(PlayerDeathEvent e){
        if(Main.getInst().getConfig().getBoolean("enableLightning"))
        e.getEntity().getPlayer().getWorld().strikeLightning(e.getEntity().getPlayer().getLocation());
    }
}
