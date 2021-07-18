package xyz.cyto.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class SetTarget implements CommandExecutor {
	
	static Player t;
	
	public Player getTarget() {
		return t;
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(label.equalsIgnoreCase("SetTarget")) {
			if(!(sender instanceof Player)) {
				sender.sendMessage(ChatColor.RED + "Console cannot be tracked");
				return true;
			}
			t = (Player) sender;
			t.sendMessage(ChatColor.RED + "You are now the target");
			return true;
		}
		return false;
	}
}
