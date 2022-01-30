package org.blueinvapi.bluenatural;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryCloseEvent;

public class InventoryListener implements Listener {
	
	@EventHandler
	public void onClicked(InventoryClickEvent e) {
	if(e.getWhoClicked() instanceof Player) {
		Player p = (Player) e.getWhoClicked();
		//Check if this inventory player has clicked.
		if(GuiUtils.getGuiList().contains(e.getInventory())) {
		   if(e.getClickedInventory().equals(p.getInventory())) {
			   return;
			   /*
			    * @return false if player opens player's inventory
			    */
		   }else {
			   
			   e.setCancelled(true);
			   GuiUtils.getInventoryGui(e.getClickedInventory().getTitle()).getCsa().active(p,e);
			   //CHECK IF PLAYER HAS CLICKED AN CLICK ACTION
			  
			   
			   
	   }
		}else {
			return;
		}
	}
	}
	@EventHandler
	public void onClosed(InventoryCloseEvent e) {
		Player p = (Player) e.getPlayer();
		if(!e.getInventory().equals(p.getInventory())) {
			
		GuiUtils.getInventoryGui(e.getInventory().getName()).getCia().close(p, GuiUtils.getInventoryGui(e.getInventory().getName()), e);
	}else {
		return;
	}
	}
	

}
