package xyz.szambo;

import lombok.Getter;
import lombok.NonNull;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginDescriptionFile;

import javax.annotation.Nonnull;

public class KcodeChecker implements Logger{

    @Getter private final KcodeChecker instance;
    @Getter private final Plugin plugin;

    public KcodeChecker(@NonNull Plugin plugin) {
        instance = this;
        this.plugin = plugin;
    }
    public void checkDescription(@Nonnull String name, @Nonnull String author, @Nonnull String version)
    {
        final PluginDescriptionFile pluginDescriptionFile = plugin.getDescription();
        if (!pluginDescriptionFile.getName().contains(name)) {
            Log("&4&m------------------------------");
            Log(" &c> &c" + name + " " + version);
            Log(" ");
            Log(" &c> &cWykryto zmiane &4nazwy &cpluginu!");
            Log(" &c> &cCofnij zmiany w plugin.yml");
            Log("&4&m------------------------------");
            plugin.getServer().getPluginManager().disablePlugin((Plugin)this);
            return;
        }
        if (!pluginDescriptionFile.getAuthors().contains(author)) {
            Log("&4&m------------------------------");
            Log(" 7c> &c" + name + " " + version);
            Log(" ");
            Log(" &c> &cWykryto zmiane &4autora &cpluginu!");
            Log(" &c> &cCofnij zmiany w plugin.yml");
            Log("&4&m------------------------------");
            plugin.getServer().getPluginManager().disablePlugin(((Plugin)this));
            return;
        }
        if (!pluginDescriptionFile.getVersion().contains(version)) {
            Log("&4&m------------------------------");
            Log(" &c> &c" + name + " " + version);
            Log(" ");
            Log(" &c> &cWykryto zmiane &4wersji &cpluginu!");
            Log(" &c> &cCofnij zmiany w plugin.yml");
            Log("&4&m------------------------------");
            plugin.getServer().getPluginManager().disablePlugin((Plugin)this);
            return;
        }

        Log("&2&m------------------------------");
        Log(" &2> &a" + name  + " " + version);
        Log(" ");
        Log(" &2> &aTwoj &2server &aposiada aktualna licencje pluginu!");
        Log(" &2> &aPlugin stworzony przez &2" + author + " &adla &2KCode");
        Log(" &2> &aNasz server discord: &2https://discord.gg/Dd5duqNyyn");
        Log("&2&m------------------------------");
    }

    public static KcodeChecker create(@NonNull Plugin plugin) {
        return new KcodeChecker(plugin);
    }

}
