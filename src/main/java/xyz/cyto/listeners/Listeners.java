package xyz.cyto.listeners;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

import net.md_5.bungee.api.ChatColor;
import xyz.cyto.commands.GetCompass;
import xyz.cyto.commands.SetTarget;

public class Listeners implements Listener{
	
	SetTarget sTar = new SetTarget();
	GetCompass gCom = new GetCompass();
	

	public void update() {
		Player tar = sTar.getTarget();
		Location loc = tar.getLocation();
		Player hun = gCom.getHunter();
		hun.setCompassTarget(loc);
	}
	
	
	
	@EventHandler
	public void onRightClick(PlayerInteractEvent e) {
		Player mname = e.getPlayer();
		
		if (e.getItem() == null) return;
		if (e.getItem().getType() != Material.COMPASS) {
			return;
		}
		if (e.getAction() == Action.RIGHT_CLICK_AIR || e.getAction() == Action.RIGHT_CLICK_BLOCK) {
			mname.sendMessage(ChatColor.BLUE + "Compass is now updated");
			update();
			
		}
		
	}
}
