package net.kordii.code.utils;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class ChatUtil {
	public static String Color(String m){
		if(m == null){
			return "";
		}
		return ChatColor.translateAlternateColorCodes('&',m);
	}
	
	public static String[] Color(String[] m){
		String[] s = m;
		for(int i = 0 ; i <s.length ; i++){
			s[i] = Color(s[1]);
			
			
		}
		return s;
	}
	
	public static void sendb(String m){
		Bukkit.getServer().broadcastMessage(Color(m));
	}
	
	public static void sendM(Player p, String m){
		p.sendMessage(Color(m));
	}
	
	public static void sendM(CommandSender p, String m){
		p.sendMessage(Color(m));
	}

	public static void sendm(String string) {
		// TODO Auto-generated method stub
		
	}
}

