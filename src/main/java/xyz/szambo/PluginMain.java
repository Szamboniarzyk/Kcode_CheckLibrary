package xyz.szambo;

import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

import javax.annotation.Nonnull;

public class PluginMain {

    private static JavaPlugin plugin;

    public static JavaPlugin getPlugin() {
        return plugin;
    }
    public void checkDescription(@Nonnull String name, @Nonnull String author, @Nonnull String version)
    {
        final PluginDescriptionFile pluginDescriptionFile = plugin.getDescription();
        if (!pluginDescriptionFile.getName().contains(name)) {
            plugin.getServer().getConsoleSender().sendMessage("§4§m------------------------------");
            plugin.getServer().getConsoleSender().sendMessage(" §c> §c" + name + " " + version);
            plugin.getServer().getConsoleSender().sendMessage(" ");
            plugin.getServer().getConsoleSender().sendMessage(" §c> §cWykryto zmiane §4nazwy §cpluginu!");
            plugin.getServer().getConsoleSender().sendMessage(" §c> §cCofnij zmiany w plugin.yml");
            plugin.getServer().getConsoleSender().sendMessage("§4§m------------------------------");
            plugin.getServer().getPluginManager().disablePlugin((Plugin)this);
            return;
        }
        if (!pluginDescriptionFile.getAuthors().contains(author)) {
            plugin.getServer().getConsoleSender().sendMessage("§4§m------------------------------");
            plugin.getServer().getConsoleSender().sendMessage(" §c> §c" + name + " " + version);
            plugin.getServer().getConsoleSender().sendMessage(" ");
            plugin.getServer().getConsoleSender().sendMessage(" §c> §cWykryto zmiane §4autora §cpluginu!");
            plugin.getServer().getConsoleSender().sendMessage(" §c> §cCofnij zmiany w plugin.yml");
            plugin.getServer().getConsoleSender().sendMessage("§4§m------------------------------");
            plugin.getServer().getPluginManager().disablePlugin(((Plugin)this));
            return;
        }
        if (!pluginDescriptionFile.getVersion().contains(version)) {
            plugin.getServer().getConsoleSender().sendMessage("§4§m------------------------------");
            plugin.getServer().getConsoleSender().sendMessage(" §c> §c" + name + " " + version);
            plugin.getServer().getConsoleSender().sendMessage(" ");
            plugin.getServer().getConsoleSender().sendMessage(" §c> §cWykryto zmiane §4wersji §cpluginu!");
            plugin.getServer().getConsoleSender().sendMessage(" §c> §cCofnij zmiany w plugin.yml");
            plugin.getServer().getConsoleSender().sendMessage("§4§m------------------------------");
            plugin.getServer().getPluginManager().disablePlugin((Plugin)this);
            return;
        }

        plugin.getServer().getConsoleSender().sendMessage("§2§m------------------------------");
        plugin.getServer().getConsoleSender().sendMessage(" §2> §a" + name  + " " + version);
        plugin.getServer().getConsoleSender().sendMessage(" ");
        plugin.getServer().getConsoleSender().sendMessage(" §2> §aTwoj §2server §aposiada aktualna licencje pluginu!");
        plugin.getServer().getConsoleSender().sendMessage(" §2> §aPlugin stworzony przez §2" + author + " §adla §2KCode");
        plugin.getServer().getConsoleSender().sendMessage(" §2> §aNasz server discord: §2https://discord.gg/Dd5duqNyyn");
        plugin.getServer().getConsoleSender().sendMessage("§2§m------------------------------");
    }




}
