package xyz.szambo;

import net.md_5.bungee.api.ChatColor;

public class TextUtil {

    public static String fixColor(String message){
        return ChatColor.translateAlternateColorCodes('&', message)
                .replace(">>", "»")
                .replace("<<", "«")
                .replace("->", "→")
                .replace("<-", "←")
                .replace("**", "•");
    }

}
