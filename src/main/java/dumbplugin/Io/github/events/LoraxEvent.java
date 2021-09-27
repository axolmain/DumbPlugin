package dumbplugin.Io.github.events;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;

import java.util.concurrent.TimeUnit;


public class LoraxEvent implements Listener {

    @EventHandler
    public void onTreeBreak(BlockBreakEvent event) {

        Block tree = event.getBlock();
        Location loc = tree.getLocation();
        if (tree.getType().equals(Material.OAK_LOG)) {
            if(tree.getRelative(BlockFace.UP).getType().equals(Material.OAK_LEAVES)) {
                if(Math.random() <= 0.1 ) {
                    tree.getWorld().strikeLightning(loc);
                    tree.getWorld().createExplosion(loc, 1, false,false);
                    tree.getWorld().spawnEntity(loc, EntityType.GIANT).setCustomName(ChatColor.GOLD + "LORAX");
                }
            }
        }
    }
}