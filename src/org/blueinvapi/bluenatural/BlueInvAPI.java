package org.blueinvapi.bluenatural;


import org.blueinvapi.bluenatural.test.GUICreator;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class BlueInvAPI extends JavaPlugin {
	
  public static BlueInvAPI p;
  public void onEnable() {	  
	  p = this;
	  PluginManager pm = p.getServer().getPluginManager();
	  pm.registerEvents(new InventoryListener(), p);
	  pm.registerEvents(new GUICreator(), p);
  }


	

}