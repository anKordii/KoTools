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

public class CaseCmd implements CommandExecutor{
	
	
		public boolean onCommand(CommandSender sender, Command c, String s, String[] args){
			if(!sender.hasPermission("case.cmd")){
				ChatUtil.sendM(sender, "§8» &cBrak dostepu do tej komendy §7(case.cmd).");
				return false;
			}
			if(args.length < 2){
				ChatUtil.sendM(sender, "§8» §7§oWzor komendy: §c§o/dragoncase <all|gracz> <ilosc|nick> <puste|ilosc>.");				
				return false;
			}
			if(args[0].equalsIgnoreCase("all")){
				int i = Integer.parseInt(args [1]);
				if(i <= 0){
					ChatUtil.sendM(sender, "§8» §7§oMinimalna liczba Skrzyni §c(1).");	
					return false;
				}
				ItemStack item = new ItemBuilder(Material.DRAGON_EGG, i).setName(ChatUtil.Color("§8§o< §6DragonCase §8§o>")).addEnchant(Enchantment.LUCK, 1337).addLoreLine("§6<").addLoreLine("§8» §6DragonCase §7Do zakupu na naszej stronie§8:").addLoreLine("§8» §6DragonHard.eu").addLoreLine("§6§o>").toItemStack();
				for (Player p : Bukkit.getOnlinePlayers()){
					p.getInventory().addItem(item);
				}
				ChatUtil.sendb("§8------------- §6Case §8-------------");
				ChatUtil.sendb("§8» §fAdministracja rozdala serwerowi §6x"+i);
				ChatUtil.sendb("§8» §8§o< §6DragonCase §8§o> §fDo zakupu na naszej stronie§8: §6DragonHard.eu");
				ChatUtil.sendb("§8------------- §6Case §8-------------");
				return false;
			}
			if(args[0].equalsIgnoreCase("gracz"))
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
					ItemStack item = new ItemBuilder(Material.DRAGON_EGG, i).setName(ChatUtil.Color("§8§o< §6DragonCase §8§o>")).addEnchant(Enchantment.LUCK, 1337).addLoreLine("§6<").addLoreLine("§8» §6DragonCase §7Do zakupu na naszej stronie§8:").addLoreLine("§8» §6DragonHard.eu").addLoreLine("§6§o>").toItemStack();
					p.getInventory().addItem(item);
				}
				else
				{
					ChatUtil.sendM(sender, "§8» §7§oPodany gracz jest §c§oOffline");	
					return false;	
				}
			}
			else
			{
				ChatUtil.sendM(sender, "§8» §7§oWzor komendy: §c§o/supremecase <all|gracz> <ilosc|nick> <puste|ilosc>.");				
					return false;
			}
			
			return false;	
		}
}
