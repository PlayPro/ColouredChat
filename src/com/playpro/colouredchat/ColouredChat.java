package com.playpro.colouredchat;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class ColouredChat extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new ColouredChatPlayerListener(), this);
        System.out.println(this.getDescription().getName() + " version " + this.getDescription().getVersion() + " is enabled!");
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String commandLabel, String[] args) {
        String commandName = command.getName().toLowerCase();
        Player player = (Player) sender;
        if (player.hasPermission("colouredchat.allow")) {
            if (commandName.equals("colours") || commandName.equals("colors")) {
                player.sendMessage("§d<Colour Codes, Chat / Signs>");
                player.sendMessage("§2#2, §3#3, §4#4, §5#5 or #purple, §6#6 or #orange");
                player.sendMessage("§7#7 or #gray, §9#9 or #blue, §a#a or #green");
                player.sendMessage("§b#b or #cyan, §c#c or #red, §d#d or #pink, §e#e or #yellow");
            }
        }

        return false;
    }

}
