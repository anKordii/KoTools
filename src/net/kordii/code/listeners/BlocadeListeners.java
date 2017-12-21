package net.kordii.code.listeners;


import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockFromToEvent;

public class BlocadeListeners implements Listener {

    @EventHandler
    public void onBlockade(final BlockFromToEvent e) {
        final Material m = e.getBlock().getType();
        if (m == Material.WATER || m == Material.STATIONARY_WATER || m == Material.LAVA || m == Material.STATIONARY_LAVA) {
            e.setCancelled(true);
        }
    }
}
