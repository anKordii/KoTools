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
					if(Math.random() * 200 <= 1.50){
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
						ChatUtil.sendb("§8§m-------------§f §6CASE §8§m-------------§f");
						ChatUtil.sendb("§8§o» §6"+p.getName()+" §fotworzyl §6DragonCase §fi otrzymal§8: ");
						ChatUtil.sendb("§8§o» §f§o1§o§fx §6§oKilof 6/3/3 §f§o(1.50%)");
						ChatUtil.sendb("§8§o» §8§o< §6DragonCase §8§o> §fDo zakupu na naszej stronie§8: §6DragonHard.eu");
						ChatUtil.sendb("§8§m-------------§f §6CASE §8§m-------------§f");
						}
					if(Math.random() * 200 <= 1){
						ItemStack item1 = new ItemBuilder(Material.BEACON).setName("§c§lBEACON").toItemStack();
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
						ChatUtil.sendb("§8§o» §f§o1§o§fx §6§oBeacon §f§o(1.00%)");
						ChatUtil.sendb("§8§o» §8§o< §6DragonCase §8§o> §fDo zakupu na naszej stronie§8: §6DragonHard.eu");
						ChatUtil.sendb("§8------------- §6CASE §8-------------");
						}
					if(Math.random() * 200 <= 6){
						ItemStack item1 = new ItemBuilder(Material.IRON_HELMET).addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 4).addEnchant(Enchantment.DURABILITY, 3).toItemStack();
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
					if(Math.random() * 200 <= 6){
						ItemStack item1 = new ItemBuilder(Material.IRON_CHESTPLATE).addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 4).addEnchant(Enchantment.DURABILITY, 3).toItemStack();
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
					if(Math.random() * 200 <= 6){
						ItemStack item1 = new ItemBuilder(Material.IRON_LEGGINGS).addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 4).addEnchant(Enchantment.DURABILITY, 3).toItemStack();
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
					if(Math.random() * 200 <= 6){
						ItemStack item1 = new ItemBuilder(Material.IRON_BOOTS).addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 4).addEnchant(Enchantment.DURABILITY, 3).toItemStack();
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
					if(Math.random() * 200 <= 4){
						ItemStack item1 = new ItemBuilder(Material.DIAMOND_PICKAXE).addEnchant(Enchantment.LOOT_BONUS_BLOCKS, 3).addEnchant(Enchantment.DURABILITY, 3).addEnchant(Enchantment.DIG_SPEED, 5).toItemStack();
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
					if(Math.random() * 200 <= 5){
						ItemStack item1 = new ItemBuilder(Material.IRON_SWORD).addEnchant(Enchantment.DAMAGE_ALL, 5).addEnchant(Enchantment.DURABILITY, 3).addEnchant(Enchantment.FIRE_ASPECT, 2).toItemStack();
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
					if(Math.random() * 200 <= 5){
						ItemStack item1 = new ItemBuilder(Material.IRON_SWORD).addEnchant(Enchantment.DAMAGE_ALL, 5).addEnchant(Enchantment.KNOCKBACK, 2).toItemStack();
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
					if(Math.random() * 200 <= 4){
						ItemStack item1 = new ItemBuilder(Material.ENDER_PEARL, 5).toItemStack();
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
					if(Math.random() * 200 <= 10){
						ItemStack item1 = new ItemBuilder(Material.IRON_INGOT, 64).toItemStack();
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
					if(Math.random() * 200 <= 10){
						ItemStack item1 = new ItemBuilder(Material.EMERALD, 64).toItemStack();
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
					if(Math.random() * 200 <= 10){
						ItemStack item1 = new ItemBuilder(Material.IRON_INGOT, 64).toItemStack();
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
					if(Math.random() * 200 <= 10){
						ItemStack item1 = new ItemBuilder(Material.GOLD_INGOT, 64).toItemStack();
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
					if(Math.random() * 200 <= 15){
						ItemStack item1 = new ItemBuilder(Material.TNT, 64).toItemStack();
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
					if(Math.random() * 200 <= 4){
						ItemStack item1 = new ItemBuilder(Material.GOLDEN_APPLE, 10).toItemStack();
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
					if(Math.random() * 200 <= 4){
						ItemStack item1 = new ItemStack(Material.GOLDEN_APPLE, 1, (short) 1);
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
					if(Math.random() * 200 <= 1){
						ItemStack item1 = new ItemStack(Material.GOLDEN_APPLE, 4, (short) 1);
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
