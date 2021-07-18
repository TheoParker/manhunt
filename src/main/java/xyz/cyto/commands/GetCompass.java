package xyz.cyto.commands;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;




public class GetCompass implements CommandExecutor {
	
	static Player hunter;
	
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		
		if(label.equalsIgnoreCase("GetCompass")) {
			if(!(sender instanceof Player)) {
				sender.sendMessage("Console doesn't have hands");
				return true;
			}
			hunter = (Player) sender;
			PlayerInventory hunt = hunter.getInventory();
			ItemStack newcom = new ItemStack(Material.COMPASS);
			
			ItemStack item = hunt.getItem(8);
			
			if(item == null) {
				hunt.setItem(8, newcom);
				return true;
			} else {
				hunter.sendMessage(ChatColor.GREEN + "please clear your 9th hotbar inv slot and try again");
				return true;
			}
		}
		return false;
	}
	
	public Player getHunter() {
		return hunter;
	}
}
