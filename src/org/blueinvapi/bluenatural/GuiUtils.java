package org.blueinvapi.bluenatural;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

public class GuiUtils {
	static List<Inventory> invlist = new ArrayList<>();
	static List<InventoryGui> iglist = new ArrayList<>();
	public static Inventory getGui(String name) {
		for(Inventory inv : invlist) {
			if(!inv.getName().equals(name)) {
				continue;
			}
			return inv;
			
		}
		return null;
	   
	}
	public static List<Inventory> getGuiList(){
		return invlist;
	}
	public static void clearAllGuis() {
		invlist.clear();
	}
	
	public static void removeGui(String name) {
		int number = 0;
		for(int i = 0;i < getGuiList().size();i++) {
			if(!getGuiList().get(i).equals(name)) {
				number = i;
				continue;
			}
			
			
		}
		getGuiList().remove(number);
	}
	public static void openGui(Player p,String name) {
		if(getGuiList().contains(getGui(name))) {
	   p.openInventory(getGui(name));
	}
	}
    public static InventoryGui getInventoryGui(String name) {
    	for(InventoryGui ig: iglist) {
    		if(!ig.getInv().getName().equals(name)) {
    			continue;
    		}
    		return ig;
    	}
		return null;
    }

}
