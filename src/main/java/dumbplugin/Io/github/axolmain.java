package dumbplugin.Io.github;

import dumbplugin.Io.github.events.ListenerEvents;
import dumbplugin.Io.github.events.LoraxEvent;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public final class axolmain extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "idk why you want it but DumbPlugin is in fact running");
        getServer().getPluginManager().registerEvents(new ListenerEvents(), this); //this registers the ListenerEvents class we made earlier
        getServer().getPluginManager().registerEvents(new LoraxEvent(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getServer().getConsoleSender().sendMessage(ChatColor.RED + "DumbPlugin is disabled. Good move.");
    }
}
