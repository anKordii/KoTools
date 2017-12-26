package net.kordii.code.cmd;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import net.kordii.code.utils.ChatUtil;
import net.kordii.code.utils.ItemBuilder;

public class Ranks implements CommandExecutor{
	
	
		public boolean onCommand(CommandSender sender, Command c, String s, String[] args){
			if(!sender.hasPermission("kotools.vip.cmd")){
				ChatUtil.sendM(sender, "§8» §cBrak dostepu do tej komendy §7(kotools.vip.cmd).");
				return false;
			}
			if(args.length < 2){
				ChatUtil.sendM(sender, "§8» §7§oWzor komendy: §c§o/itemshop §8§o<§c§ovip§8§o|§c§osvip§8§o|§c§oturbodrop§8§o|§c§oturboexp§8§o|§c§odisco§8§o|§c§opandora1§8§o|§c§opandora32§8§o|§c§opandora80§8§o|§c§opandora150§8§o|§c§opandora250§8§o|§c§opandora400§8§o> §8§o<§c§onick§8§o>");				
				return false;
			}
			if(args[0].equalsIgnoreCase("vip"))
			{
				
				Player p = Bukkit.getPlayer(args[1]);
				if(p != null){
					int i = 1;
					if(args.length == 3){
						i = Integer.parseInt(args [2]);
					}
					if(i <= 0){
						ChatUtil.sendM(sender, "§8» §7§oMinimalna liczba Skrzyni §c(1).");	
						return false;
					}
					ChatUtil.sendb("§8§m------------------------------------------");
					ChatUtil.sendb("");					
					ChatUtil.sendb("§8» §7"+p);
					ChatUtil.sendb("§8» §b§oZakupil §6Vip'a §b§ow naszym Itemshopie.");
					ChatUtil.sendb("§8» §b§oTy tez mozesz §7§oDragonHard.eu");
					ChatUtil.sendb("");
					ChatUtil.sendb("§8§m------------------------------------------");
				}
				else
				{
					ChatUtil.sendM(sender, "§8» §7§oPodany gracz jest §c§oOffline");	
					return false;	
				}
			}
			if(args[0].equalsIgnoreCase("svip"))
			{
				
				Player p = Bukkit.getPlayer(args[1]);
				if(p != null){
					int i = 1;
					if(args.length == 3){
						i = Integer.parseInt(args [2]);
					}
					if(i <= 0){
						ChatUtil.sendM(sender, "§8» §7§oMinimalna liczba Skrzyni §c(1).");	
						return false;
					}
					ChatUtil.sendb("§8§m------------------------------------------");
					ChatUtil.sendb("");					
					ChatUtil.sendb("§8» §7"+p);
					ChatUtil.sendb("§8» §b§oZakupil §6SVip'a §b§ow naszym Itemshopie.");
					ChatUtil.sendb("§8» §b§oTy tez mozesz §7§oDragonHard.eu");
					ChatUtil.sendb("");
					ChatUtil.sendb("§8§m------------------------------------------");
				}				
				else
				{
					ChatUtil.sendM(sender, "§8» §7§oPodany gracz jest §c§oOffline");	
					return false;	
				}			
			}
			if(args[0].equalsIgnoreCase("disco"))
			{
				
				Player p = Bukkit.getPlayer(args[1]);
				if(p != null){
					int i = 1;
					if(args.length == 3){
						i = Integer.parseInt(args [2]);
					}
					if(i <= 0){
						ChatUtil.sendM(sender, "§8» §7§oMinimalna liczba Skrzyni §c(1).");	
						return false;
					}
					ChatUtil.sendb("§8§m------------------------------------------");
					ChatUtil.sendb("");					
					ChatUtil.sendb("§8» §7"+p);
					ChatUtil.sendb("§8» §b§oZakupil §6Disco Zbroje §b§ow naszym Itemshopie.");
					ChatUtil.sendb("§8» §b§oTy tez mozesz §7§oDragonHard.eu");
					ChatUtil.sendb("");
					ChatUtil.sendb("§8§m------------------------------------------");
				}				
				else
				{
					ChatUtil.sendM(sender, "§8» §7§oPodany gracz jest §c§oOffline");	
					return false;	
				}
					
			}
			if(args[0].equalsIgnoreCase("pandora1"))
			{
				
				Player p = Bukkit.getPlayer(args[1]);
				if(p != null){
					int i = 1;
					if(args.length == 3){
						i = Integer.parseInt(args [2]);
					}
					if(i <= 0){
						ChatUtil.sendM(sender, "§8» §7§oMinimalna liczba Skrzyni §c(1).");	
						return false;
					}
					ChatUtil.sendb("§8§m------------------------------------------");
					ChatUtil.sendb("");					
					ChatUtil.sendb("§8» §7"+p);
					ChatUtil.sendb("§8» §b§oZakupil §6x1 Pandor §b§ow naszym Itemshopie.");
					ChatUtil.sendb("§8» §b§oTy tez mozesz §7§oDragonHard.eu");
					ChatUtil.sendb("");
					ChatUtil.sendb("§8§m------------------------------------------");
				}				
				else
				{
					ChatUtil.sendM(sender, "§8» §7§oPodany gracz jest §c§oOffline");	
					return false;	
				}
					
			}
			if(args[0].equalsIgnoreCase("pandora32"))
			{
				
				Player p = Bukkit.getPlayer(args[1]);
				if(p != null){
					int i = 1;
					if(args.length == 3){
						i = Integer.parseInt(args [2]);
					}
					if(i <= 0){
						ChatUtil.sendM(sender, "§8» §7§oMinimalna liczba Skrzyni §c(1).");	
						return false;
					}
					ChatUtil.sendb("§8§m------------------------------------------");
					ChatUtil.sendb("");					
					ChatUtil.sendb("§8» §7"+p);
					ChatUtil.sendb("§8» §b§oZakupil §6x32 Pandor §b§ow naszym Itemshopie.");
					ChatUtil.sendb("§8» §b§oTy tez mozesz §7§oDragonHard.eu");
					ChatUtil.sendb("");
					ChatUtil.sendb("§8§m------------------------------------------");
				}				
				else
				{
					ChatUtil.sendM(sender, "§8» §7§oPodany gracz jest §c§oOffline");	
					return false;	
				}
					
			}
			if(args[0].equalsIgnoreCase("pandora80"))
			{
				
				Player p = Bukkit.getPlayer(args[1]);
				if(p != null){
					int i = 1;
					if(args.length == 3){
						i = Integer.parseInt(args [2]);
					}
					if(i <= 0){
						ChatUtil.sendM(sender, "§8» §7§oMinimalna liczba Skrzyni §c(1).");	
						return false;
					}
					ChatUtil.sendb("§8§m------------------------------------------");
					ChatUtil.sendb("");					
					ChatUtil.sendb("§8» §7"+p);
					ChatUtil.sendb("§8» §b§oZakupil §6x80 Pandor §b§ow naszym Itemshopie.");
					ChatUtil.sendb("§8» §b§oTy tez mozesz §7§oDragonHard.eu");
					ChatUtil.sendb("");
					ChatUtil.sendb("§8§m------------------------------------------");
				}				
				else
				{
					ChatUtil.sendM(sender, "§8» §7§oPodany gracz jest §c§oOffline");	
					return false;	
				}
					
			}
			if(args[0].equalsIgnoreCase("pandora150"))
			{
				
				Player p = Bukkit.getPlayer(args[1]);
				if(p != null){
					int i = 1;
					if(args.length == 3){
						i = Integer.parseInt(args [2]);
					}
					if(i <= 0){
						ChatUtil.sendM(sender, "§8» §7§oMinimalna liczba Skrzyni §c(1).");	
						return false;
					}
					ChatUtil.sendb("§8§m------------------------------------------");
					ChatUtil.sendb("");					
					ChatUtil.sendb("§8» §7"+p);
					ChatUtil.sendb("§8» §b§oZakupil §6x150 Pandor §b§ow naszym Itemshopie.");
					ChatUtil.sendb("§8» §b§oTy tez mozesz §7§oDragonHard.eu");
					ChatUtil.sendb("");
					ChatUtil.sendb("§8§m------------------------------------------");
				}				
				else
				{
					ChatUtil.sendM(sender, "§8» §7§oPodany gracz jest §c§oOffline");	
					return false;	
				}
					
			}
			if(args[0].equalsIgnoreCase("pandora250"))
			{
				
				Player p = Bukkit.getPlayer(args[1]);
				if(p != null){
					int i = 1;
					if(args.length == 3){
						i = Integer.parseInt(args [2]);
					}
					if(i <= 0){
						ChatUtil.sendM(sender, "§8» §7§oMinimalna liczba Skrzyni §c(1).");	
						return false;
					}
					ChatUtil.sendb("§8§m------------------------------------------");
					ChatUtil.sendb("");					
					ChatUtil.sendb("§8» §7"+p);
					ChatUtil.sendb("§8» §b§oZakupil §6x250 Pandor §b§ow naszym Itemshopie.");
					ChatUtil.sendb("§8» §b§oTy tez mozesz §7§oDragonHard.eu");
					ChatUtil.sendb("");
					ChatUtil.sendb("§8§m------------------------------------------");
				}				
				else
				{
					ChatUtil.sendM(sender, "§8» §7§oPodany gracz jest §c§oOffline");	
					return false;	
				}
					
			}
			if(args[0].equalsIgnoreCase("pandora400"))
			{
				
				Player p = Bukkit.getPlayer(args[1]);
				if(p != null){
					int i = 1;
					if(args.length == 3){
						i = Integer.parseInt(args [2]);
					}
					if(i <= 0){
						ChatUtil.sendM(sender, "§8» §7§oMinimalna liczba Skrzyni §c(1).");	
						return false;
					}
					ChatUtil.sendb("§8§m------------------------------------------");
					ChatUtil.sendb("");					
					ChatUtil.sendb("§8» §7"+p);
					ChatUtil.sendb("§8» §b§oZakupil §6x400 Pandor §b§ow naszym Itemshopie.");
					ChatUtil.sendb("§8» §b§oTy tez mozesz §7§oDragonHard.eu");
					ChatUtil.sendb("");
					ChatUtil.sendb("§8§m------------------------------------------");
				}				
				else
				{
					ChatUtil.sendM(sender, "§8» §7§oPodany gracz jest §c§oOffline");	
					return false;	
				}
					
			}
			if(args[0].equalsIgnoreCase("turbodrop"))
			{
				
				Player p = Bukkit.getPlayer(args[1]);
				if(p != null){
					int i = 1;
					if(args.length == 3){
						i = Integer.parseInt(args [2]);
					}
					if(i <= 0){
						ChatUtil.sendM(sender, "§8» §7§oMinimalna liczba Skrzyni §c(1).");	
						return false;
					}
					ChatUtil.sendb("§8§m------------------------------------------");
					ChatUtil.sendb("");					
					ChatUtil.sendb("§8» §7"+p);
					ChatUtil.sendb("§8» §b§oZakupil §6Turbo Drop §b§ow naszym Itemshopie.");
					ChatUtil.sendb("§8» §b§oTy tez mozesz §7§oDragonHard.eu");
					ChatUtil.sendb("");
					ChatUtil.sendb("§8§m------------------------------------------");
				}				
				else
				{
					ChatUtil.sendM(sender, "§8» §7§oPodany gracz jest §c§oOffline");	
					return false;	
				}
					
			}
			if(args[0].equalsIgnoreCase("turboexp"))
			{
				
				Player p = Bukkit.getPlayer(args[1]);
				if(p != null){
					int i = 1;
					if(args.length == 3){
						i = Integer.parseInt(args [2]);
					}
					if(i <= 0){
						ChatUtil.sendM(sender, "§8» §7§oMinimalna liczba Skrzyni §c(1).");	
						return false;
					}
					ChatUtil.sendb("§8§m------------------------------------------");
					ChatUtil.sendb("");					
					ChatUtil.sendb("§8» §7"+p);
					ChatUtil.sendb("§8» §b§oZakupil §6Turbo Exp §b§ow naszym Itemshopie.");
					ChatUtil.sendb("§8» §b§oTy tez mozesz §7§oDragonHard.eu");
					ChatUtil.sendb("");
					ChatUtil.sendb("§8§m------------------------------------------");
				}				
				else
				{
					ChatUtil.sendM(sender, "§8» §7§oPodany gracz jest §c§oOffline");	
					return false;	
				}
					
			}
			else
			{				
					return false;
			}
			
			return false;	
		}
}

