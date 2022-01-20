package org.blueinvapi.bluenatural;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class BorderInventory {
	
	Inventory i;
	
	public BorderInventory(Inventory i) {
		this.i = i;
	}
    public void setOutsideBorder(ItemStack item) {
    	if(i.getSize() == 9) {
    		if(i.getType().equals(InventoryType.CRAFTING) || i.getType().equals(InventoryType.DISPENSER) || i.getType().equals(InventoryType.DROPPER)) {
    	 i.setItem(1, item);
    	 i.setItem(2, item);
    	 i.setItem(3, item);
    	 i.setItem(4, item);
    	 i.setItem(6, item);
    	 i.setItem(7, item);
    	 i.setItem(8, item);
    	 i.setItem(9, item);
    	 
    	 
    		}else {
    			return;
    		}
    	 
    	}else if(i.getSize() == 27) {
    		if(i.getType().equals(InventoryType.CHEST)) {
    		 i.setItem(1, item);
        	 i.setItem(2, item);
        	 i.setItem(3, item);
        	 i.setItem(4, item);
        	 i.setItem(5, item);
        	 i.setItem(6, item);
        	 i.setItem(7, item);
        	 i.setItem(8, item);
        	 i.setItem(9, item);
        	 i.setItem(10, item);
        	 i.setItem(18, item);
        	 i.setItem(19, item);
        	 i.setItem(20, item);
        	 i.setItem(21, item);
        	 i.setItem(22, item);
        	 i.setItem(23, item);
        	 i.setItem(24, item);
        	 i.setItem(25, item);
        	 i.setItem(26, item);
        	 i.setItem(27, item);
        	 
    	}else {
    		return;
    	}
    	}else if(i.getSize() == 36) {
    		if(i.getType().equals(InventoryType.CHEST)) {
    		i.setItem(1, item);
       	 i.setItem(2, item);
       	 i.setItem(3, item);
       	 i.setItem(4, item);
       	 i.setItem(5, item);
       	 i.setItem(6, item);
       	 i.setItem(7, item);
       	 i.setItem(8, item);
       	 i.setItem(9, item);
       	 i.setItem(10, item);
       	 i.setItem(18, item);
       	 i.setItem(19, item);
       	 i.setItem(27, item);
       	 i.setItem(28, item);
       	 i.setItem(29, item);
       	 i.setItem(30, item);
       	 i.setItem(31, item);
       	 i.setItem(32, item);
       	 i.setItem(33, item);
       	 i.setItem(34, item);
       	 i.setItem(35, item);
       	 i.setItem(36, item);
       	 
    		}else {
    			return;
    		}
       	 
    	}else if(i.getSize() == 45) {
    		if(i.getType().equals(InventoryType.CHEST)) {
    			 i.setItem(2, item);
    	       	 i.setItem(3, item);
    	       	 i.setItem(4, item);
    	       	 i.setItem(5, item);
    	       	 i.setItem(6, item);
    	       	 i.setItem(7, item);
    	       	 i.setItem(8, item);
    	       	 i.setItem(9, item);
    	       	 i.setItem(10, item);
    	       	 i.setItem(18, item);
    	       	 i.setItem(19, item);
    	       	 i.setItem(27, item);
    	       	 i.setItem(28, item);
    	       	 i.setItem(36, item);
    	       	 i.setItem(37, item);
    	       	 i.setItem(38, item);
    	       	 i.setItem(39, item);
    	       	 i.setItem(40, item);
    	       	 i.setItem(41, item);
    	       	 i.setItem(42, item);
    	       	 i.setItem(43, item);
    	       	 i.setItem(44, item);
    	       	 i.setItem(45, item);
    	       	
    	       	 
    		}else {
    			return;
    		}
    		
    	}else if(i.getSize() == 54) {
    		 i.setItem(2, item);
	       	 i.setItem(3, item);
	       	 i.setItem(4, item);
	       	 i.setItem(5, item);
	       	 i.setItem(6, item);
	       	 i.setItem(7, item);
	       	 i.setItem(8, item);
	       	 i.setItem(9, item);
	       	 i.setItem(10, item);
	       	 i.setItem(18, item);
	       	 i.setItem(19, item);
	       	 i.setItem(27, item);
	       	 i.setItem(28, item);
	       	 i.setItem(36, item);
	       	 i.setItem(37, item);
	       	 i.setItem(45, item);
	       	 i.setItem(46, item);
	       	 i.setItem(47, item);
	       	 i.setItem(48, item);
	       	 i.setItem(49, item);
	       	 i.setItem(50, item);
	       	 i.setItem(51, item);
	       	 i.setItem(52, item);
	       	 i.setItem(53, item);
	       	 i.setItem(54, item);
    	}
    }
	public List<ItemStack> getOutsideBorderInventory() {
		List<ItemStack> list = new ArrayList<>();
		if(i.getSize() == 9) {
			if(i.getType().equals(InventoryType.CRAFTING)|| i.getType().equals(InventoryType.DISPENSER) || i.getType().equals(InventoryType.DROPPER)) {
			list.add(i.getItem(1));
			list.add(i.getItem(2));
			list.add(i.getItem(3));
			list.add(i.getItem(4));
			list.add(i.getItem(6));
			list.add(i.getItem(7));
			list.add(i.getItem(8));
			list.add(i.getItem(9));
			}else {
				
			}
		}else if(i.getSize() == 27) {
		     if(i.getType().equals(InventoryType.CHEST)) {
		    	 list.add(i.getItem(1));
					list.add(i.getItem(2));
					list.add(i.getItem(3));
					list.add(i.getItem(4));
					list.add(i.getItem(5));
					list.add(i.getItem(6));
					list.add(i.getItem(7));
					list.add(i.getItem(8));
					list.add(i.getItem(9));
					list.add(i.getItem(10));
					list.add(i.getItem(18));
					list.add(i.getItem(19));
					list.add(i.getItem(20));
					list.add(i.getItem(21));
					list.add(i.getItem(22));
					list.add(i.getItem(23));
					list.add(i.getItem(24));
					list.add(i.getItem(25));
					list.add(i.getItem(26));
					list.add(i.getItem(27));
		     }else {
		    	 
		     }
		}else if(i.getSize() == 36) {
			list.add(i.getItem(1));
			list.add(i.getItem(2));
			list.add(i.getItem(3));
			list.add(i.getItem(4));
			list.add(i.getItem(5));
			list.add(i.getItem(6));
			list.add(i.getItem(7));
			list.add(i.getItem(8));
			list.add(i.getItem(9));
			list.add(i.getItem(10));
			list.add(i.getItem(18));
			list.add(i.getItem(19));
			list.add(i.getItem(27));
			list.add(i.getItem(28));
			list.add(i.getItem(29));
			list.add(i.getItem(30));
			list.add(i.getItem(31));
			list.add(i.getItem(32));
			list.add(i.getItem(33));
			list.add(i.getItem(34));
			list.add(i.getItem(35));
			list.add(i.getItem(36));
		}
		return list;
	}
	public void setNormalBorder(ItemStack bordermaterial,List<Integer> skippedslots) {
	for(int in : skippedslots) {
		if(skippedslots.contains(in)) {
			continue;
		}
		i.setItem(i.getSize(), bordermaterial);
	}
	}
	
}
	


