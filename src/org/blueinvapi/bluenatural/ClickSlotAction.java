package org.blueinvapi.bluenatural;

import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryClickEvent;

public interface ClickSlotAction {
	
	public void active(Player p,InventoryClickEvent e);
}
