package org.blueinvapi.bluenatural;

import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryCloseEvent;
import org.bukkit.inventory.Inventory;

public interface CloseInventoryAction {
	
	public void close(Player p,InventoryGui inv,InventoryCloseEvent e);

}
