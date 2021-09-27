package dumbplugin.Io.github.events;

import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

import static org.bukkit.Bukkit.getServer;

public class ListenerEvents implements Listener {

    @EventHandler
    public void onPlayerChat(AsyncPlayerChatEvent event) {

         if(event.getMessage().contains("dumb")) {
             event.setMessage(event.getMessage().replaceAll("dumb", ChatColor.LIGHT_PURPLE + "horny"));
             getServer().getConsoleSender().sendMessage("it works");
         }
    }

}
