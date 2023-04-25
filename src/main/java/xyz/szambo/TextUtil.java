package xyz.szambo;

import net.md_5.bungee.api.ChatColor;
import org.bukkit.Bukkit;

public class TextUtil {

    public static String fixColor(String message){
        return ChatColor.translateAlternateColorCodes('&', message)
                .replace(">>", "»")
                .replace("<<", "«")
                .replace("->", "→")
                .replace("<-", "←")
                .replace("**", "•");
    }
    public static void Log(String message) {
        Bukkit.getServer().getLogger().severe(fixColor(message));
    }

}
