package org.blueinvapi.bluenatural;


import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class BlueInvAPI extends JavaPlugin {
	
  public static Plugin p;
  public void onEnable() {
	  PluginManager pm = p.getServer().getPluginManager();
	  pm.registerEvents(new InventoryListener(), p);
  }


	

}