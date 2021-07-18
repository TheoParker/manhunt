package xyz.cyto;

import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import xyz.cyto.commands.GetCompass;
import xyz.cyto.commands.SetTarget;
import xyz.cyto.listeners.Listeners;

public class Main extends JavaPlugin {
	
	public void onEnable() {
		
		getServer().getPluginManager().registerEvents(new Listeners(), this);
		this.getCommand("GetCompass").setExecutor(new GetCompass());
		this.getCommand("SetTarget").setExecutor(new SetTarget());
	}
	
	public void onDisable() {
		
	}
	
}
