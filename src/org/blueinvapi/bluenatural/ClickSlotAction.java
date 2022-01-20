package org.blueinvapi.bluenatural;

import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;

public interface ClickSlotAction {
	
	public void active(InventoryGui ig,Player p,int slot,InventoryClickEvent e);
}
