package org.blueinvapi.bluenatural;

import java.util.HashMap;

import org.bukkit.event.inventory.ClickType;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class ItemSlotGui {
	HashMap<ItemStack,Integer> itemputter = new HashMap<ItemStack,Integer>();
	HashMap<ItemStack,ClickType> actionputter = new HashMap<ItemStack,ClickType>();
    private ItemStack is;
    private int integer;
	
	public ItemSlotGui(ItemStack is) {
		this.is = is;
	}
	public ItemSlotGui(int i) {
	   this.integer = i;
	}
	public ItemStack getItem() {
		return is;
	}
	public void putItem(Inventory i,Integer in) {
		itemputter.put(is, in);
		i.setItem(itemputter.get(is), is);
		
		
	}
	public void setItem(Inventory i,ItemStack itemstack) {
		itemputter.put(itemstack, integer);
		i.setItem(integer, itemstack);
	}
	public HashMap<ItemStack,Integer> getItemPutter(){
		return itemputter;
	}
	public void putAction(ClickType ca) {
		actionputter.put(getItem(), ca);
		
	}
	public HashMap<ItemStack,ClickType> getActionPutter(){
		return actionputter;
	}
}
