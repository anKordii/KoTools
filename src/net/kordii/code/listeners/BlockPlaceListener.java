package net.kordii.code.listeners;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import net.kordii.code.utils.ChatUtil;
import net.kordii.code.utils.ItemBuilder;

public class BlockPlaceListener implements Listener{

	@EventHandler(priority=EventPriority.MONITOR)
	public void onPlace(BlockPlaceEvent e){
		Player p = e.getPlayer();
		Block b = e.getBlock();
		if(e.isCancelled()){
			return;
			
		}
		
		
		
		
		if(b.getType() == Material.DRAGON_EGG){
			@SuppressWarnings("deprecation")
			ItemMeta in = p.getItemInHand().getItemMeta();
			if(in.getDisplayName() != null){
				if(in.getDisplayName().toLowerCase().equalsIgnoreCase(ChatUtil.Color(ChatUtil.Color("§8§o< §6DragonCase §8§o>")))){
					b.setType(Material.AIR);			
					if(Math.random() * 100 <= 0.20){
						ItemStack item1 = new ItemBuilder(Material.DIAMOND_PICKAXE).addEnchant(Enchantment.DIG_SPEED, 6).addEnchant(Enchantment.DURABILITY, 3).addEnchant(Enchantment.LOOT_BONUS_BLOCKS, 3).setName("§c§lKilof Kopacza").setLore("§8§o» §7Ten kilof wylatuje jedynie z §6§oDragonCase").toItemStack();
						 boolean isEmpty = true;
            for (ItemStack item : p.getInventory().getContents()) {
                if(item == null) {
                    isEmpty = false;
                    break;
                }
            }
            if(isEmpty) {    
              b.getWorld().dropItemNaturally(b.getLocation(), item1);
            } else {
              p.getInventory().addItem(item1);
            }
						ChatUtil.sendb("§8------------- §6CASE §8-------------");
						ChatUtil.sendb("§8§o» §6"+p.getName()+" §fotworzyl §6DragonCase §fi otrzymal§8: ");
						ChatUtil.sendb("§8§o» §f§o1§o§fx §6§oKilof 6/3/3 §f§o(0.50%)");
						ChatUtil.sendb("§8§o» §8§o< §6DragonCase §8§o> §fDo zakupu na naszej stronie§8: §6DragonHard.eu");
						ChatUtil.sendb("§8------------- §6CASE §8-------------");
					}
					if(Math.random() * 100 <= 0.04){
						ItemStack item1 = new ItemBuilder(Material.BEACON).toItemStack();
						 boolean isEmpty = true;
            for (ItemStack item : p.getInventory().getContents()) {
                if(item == null) {
                    isEmpty = false;
                    break;
                }
            }
            if(isEmpty) {    
              b.getWorld().dropItemNaturally(b.getLocation(), item1);
            } else {
              p.getInventory().addItem(item1);
            }
						ChatUtil.sendb("§8------------- §6CASE §8-------------");
						ChatUtil.sendb("§8§o» §6"+p.getName()+" §fotworzyl §6DragonCase §7i otrzymal§8: ");
						ChatUtil.sendb("§8§o» §6Beacona §f§o(0.04%)");
						ChatUtil.sendb("§8§o» §8§o< §6DragonCase §8§o> §fDo zakupu na naszej stronie§8: §6DragonHard.eu");
						ChatUtil.sendb("§8------------- §6CASE §8-------------");
					}
					if(Math.random() * 30 <= 4){
						ItemStack item1 = new ItemBuilder(Material.TNT, 4).toItemStack();
						 boolean isEmpty = true;
            for (ItemStack item : p.getInventory().getContents()) {
                if(item == null) {
                    isEmpty = false;
                    break;
                }
            }
            if(isEmpty) {    
              b.getWorld().dropItemNaturally(b.getLocation(), item1);
            } else {
              p.getInventory().addItem(item1);
            }	
					}
					if(Math.random() * 100 <= 8){
						ItemStack item1 = new ItemBuilder(Material.TNT, 12).toItemStack();
						 boolean isEmpty = true;
            for (ItemStack item : p.getInventory().getContents()) {
                if(item == null) {
                    isEmpty = false;
                    break;
                }
            }
            if(isEmpty) {    
              b.getWorld().dropItemNaturally(b.getLocation(), item1);
            } else {
              p.getInventory().addItem(item1);
            }	
					}
					if(Math.random() * 10 <= 0.6){
						ItemStack item1 = new ItemBuilder(Material.ENDER_PEARL, 1).toItemStack();
						 boolean isEmpty = true;
            for (ItemStack item : p.getInventory().getContents()) {
                if(item == null) {
                    isEmpty = false;
                    break;
                }
            }
            if(isEmpty) {    
              b.getWorld().dropItemNaturally(b.getLocation(), item1);
            } else {
              p.getInventory().addItem(item1);
            }
					}	
					if(Math.random() * 100 <= 0.6){
						ItemStack item1 = new ItemBuilder(Material.ENDER_PEARL, 4).toItemStack();
						 boolean isEmpty = true;
            for (ItemStack item : p.getInventory().getContents()) {
                if(item == null) {
                    isEmpty = false;
                    break;
                }
            }
            if(isEmpty) {    
              b.getWorld().dropItemNaturally(b.getLocation(), item1);
            } else {
              p.getInventory().addItem(item1);
            }	
					}
					if(Math.random() * 100 <= 1.7){
						ItemStack item1 = new ItemBuilder(Material.ENDER_PEARL, 1).toItemStack();
						 boolean isEmpty = true;
            for (ItemStack item : p.getInventory().getContents()) {
                if(item == null) {
                    isEmpty = false;
                    break;
                }
            }
            if(isEmpty) {    
              b.getWorld().dropItemNaturally(b.getLocation(), item1);
            } else {
              p.getInventory().addItem(item1);
            }	
					}
					if(Math.random() * 60 <= 4.1){
						ItemStack item1 = new ItemBuilder(Material.IRON_HELMET).addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1).addEnchant(Enchantment.DURABILITY, 1).toItemStack();
						 boolean isEmpty = true;
            for (ItemStack item : p.getInventory().getContents()) {
                if(item == null) {
                    isEmpty = false;
                    break;
                }
            }
            if(isEmpty) {    
              b.getWorld().dropItemNaturally(b.getLocation(), item1);
            } else {
              p.getInventory().addItem(item1);
            }	
					}
					if(Math.random() * 100 <= 1.1){
						ItemStack item1 = new ItemBuilder(Material.DIAMOND_HELMET).addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 4).addEnchant(Enchantment.DURABILITY, 3).toItemStack();
						 boolean isEmpty = true;
            for (ItemStack item : p.getInventory().getContents()) {
                if(item == null) {
                    isEmpty = false;
                    break;
                }
            }
            if(isEmpty) {    
              b.getWorld().dropItemNaturally(b.getLocation(), item1);
            } else {
              p.getInventory().addItem(item1);
            }
					}
					if(Math.random() * 100 <= 1.1){
						ItemStack item1 = new ItemBuilder(Material.DIAMOND_CHESTPLATE).addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 4).addEnchant(Enchantment.DURABILITY, 3).toItemStack();
						 boolean isEmpty = true;
            for (ItemStack item : p.getInventory().getContents()) {
                if(item == null) {
                    isEmpty = false;
                    break;
                }
            }
            if(isEmpty) {    
              b.getWorld().dropItemNaturally(b.getLocation(), item1);
            } else {
              p.getInventory().addItem(item1);
            }
					}
					if(Math.random() * 100 <= 1.1){
						ItemStack item1 = new ItemBuilder(Material.DIAMOND_LEGGINGS).addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 4).addEnchant(Enchantment.DURABILITY, 3).toItemStack();
						 boolean isEmpty = true;
            for (ItemStack item : p.getInventory().getContents()) {
                if(item == null) {
                    isEmpty = false;
                    break;
                }
            }
            if(isEmpty) {    
              b.getWorld().dropItemNaturally(b.getLocation(), item1);
            } else {
              p.getInventory().addItem(item1);
            }
					}
					if(Math.random() * 100 <= 1.1){
						ItemStack item1 = new ItemBuilder(Material.DIAMOND_BOOTS).addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 4).addEnchant(Enchantment.DURABILITY, 3).toItemStack();
						 boolean isEmpty = true;
            for (ItemStack item : p.getInventory().getContents()) {
                if(item == null) {
                    isEmpty = false;
                    break;
                }
            }
            if(isEmpty) {    
              b.getWorld().dropItemNaturally(b.getLocation(), item1);
            } else {
              p.getInventory().addItem(item1);
            }
					}
					if(Math.random() * 100 <= 0.6){
						ItemStack item1 = new ItemBuilder(Material.DIAMOND_PICKAXE).addEnchant(Enchantment.DIG_SPEED, 5).addEnchant(Enchantment.DURABILITY, 3).addEnchant(Enchantment.LOOT_BONUS_BLOCKS, 3).toItemStack();
						 boolean isEmpty = true;
            for (ItemStack item : p.getInventory().getContents()) {
                if(item == null) {
                    isEmpty = false;
                    break;
                }
            }
            if(isEmpty) {    
              b.getWorld().dropItemNaturally(b.getLocation(), item1);
            } else {
              p.getInventory().addItem(item1);
            }
					}
					if(Math.random() * 100 <= 0.6){
						ItemStack item1 = new ItemBuilder(Material.DIAMOND_SWORD).addEnchant(Enchantment.DAMAGE_ALL, 5).addEnchant(Enchantment.DURABILITY, 3).addEnchant(Enchantment.FIRE_ASPECT, 2).toItemStack();
						 boolean isEmpty = true;
            for (ItemStack item : p.getInventory().getContents()) {
                if(item == null) {
                    isEmpty = false;
                    break;
                }
            }
            if(isEmpty) {    
              b.getWorld().dropItemNaturally(b.getLocation(), item1);
            } else {
              p.getInventory().addItem(item1);
            }
					}
					if(Math.random() * 100 <= 2){
						ItemStack item1 = new ItemBuilder(Material.GOLDEN_APPLE, 3).toItemStack();
						 boolean isEmpty = true;
            for (ItemStack item : p.getInventory().getContents()) {
                if(item == null) {
                    isEmpty = false;
                    break;
                }
            }
            if(isEmpty) {    
              b.getWorld().dropItemNaturally(b.getLocation(), item1);
            } else {
              p.getInventory().addItem(item1);
            }	
					}
					if(Math.random() * 100 <= 2){
						ItemStack item1 = new ItemBuilder(Material.OBSIDIAN, 24).toItemStack();
						 boolean isEmpty = true;
            for (ItemStack item : p.getInventory().getContents()) {
                if(item == null) {
                    isEmpty = false;
                    break;
                }
            }
            if(isEmpty) {    
              b.getWorld().dropItemNaturally(b.getLocation(), item1);
            } else {
              p.getInventory().addItem(item1);
            }	
					}
					if(Math.random() * 100 <= 3){
						ItemStack item1 = new ItemBuilder(Material.OBSIDIAN, 16).toItemStack();
						 boolean isEmpty = true;
            for (ItemStack item : p.getInventory().getContents()) {
                if(item == null) {
                    isEmpty = false;
                    break;
                }
            }
             if(isEmpty) {    
              b.getWorld().dropItemNaturally(b.getLocation(), item1);
            } else {
              p.getInventory().addItem(item1);
            }	
					}
					if(Math.random() * 100 <= 2){
						ItemStack item1 = new ItemBuilder(Material.DIAMOND, 3).toItemStack();
						 boolean isEmpty = true;
            for (ItemStack item : p.getInventory().getContents()) {
                if(item == null) {
                    isEmpty = false;
                    break;
                }
            }
            if(isEmpty) {    
              b.getWorld().dropItemNaturally(b.getLocation(), item1);
            } else {
              p.getInventory().addItem(item1);
            }	
					}
					if(Math.random() * 100 <= 1){
						ItemStack item1 = new ItemBuilder(Material.DIAMOND, 5).toItemStack();
						 boolean isEmpty = true;
            for (ItemStack item : p.getInventory().getContents()) {
                if(item == null) {
                    isEmpty = false;
                    break;
                }
            }
            if(isEmpty) {    
              b.getWorld().dropItemNaturally(b.getLocation(), item1);
            } else {
              p.getInventory().addItem(item1);
            }	
					}
					if(Math.random() * 100 <= 0.8){
						ItemStack item1 = new ItemBuilder(Material.EMERALD, 2).toItemStack();
						 boolean isEmpty = true;
            for (ItemStack item : p.getInventory().getContents()) {
                if(item == null) {
                    isEmpty = false;
                    break;
                }
            }
            if(isEmpty) {    
              b.getWorld().dropItemNaturally(b.getLocation(), item1);
            } else {
              p.getInventory().addItem(item1);
            }	
					}
					if(Math.random() * 100 <= 0.8){
						ItemStack item1 = new ItemBuilder(Material.EMERALD, 4).toItemStack();
						 boolean isEmpty = true;
            for (ItemStack item : p.getInventory().getContents()) {
                if(item == null) {
                    isEmpty = false;
                    break;
                }
            }
            if(isEmpty) {    
              b.getWorld().dropItemNaturally(b.getLocation(), item1);
            } else {
              p.getInventory().addItem(item1);
            }	
					}
					if(Math.random() * 100 <= 2){
						ItemStack item1 = new ItemBuilder(Material.DIAMOND, 2).toItemStack();
						 boolean isEmpty = true;
            for (ItemStack item : p.getInventory().getContents()) {
                if(item == null) {
                    isEmpty = false;
                    break;
                }
            }
            if(isEmpty) {    
              b.getWorld().dropItemNaturally(b.getLocation(), item1);
            } else {
              p.getInventory().addItem(item1);
            }	
					}
					if(Math.random() * 100 <= 1){
						ItemStack item1 = new ItemBuilder(Material.GOLD_INGOT, 2).toItemStack();
						 boolean isEmpty = true;
            for (ItemStack item : p.getInventory().getContents()) {
                if(item == null) {
                    isEmpty = false;
                    break;
                }
            }
            if(isEmpty) {    
              b.getWorld().dropItemNaturally(b.getLocation(), item1);
            } else {
              p.getInventory().addItem(item1);
            }	
					}
					if(Math.random() * 100 <= 0.8){
						ItemStack item1 = new ItemBuilder(Material.GOLD_INGOT, 3).toItemStack();
						 boolean isEmpty = true;
            for (ItemStack item : p.getInventory().getContents()) {
                if(item == null) {
                    isEmpty = false;
                    break;
                }
            }
            if(isEmpty) {    
              b.getWorld().dropItemNaturally(b.getLocation(), item1);
            } else {
              p.getInventory().addItem(item1);
            }	
					}
					if(Math.random() * 100 <= 1){
						ItemStack item1 = new ItemBuilder(Material.GOLD_INGOT, 1).toItemStack();
						 boolean isEmpty = true;
            for (ItemStack item : p.getInventory().getContents()) {
                if(item == null) {
                    isEmpty = false;
                    break;
                }
            }
            if(isEmpty) {    
              b.getWorld().dropItemNaturally(b.getLocation(), item1);
            } else {
              p.getInventory().addItem(item1);
            }	
					}
					if(Math.random() * 100 <= 1.6){
						ItemStack item1 = new ItemBuilder(Material.DRAGON_EGG, 1).setName(ChatUtil.Color("§8§o< §6DragonCase §8§o>")).addEnchant(Enchantment.LUCK, 1337).addLoreLine("§6<").addLoreLine("§8» §6DragonCase §7Do zakupu na naszej stronie§8:").addLoreLine("§8» §6DragonHard.eu").addLoreLine("§6§o>").toItemStack();
						 boolean isEmpty = true;
            for (ItemStack item : p.getInventory().getContents()) {
                if(item == null) {
                    isEmpty = false;
                    break;
                }
            }
            if(isEmpty) {    
              b.getWorld().dropItemNaturally(b.getLocation(), item1);
            } else {
              p.getInventory().addItem(item1);
            }
					}
					if(Math.random() * 100 <= 0.01){
						ItemStack item1 = new ItemBuilder(Material.DRAGON_EGG, 6).setName(ChatUtil.Color("§8§o< §6DragonCase §8§o>")).addEnchant(Enchantment.LUCK, 1337).addLoreLine("§6<").addLoreLine("§8» §6DragonCase §7Do zakupu na naszej stronie§8:").addLoreLine("§8» §6DragonHard.eu").addLoreLine("§6§o>").toItemStack();
						 boolean isEmpty = true;
            for (ItemStack item : p.getInventory().getContents()) {
                if(item == null) {
                    isEmpty = false;
                    break;
                }
            }
            if(isEmpty) {    
              b.getWorld().dropItemNaturally(b.getLocation(), item1);
            } else {
              p.getInventory().addItem(item1);
            }	
					}
					if(Math.random() * 100 <= 2){
						ItemStack item1 = new ItemBuilder(Material.ENDER_STONE, 3).setName(ChatUtil.Color("§2Generator Stone")).addEnchant(Enchantment.DURABILITY, 10).toItemStack();
						 boolean isEmpty = true;
            for (ItemStack item : p.getInventory().getContents()) {
                if(item == null) {
                    isEmpty = false;
                    break;
                }
            }
            if(isEmpty) {    
              b.getWorld().dropItemNaturally(b.getLocation(), item1);
            } else {
              p.getInventory().addItem(item1);
            }
					}
					if(Math.random() * 60 <= 4.1){
						ItemStack item1 = new ItemBuilder(Material.IRON_CHESTPLATE).addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1).addEnchant(Enchantment.DURABILITY, 1).toItemStack();
						 boolean isEmpty = true;
            for (ItemStack item : p.getInventory().getContents()) {
                if(item == null) {
                    isEmpty = false;
                    break;
                }
            }
            if(isEmpty) {    
              b.getWorld().dropItemNaturally(b.getLocation(), item1);
            } else {
              p.getInventory().addItem(item1);
            }	
					}
					if(Math.random() * 60 <= 4.1){
						ItemStack item1 = new ItemBuilder(Material.IRON_LEGGINGS).addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1).addEnchant(Enchantment.DURABILITY, 1).toItemStack();
						 boolean isEmpty = true;
            for (ItemStack item : p.getInventory().getContents()) {
                if(item == null) {
                    isEmpty = false;
                    break;
                }
            }
            if(isEmpty) {    
              b.getWorld().dropItemNaturally(b.getLocation(), item1);
            } else {
              p.getInventory().addItem(item1);
            }
					}
					if(Math.random() * 60 <= 4.1){
						ItemStack item1 = new ItemBuilder(Material.IRON_BOOTS).addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1).addEnchant(Enchantment.DURABILITY, 1).toItemStack();
						 boolean isEmpty = true;
            for (ItemStack item : p.getInventory().getContents()) {
                if(item == null) {
                    isEmpty = false;
                    break;
                }
            }
            if(isEmpty) {    
              b.getWorld().dropItemNaturally(b.getLocation(), item1);
            } else {
              p.getInventory().addItem(item1);
            }
					}
					if(Math.random() * 100 <= 1){
						ItemStack item1 = new ItemBuilder(Material.SUGAR_CANE).toItemStack();
						 boolean isEmpty = true;
            for (ItemStack item : p.getInventory().getContents()) {
                if(item == null) {
                    isEmpty = false;
                    break;
                }
            }
            if(isEmpty) {    
              b.getWorld().dropItemNaturally(b.getLocation(), item1);
            } else {
              p.getInventory().addItem(item1);
            }	
					}
					if(Math.random() * 100 <= 4){
						ItemStack item1 = new ItemBuilder(Material.BONE, 13).toItemStack();
						 boolean isEmpty = true;
            for (ItemStack item : p.getInventory().getContents()) {
                if(item == null) {
                    isEmpty = false;
                    break;
                }
            }
            if(isEmpty) {    
              b.getWorld().dropItemNaturally(b.getLocation(), item1);
            } else {
              p.getInventory().addItem(item1);
            }	
					}
					if(Math.random() * 100 <= 3){
						ItemStack item1 = new ItemBuilder(Material.BONE, 22).toItemStack();
						 boolean isEmpty = true;
            for (ItemStack item : p.getInventory().getContents()) {
                if(item == null) {
                    isEmpty = false;
                    break;
                }
            }
            if(isEmpty) {    
              b.getWorld().dropItemNaturally(b.getLocation(), item1);
            } else {
              p.getInventory().addItem(item1);
            }
					}	
				}
			}
				
			
		}
	}
		
	
}
