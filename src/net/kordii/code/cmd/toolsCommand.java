package net.kordii.code.cmd;

import net.kordii.code.Main;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class toolsCommand implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(cmd.getName().equalsIgnoreCase("pomoc")){	
			sender.sendMessage("§8------------- §6Pomoc §8-------------");
			sender.sendMessage("");	
			sender.sendMessage("§8§o» §6/drop §8- §f§odropy z kamienia. ");
			sender.sendMessage("§8§o» §6/pomocgildia §8- §f§okomendy gildyjne. ");
			sender.sendMessage("§8§o» §6/g itemy §8- §f§oprzedmioty na gildie. ");
			sender.sendMessage("§8§o» §6/crafting §8- §f§olista craftingów. ");
			sender.sendMessage("§8§o» §6/gracz §8- §f§osprawdzanie rankingu.  ");
			sender.sendMessage("§8§o» §6/svip §8- §f§okupno rangi svip. ");
			sender.sendMessage("§8§o» §6/vip §8- §f§okupno rangi vip. ");
			sender.sendMessage("");			
			sender.sendMessage("§8------------- §6Pomoc §8-------------");
			
		}
		
		if(cmd.getName().equalsIgnoreCase("vip")){
			sender.sendMessage("§8------------- §6VIP §8-------------");
			sender.sendMessage("");			
			sender.sendMessage("§8§o» §6/repair §8- §f§onaprawa przedmiotu.");
			sender.sendMessage("§8§o» §6/kit vip §8- §f§ozestaw do odebrania.");
			sender.sendMessage("§8§o» §6/enderchest §8- §f§opodreczny enderchest.");
			sender.sendMessage("");
			sender.sendMessage("§8§o➢  §f§oWyglad na chacie: §6TestUser: ");
			sender.sendMessage("§8§o➢  §f§oPowiekszony drop o §6§n25%");
			sender.sendMessage("§8§o➢  §6Rezerwacja slota na serwerze.");
			sender.sendMessage("§8§o➢  §6Polowa przedmiotów na gildie.");
			sender.sendMessage("");
			sender.sendMessage("§8§o» §6§oCena zakupu wynosi §6§n7.38 PLN§f§o na czas trwania 1 edycji.");
			sender.sendMessage("§8§o»§8§o»§8§o» §f§oZakupisz range tutaj: §6§nhttp://dragonhard.eu/ §8§o«§8§o«§8§o«");
			sender.sendMessage("");	
			sender.sendMessage("§8------------- §6VIP §8-------------");

		}
		if(cmd.getName().equalsIgnoreCase("svip")){
			sender.sendMessage("§8------------- §6SVIP §8-------------");
			sender.sendMessage("");		
			sender.sendMessage("§8§o» §6/repair §8- §f§onaprawa przedmiotu.");
			sender.sendMessage("§8§o» §6/kit vip §8| §esvip §8- §f§ozestawy do odebrania.");
			sender.sendMessage("§8§o» §6/enderchest §8- §f§opodreczny enderchest.");
			sender.sendMessage("");
			sender.sendMessage("§8§o➢  §f§oWyglad na chacie: §3TestUser: ");
			sender.sendMessage("§8§o➢  §f§oPowiekszony drop o §6§n25%");
			sender.sendMessage("§8§o➢  §6Rezerwacja slota na serwerze.");
			sender.sendMessage("§8§o➢  §6Polowa przedmiotów na gildie.");
			sender.sendMessage("");
			sender.sendMessage("§8§o» §f§oCena zakupu wynosi §6§n17.22 PLN§f§o na czas trwania 1 edycji.");
			sender.sendMessage("§8§o»§8§o»§8§o» §fZakupisz range tutaj: §6http://dragonhard.pl/ §8§o«§8§o«§8§o«");
			sender.sendMessage("");	
			sender.sendMessage("§8------------- §6SVIP §8-------------");
		}
		if(cmd.getName().equalsIgnoreCase("pl")){
			sender.sendMessage("§8» §cBrak dostepu do tej komendy §7(core.cmd).");
		}
		if(cmd.getName().equalsIgnoreCase("plugins")){
			sender.sendMessage("§8» §cBrak dostepu do tej komendy §7(core.cmd).");
		}
		if(cmd.getName().equalsIgnoreCase("ver")){
			sender.sendMessage("§8» §cBrak dostepu do tej komendy §7(core.cmd).");
		}
		if(cmd.getName().equalsIgnoreCase("?")){
			sender.sendMessage("§8» §cBrak dostepu do tej komendy §7(core.cmd).");
		}
		if(cmd.getName().equalsIgnoreCase("bukkit")){
			sender.sendMessage("§8» §cBrak dostepu do tej komendy §7(core.cmd).");
		}
		if(cmd.getName().equalsIgnoreCase("g")){
			sender.sendMessage("§8» §c§oPoprawne uzycie §7/pomocgildia");
		}
		if(cmd.getName().equalsIgnoreCase("me")){
			sender.sendMessage("§8» §cBrak dostepu do tej komendy §7(core.cmd).");
		}
		if(cmd.getName().equalsIgnoreCase("bukkit:me")){
			sender.sendMessage("§8» §cBrak dostepu do tej komendy §7(core.cmd).");
		}
		if(cmd.getName().equalsIgnoreCase("fg")){
			sender.sendMessage("§8» §cBrak dostepu do tej komendy §7(core.cmd).");
		}
		if(cmd.getName().equalsIgnoreCase("funnyguilds")){
			sender.sendMessage("§8» §cBrak dostepu do tej komendy §7(core.cmd).");
		}
		if(cmd.getName().equalsIgnoreCase("reload")){
			sender.sendMessage("§8» §cKomenda zablokowana zewzgledu na bezpieczenstwo");
		}
		if(cmd.getName().equalsIgnoreCase("sklep")){	
			sender.sendMessage("§8------------- §6Sklep §8-------------");
			sender.sendMessage("            §6Spis Uslug ze sklepu");
			sender.sendMessage("");	
			sender.sendMessage("§8§o» §6/vip §8- §f§oInformacje o randze. ");
			sender.sendMessage("§8§o» §6/svip §8- §f§oInformacje o randze. ");
			sender.sendMessage("");			
			sender.sendMessage("§8§o» §6Disco Zbroja §8- §fKolorowa zbroja ");
			sender.sendMessage("§8§o» §6Turbo Drop/Exp §8- §fDodatkowe procenty do dropu i expa ");
			sender.sendMessage("§8§o» §6DragonCase §8- §fSkrzynie z przedmiotami ");
			sender.sendMessage("");			
			sender.sendMessage("§8------------- §6Sklep §8-------------");
			
		}
        return false;
    }
}
