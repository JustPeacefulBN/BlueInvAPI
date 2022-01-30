package org.blueinvapi.bluenatural.test;

import org.blueinvapi.bluenatural.GuiUtils;
import org.blueinvapi.bluenatural.InventoryGui;
import org.blueinvapi.bluenatural.ItemSlotGui;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.ClickType;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;

import net.md_5.bungee.api.ChatColor;

public class GUICreator implements Listener{
	public static InventoryGui invg;
	public static ItemSlotGui isg;
	public static ClickType ct;
	public static void openGUI(Player p) {
		invg = new InventoryGui("Test Gui !!!");
		isg = new ItemSlotGui();
		ItemStack is = new ItemStack(Material.COMMAND);
		is.getItemMeta().setDisplayName(ChatColor.BLUE + "Say Hi !");
		isg.putSlot(is, 5);
		isg.setItem(invg.getInv());
		isg.putAction(ct.LEFT);
		invg.createGui("TEST",isg, 9, InventoryType.CHEST, null);
		GuiUtils.openGui(p, invg.getName());
	}
	@EventHandler
	public void onJoin(PlayerJoinEvent e) {
		openGUI(e.getPlayer());
	}

}
