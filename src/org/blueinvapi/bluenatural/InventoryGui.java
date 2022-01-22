package org.blueinvapi.bluenatural;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.Inventory;

public class InventoryGui {
    private String name;
    private String title;
    private Inventory i;
    private List<Player> players = new ArrayList<>();
    private ClickSlotAction csa;
    private CloseInventoryAction cia;
  
	 public InventoryGui(String name) {
		 this.name = name;
	 }
	 
	 public String getName() {
		 return name;
	 }
	 public int getSize() {
		 return i.getSize();
	 }
	 public List<Player> getPermissionPlayers(){
		 return players;
	 }
	 public InventoryType getType(){
		 return i.getType();
	 }
	 public Inventory getInv() {
		 return i;
	 }
	public String getTitle() {
		return title;
	}
	public CloseInventoryAction getCia() {
		return cia;
	}
	 public ClickSlotAction getCsa() {
		 return csa;
	 }
	public void createGui(String title,int size,InventoryType type,List<Player> getPlayers) {
	  size = getSize();
	  type = getType();
	  getPlayers = getPermissionPlayers();
	  
	  if(getPlayers == null) {
		  i = Bukkit.createInventory(null, size, getTitle());
		  typeputter.put(i, type);
		  GuiUtils.getGuiList().add(i);
	  }else {
		  for(Player p : getPlayers) {
		  i = Bukkit.createInventory(p, size, getTitle());
		  typeputter.put(i, type);
		  GuiUtils.getGuiList().add(i);
	  }
	  }
	 }
	 
	 
}
