package xyz.szambo;

import lombok.Getter;
import lombok.NonNull;
import org.bukkit.plugin.Plugin;

public class KcodeChecker {

    @Getter public static KcodeChecker instance;
    @Getter public static Plugin plugin;

    public KcodeChecker(@NonNull Plugin plugin) {
        instance = this;
        KcodeChecker.plugin = plugin;
    }
    public static KcodeChecker create(@NonNull Plugin plugin) {
        return new KcodeChecker(plugin);
    }

}
