package org.blueinvapi.bluenatural;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class InventoryGui {
    
    private String title;
    private Inventory i;
    private List<Player> players = new ArrayList<>();
    private ClickSlotAction csa;
    private ItemSlotGui isg;
    private String name;
    private CloseInventoryAction cia;
    HashMap<Inventory,InventoryType> typeputter = new HashMap<>();
	 public InventoryGui(String name) {
		 this.name = name;
	 }
	 public ItemSlotGui getISG() {
		 return isg;
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
	public String getName() {
		return name;
	}
	public CloseInventoryAction getCia() {
		return cia;
	}
	 public ClickSlotAction getCsa() {
		 return csa;
	 }
	@SuppressWarnings("static-access")
	public void createGui(String name,ItemSlotGui isg,int size,InventoryType type,List<Player> getPlayers) {
	  size = getSize();
	  type = getType();
	  this.name = name;
	  getPlayers = getPermissionPlayers();
	  this.isg = isg;
	  if(getPlayers == null) {
		  for(Entry<Integer,ItemStack> entries : isg.getItemPutter().entrySet()) {
		  i = Bukkit.createInventory(null, size, getTitle());
		  i.setItem(entries.getKey(), entries.getValue());
		  typeputter.put(i, type);
		  GuiUtils.getGuiList().add(i);
		  }
	  }else {
		  for(Player p : getPlayers) {
			  for(Entry<Integer,ItemStack> entries : isg.getItemPutter().entrySet()) {
		  i = Bukkit.createInventory(p, size, getTitle());
		  i.setItem(entries.getKey(), entries.getValue());
		  typeputter.put(i, type);
		  GuiUtils.getGuiList().add(i);
			  }
	  }
	  }
	 }
	 
	 
}
