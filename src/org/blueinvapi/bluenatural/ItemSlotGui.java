package org.blueinvapi.bluenatural;

import java.util.HashMap;

import org.bukkit.event.inventory.ClickType;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class ItemSlotGui {
	static HashMap<Integer,ItemStack> itemputter = new HashMap<Integer,ItemStack>();
	static HashMap<ItemStack,ClickType> actionputter = new HashMap<ItemStack,ClickType>();
    private ItemStack is;
    private Integer in;
    private Inventory inv;
	public void putSlot(ItemStack is,Integer in) {
		if(!inv.contains(this.is, this.in)) {
		itemputter.put(in, is);
		this.is = is;
		this.in = in;
		}else {
        itemputter.replace(in, is);
		}
		
	}
	public void setItem(Inventory i) {
		i.setItem(in, is);
		
		this.inv = i;
		
	}
	public static HashMap<Integer,ItemStack> getItemPutter(){
		return itemputter;
	}
	public void putAction(ClickType ca) {
		actionputter.put(is, ca);
		
	}
	public static HashMap<ItemStack,ClickType> getActionPutter(){
		return actionputter;
	}
}
