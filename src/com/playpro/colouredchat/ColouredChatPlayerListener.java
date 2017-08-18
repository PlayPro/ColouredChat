package com.playpro.colouredchat;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class ColouredChatPlayerListener implements Listener {

    @EventHandler(priority = EventPriority.LOWEST)
    public void onPlayerChat(AsyncPlayerChatEvent event) {
        Player player = event.getPlayer();
        if (player.hasPermission("colouredchat.allow")) {
            String chatmessage = event.getMessage();
            chatmessage = chatmessage.replaceAll("#red", "#c");
            chatmessage = chatmessage.replaceAll("#pink", "#d");
            chatmessage = chatmessage.replaceAll("#yellow", "#e");
            chatmessage = chatmessage.replaceAll("#orange", "#6");
            chatmessage = chatmessage.replaceAll("#purple", "#5");
            chatmessage = chatmessage.replaceAll("#white", "#f");
            chatmessage = chatmessage.replaceAll("#cyan", "#b");
            chatmessage = chatmessage.replaceAll("#green", "#a");
            chatmessage = chatmessage.replaceAll("#blue", "#9");
            chatmessage = chatmessage.replaceAll("#gray", "#7");
            chatmessage = chatmessage.replaceAll("#grey", "#7");
            chatmessage = chatmessage.replaceAll("#0", "#f");
            chatmessage = chatmessage.replaceAll("#8", "#f");
            chatmessage = chatmessage.replaceAll("#1", "#f");
            String clist = "2,3,4,5,6,7,9,a,b,c,d,e,f";
            String[] split = clist.split(",");
            for (String c : split) {
                chatmessage = chatmessage.replaceAll("#" + c + " ", "§" + c + "");
                chatmessage = chatmessage.replaceAll("#" + c + "", "§" + c + "");
            }
            event.setMessage(chatmessage);
        }
    }

}
