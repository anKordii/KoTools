package net.kordii.code.events;


import net.kordii.code.Main;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;

import java.util.ArrayList;
import java.util.List;

public class autoMsg {

    private static int i;

    public static void startMsg(final List<String> msg){
        i = 0;
        if(Main.getInst().getConfig().getBoolean("enableAutoMsg")) {
            Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getInst(), new Runnable() {
                @Override
                public void run() {
                    Bukkit.broadcastMessage(ChatColor.translateAlternateColorCodes('&', msg.get(i)));
                    i++;
                    if (i == msg.size()) {
                        i = 0;
                    }
                }
            }, 40, Main.getInst().getConfig().getInt("autoMsgTime") * 20);
        }
    }
}
