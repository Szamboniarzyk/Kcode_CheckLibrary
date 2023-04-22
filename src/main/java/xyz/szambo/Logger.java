package xyz.szambo;

import org.bukkit.Bukkit;

public interface Logger {

    default void Log(String message) {
        Bukkit.getServer().getLogger().severe(TextUtil.fixColor(message));
    }

}
