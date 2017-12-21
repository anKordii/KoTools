package net.kordii.code;

import net.kordii.code.listeners.*;
import net.kordii.code.Chat.*;
import net.kordii.code.RandomTp.*;
import net.kordii.code.cmd.toolsCommand;
import net.kordii.code.events.autoMsg;
import net.kordii.code.listeners.onDeath;
import net.kordii.code.listeners.onJoin;
import net.kordii.code.listeners.onPing;
import net.kordii.code.listeners.onQuit;
import net.kordii.code.listeners.onType;
import net.kordii.code.cmd.CaseCmd;
import net.kordii.code.listeners.BlockPlaceListener;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;
import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.PacketType.Status.Server;
import com.comphenix.protocol.ProtocolLibrary;
import com.comphenix.protocol.ProtocolManager;
import com.comphenix.protocol.events.PacketAdapter;
import com.comphenix.protocol.events.PacketAdapter.AdapterParameteters;
import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.events.PacketEvent;
import com.comphenix.protocol.reflect.StructureModifier;
import com.comphenix.protocol.wrappers.WrappedServerPing;
import net.kordii.code.listeners.BlocadeListeners;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Random;
import org.bukkit.Bukkit;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.command.PluginCommand;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.FileConfigurationOptions;
import org.bukkit.entity.Arrow;
import org.bukkit.entity.Egg;
import org.bukkit.entity.Entity;
import org.bukkit.entity.ExperienceOrb;
import org.bukkit.entity.Player;
import org.bukkit.entity.Projectile;
import org.bukkit.entity.Snowball;
import org.bukkit.entity.ThrownPotion;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerKickEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;
import com.sk89q.worldguard.bukkit.WorldGuardPlugin;
import me.confuser.barapi.BarAPI;
import net.kordii.code.Main;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;
import net.kordii.code.listeners.Break;
import net.kordii.code.listeners.Place;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import me.confuser.barapi.BarAPI;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Arrow;
import org.bukkit.entity.Egg;
import org.bukkit.entity.Entity;
import org.bukkit.entity.ExperienceOrb;
import org.bukkit.entity.Player;
import org.bukkit.entity.Projectile;
import org.bukkit.entity.Snowball;
import org.bukkit.entity.ThrownPotion;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerKickEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitScheduler;

public class Main extends JavaPlugin
implements Listener{

	  Chat chat;
	  Slow slow;
	  Pisanie pisanie;
	  RandomTp randomtp;
    private static Main instance;
    public static Main getInstance;
    public HashMap<String, Long> taggedPlayers = new HashMap();
    public static WorldGuardPlugin getWorldGuard()
    {
      Plugin wg = Bukkit.getServer().getPluginManager().getPlugin("WorldGuard");
      if ((wg == null) || (!(wg instanceof WorldGuardPlugin))) {
        System.out.println("[KoTools] Nie znaleziono pluginu WorldGuard!");
      }
      return (WorldGuardPlugin)wg;
    }
    
    @Override
    public void onEnable(){
        getServer().getPluginManager().registerEvents(this, this);
        enableTimer();
        
        getInstance = this;
        
        List<String> lore = new ArrayList();
        lore.add("§2Aby go calkowicie zniszczyc musisz zniszczyc endstone");
        
        ItemStack sg = new ItemStack(Material.ENDER_STONE, 1);
        ItemMeta meta = sg.getItemMeta();
        meta.setDisplayName("§fSTONIARKA §7- §6Automatyczny generator kamienia");
        meta.setLore(lore);
        sg.setItemMeta(meta);
        
        ShapedRecipe stonegenerator = new ShapedRecipe(sg).shape(new String[] {
          "ABA", 
          "DCD", 
          "AEA" })
          .setIngredient('A', Material.GOLD_NUGGET)
          .setIngredient('B', Material.STONE)
          .setIngredient('C', Material.PISTON_BASE)
          .setIngredient('D', Material.REDSTONE)
          .setIngredient('E', Material.DIAMOND);
        getServer().addRecipe(stonegenerator);
        
        registerEvents(this, new Listener[] { new Break() });
        registerEvents(this, new Listener[] { new Place() });
        
    	
        instance = this;

        Bukkit.getPluginManager().registerEvents(new BlocadeListeners(), this);
        this.getServer().getPluginManager().registerEvents(new onPing(), this);
        this.getServer().getPluginManager().registerEvents(new onDeath(), this);
        this.getServer().getPluginManager().registerEvents(new onQuit(), this);
        this.getServer().getPluginManager().registerEvents(new onJoin(), this);
        this.getServer().getPluginManager().registerEvents(new onType(), this);
        this.getCommand("pomoc").setExecutor(new toolsCommand());
        this.getCommand("vip").setExecutor(new toolsCommand());
        this.getCommand("svip").setExecutor(new toolsCommand());
        this.getCommand("pl").setExecutor(new toolsCommand());
        this.getCommand("plugins").setExecutor(new toolsCommand());
        this.getCommand("fg").setExecutor(new toolsCommand());
        this.getCommand("funnyguilds").setExecutor(new toolsCommand());
        this.getCommand("ver").setExecutor(new toolsCommand());
        this.getCommand("?").setExecutor(new toolsCommand());
        this.getCommand("g").setExecutor(new toolsCommand());
        this.getCommand("me").setExecutor(new toolsCommand());
        this.getCommand("sklep").setExecutor(new toolsCommand());
		getCommand("dragoncase").setExecutor(new CaseCmd());
        List msgs = (getConfig().getStringList("listMsg"));
        autoMsg.startMsg(msgs);
        
		instance = this;
		PluginManager pm = Bukkit.getPluginManager();
		pm.registerEvents(new BlockPlaceListener(), this);

        this.chat = new Chat(this);
        this.slow = new Slow(this);
        this.pisanie = new Pisanie(this);  
        
        instance = this;

        getLogger().info(">>> Plugin koTools zostal wlaczony na wersje 1.8.8");

        saveDefaultConfig();
        
    }

    @Override
    public void onDisable(){
        getLogger().info(">>> Plugin koTools zostal wylaczony na wersje 1.8.8");
        
    }

    public static Main getInst(){
        return instance;
    }
    
    public static void registerEvents(Plugin plugin, Listener[] listeners)
    {
      Listener[] arrayOfListener;
      int j = (arrayOfListener = listeners).length;
      for (int i = 0; i < j; i++)
      {
        Listener listener = arrayOfListener[i];
        Bukkit.getServer().getPluginManager().registerEvents(listener, plugin);
      }
    }
    
/*
 * AntyLogout
 */
    
    public String t(String msg)
    {
      return ChatColor.translateAlternateColorCodes('&', msg);
    }
    
    public long getSystemTime()
    {
      return System.currentTimeMillis() / 1000L;
    }
    
    public void enableTimer()
    {
      getServer().getScheduler().scheduleSyncRepeatingTask(this, 
        new Runnable()
        {
          public void run()
          {
            Iterator iter = Main.this.taggedPlayers.entrySet()
              .iterator();
            while (iter.hasNext())
            {
              Map.Entry c = (Map.Entry)iter.next();
              if (Main.this.getSystemTime() - ((Long)c.getValue()).longValue() >= 20L)
              {
                iter.remove();
                Player player = Main.this.getServer().getPlayer(
                  (String)c.getKey());
                try
                {
                  player.sendMessage(Main.this.t("&4UWAGA!: &aNie jestes podczas walki, mozesz sie wylogowac."));
                }
                catch (Exception localException) {}
              }
            }
          }
        }, 0L, 20L);
    }
    
    @EventHandler(priority=EventPriority.LOWEST)
    public void onCommand(PlayerCommandPreprocessEvent event)
    {
      if ((this.taggedPlayers.containsKey(event.getPlayer().getName())) && 
        (!event.getPlayer().isOp()))
      {
        if (event.getMessage().contains("walka")) {
          return;
        }
        event.setCancelled(true);
        event.getPlayer().sendMessage(t("&4UWAGA!: &cJestes podczas walki, nie mozesz uzywac komend."));
        return;
      }
    }
    
    @EventHandler(priority=EventPriority.LOWEST)
    public void onInteract(PlayerInteractEvent event)
    {
      Player who = event.getPlayer();
      if ((event.getAction() == Action.RIGHT_CLICK_BLOCK) && 
        (event.getClickedBlock().getType() == Material.ENDER_CHEST) && 
        (this.taggedPlayers.containsKey(event.getPlayer().getName())) && 
        (!event.getPlayer().isOp()))
      {
        event.getPlayer().sendMessage(t("&4UWAGA!: &cJestes podczas walki, nie mozesz otwierac enderchesta."));
        event.setCancelled(true);
        return;
      }
    }
    
    @EventHandler(priority=EventPriority.LOWEST)
    public void onPlayerKick(PlayerKickEvent event)
    {
      Player player = event.getPlayer();
      if ((this.taggedPlayers.containsKey(player.getName())) && 
        (!event.getReason().contains("spam"))) {
        this.taggedPlayers.remove(player.getName());
      }
    }
    
    @EventHandler
    public void onPlayerDeath(PlayerDeathEvent event)
    {
      Player player = event.getEntity().getPlayer();
      if (this.taggedPlayers.containsKey(player.getName()))
      {
        this.taggedPlayers.remove(player.getName());
        BarAPI.removeBar(player);
      }
    }
    
    @EventHandler(priority=EventPriority.LOWEST)
    public void onPlayerQuit(PlayerQuitEvent event)
    {
      Player player = event.getPlayer();
      if (this.taggedPlayers.containsKey(player.getName()))
      {
        this.taggedPlayers.remove(player.getName());
        
        Bukkit.broadcastMessage(t("&8" + player.getName() + " &8wylogowal sie podczas walki."));
        dropPunishment(player);
        player.setHealth(0.0D);
      }
    }
    
    public void dropPunishment(Player player)
    {
      ItemStack[] stacks = 
        (ItemStack[])player.getInventory().getContents().clone();
      player.getInventory().clear();
      ItemStack[] arrayOfItemStack1;
      int j = (arrayOfItemStack1 = stacks).length;
      for (int i = 0; i < j; i++)
      {
        ItemStack stack = arrayOfItemStack1[i];
        if ((stack != null) && (stack.getType() != Material.AIR)) {
          player.getLocation().getWorld().dropItemNaturally(player.getLocation(), stack);
        }
      }
      ItemStack[] armorstacks = 
        (ItemStack[])player.getInventory().getArmorContents().clone();
      player.getInventory().setArmorContents(new ItemStack[4]);
      ItemStack[] arrayOfItemStack2;
      int k = (arrayOfItemStack2 = armorstacks).length;
      for (j = 0; j < k; j++)
      {
        ItemStack stack = arrayOfItemStack2[j];
        if ((stack != null) && (stack.getType() != Material.AIR)) {
          player.getLocation().getWorld().dropItemNaturally(player.getLocation(), stack);
        }
      }
      player.setExp(0.0F);
      for (int i = 0; i < player.getLevel(); i++) {
        ((ExperienceOrb)player.getLocation().getWorld().spawn(player.getLocation(), ExperienceOrb.class)).setExperience(2 * i + 1);
      }
      player.setLevel(0);
    }
    
    @EventHandler(priority=EventPriority.HIGHEST, ignoreCancelled=true)
    public void onEntityDamageByEntity(EntityDamageByEntityEvent event)
    {
      if (!event.isCancelled())
      {
        Entity entity = event.getEntity();
        Entity damager = event.getDamager();
        if (((entity instanceof Player)) && ((damager instanceof Player)))
        {
          tagAttacker(damager, entity);
          tagVictim(damager, entity);
        }
        if (((damager instanceof Projectile)) && ((entity instanceof Player)) && 
          ((((Projectile)damager).getShooter() instanceof Player))) {
          if ((damager instanceof Arrow))
          {
            tagAttacker((Entity) ((Projectile)damager).getShooter(), 
              entity);
            tagVictim((Entity) ((Projectile)damager).getShooter(), 
              entity);
          }
          else if ((damager instanceof Egg))
          {
            tagAttacker((Entity) ((Projectile)damager).getShooter(), 
              entity);
            tagVictim((Entity) ((Projectile)damager).getShooter(), 
              entity);
          }
          else if ((damager instanceof Snowball))
          {
            tagAttacker((Entity) ((Projectile)damager).getShooter(), 
              entity);
            tagVictim((Entity) ((Projectile)damager).getShooter(), 
              entity);
          }
          else if ((damager instanceof ThrownPotion))
          {
            tagAttacker((Entity) ((Projectile)damager).getShooter(), 
              entity);
            tagVictim((Entity) ((Projectile)damager).getShooter(), 
              entity);
          }
        }
      }
    }
    
    private void tagAttacker(Entity attacker, Entity victim)
    {
      if ((attacker instanceof Player))
      {
        Player a = (Player)attacker;
        if (!this.taggedPlayers.containsKey(a.getName()))
        {
          this.taggedPlayers.put(a.getName(), 
            Long.valueOf(getSystemTime()));
          
          BarAPI.setMessage(a, t("&cANTY-LOGOUT"), 20);
          
          
        }
        else
        {
          this.taggedPlayers.remove(a.getName());
          BarAPI.setMessage(a, t("&aANTY-LOGOUT"), 20);
          this.taggedPlayers.put(a.getName(), 
            Long.valueOf(getSystemTime()));
          
          
        }
      }
    }
    
    public void tagVictim(Entity attacker, Entity victim)
    {
      if ((victim instanceof Player))
      {
        Player v = (Player)victim;
        if (!this.taggedPlayers.containsKey(v.getName()))
        {
          this.taggedPlayers.put(v.getName(), 
            Long.valueOf(getSystemTime()));
          
          BarAPI.setMessage(v, t("&cANTY-LOGOUT"), 20);
          
          
        }
        else
        {
          this.taggedPlayers.remove(v.getName());
          BarAPI.setMessage(v, t("&aANTY-LOGOUT"), 20);
          this.taggedPlayers.put(v.getName(), 
            Long.valueOf(getSystemTime()));
          
          
        }
      }
    }
}
