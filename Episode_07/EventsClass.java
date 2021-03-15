package myplugin.spiro.Tutorial;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;

import items.CustomItems;

public class EventsClass implements Listener {
	private CustomItems custom = new CustomItems();
	
	@EventHandler
	public void onPunch(PlayerInteractEvent event) {
		Player player = event.getPlayer();
		custom.giveItems(player);
	}
}
