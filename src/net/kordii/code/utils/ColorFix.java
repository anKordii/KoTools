package net.kordii.code.utils;

import org.bukkit.ChatColor;

public class ColorFix {

    public static String fixColor(String s){
        return ChatColor.translateAlternateColorCodes('&', s);
    }
}
