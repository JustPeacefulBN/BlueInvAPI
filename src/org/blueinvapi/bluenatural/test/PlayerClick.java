package org.blueinvapi.bluenatural.test;

import org.blueinvapi.bluenatural.ClickSlotAction;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;

public class PlayerClick implements ClickSlotAction{

	@SuppressWarnings("static-access")
	@Override
	public void active(Player p,InventoryClickEvent e) {
	if(GUICreator.isg.getItemPutter().get(e.getSlot()).equals(e.getCurrentItem())) {
		if(GUICreator.isg.getActionPutter().get(GUICreator.isg.getItemPutter().get(e.getSlot())).isLeftClick()) {
		p.sendMessage(ChatColor.YELLOW + "Thanks");
	}else {
		return;
	}
	}else {
		return;
	}
	}

	

}
