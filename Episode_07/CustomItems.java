package items;

import java.util.ArrayList;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import net.md_5.bungee.api.ChatColor;

public class CustomItems implements Listener{
	
	public static void giveItems(Player player) {
		ItemStack item = new ItemStack(Material.DIAMOND_AXE);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.GREEN + "TreeAxe");
		ArrayList<String> lore = new ArrayList<String>();
		lore.add(ChatColor.LIGHT_PURPLE + "Used by trees before humans were around.");
		meta.setLore(lore);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		item.setItemMeta(meta);
		
		player.getInventory().addItem(item);
	}
}
