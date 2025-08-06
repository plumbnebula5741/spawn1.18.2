package fax.spawn;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.plugin.java.JavaPlugin;

public final class Spawn extends JavaPlugin {
 public  boolean command(Player player, CommandSender sender, Command command, String label, String[] args) {
     if (command.getName().equalsIgnoreCase("spawn")) {
         Location location = new Location(Bukkit.getWorld("world"), 0, 100, 0);
         player.teleport(location);
     }
     return false;
 }
    @Override
    public void onEnable() {
        System.out.println("spawm plugin started");

    }

    @Override
    public void onDisable() {
        System.out.println("spawn plugin disabled");
    }
}
