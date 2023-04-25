package xyz.szambo;

import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginDescriptionFile;

import javax.annotation.Nonnull;

public interface Checker{

    default void checkDescription(@Nonnull String name, @Nonnull String author, @Nonnull String version)
    {
        final PluginDescriptionFile pluginDescriptionFile = KcodeChecker.getPlugin().getDescription();
        if (!pluginDescriptionFile.getName().contains(name)) {
            TextUtil.Log("&4&m------------------------------");
            TextUtil.Log(" &c> &c" + name + " " + version);
            TextUtil.Log(" ");
            TextUtil.Log(" &c> &cWykryto zmiane &4nazwy &cpluginu!");
            TextUtil.Log(" &c> &cCofnij zmiany w plugin.yml");
            TextUtil.Log("&4&m------------------------------");
            KcodeChecker.getPlugin().getServer().getPluginManager().disablePlugin((Plugin)this);
        }
        if (!pluginDescriptionFile.getAuthors().contains(author)) {
            TextUtil.Log("&4&m------------------------------");
            TextUtil.Log(" 7c> &c" + name + " " + version);
            TextUtil.Log(" ");
            TextUtil.Log(" &c> &cWykryto zmiane &4autora &cpluginu!");
            TextUtil.Log(" &c> &cCofnij zmiany w plugin.yml");
            TextUtil.Log("&4&m------------------------------");
            KcodeChecker.getPlugin().getServer().getPluginManager().disablePlugin(((Plugin)this));
        }
        if (!pluginDescriptionFile.getVersion().contains(version)) {
            TextUtil.Log("&4&m------------------------------");
            TextUtil.Log(" &c> &c" + name + " " + version);
            TextUtil.Log(" ");
            TextUtil.Log(" &c> &cWykryto zmiane &4wersji &cpluginu!");
            TextUtil.Log(" &c> &cCofnij zmiany w plugin.yml");
            TextUtil.Log("&4&m------------------------------");
            KcodeChecker.getPlugin().getServer().getPluginManager().disablePlugin((Plugin)this);
        }

        TextUtil.Log("&2&m------------------------------");
        TextUtil.Log(" &2> &a" + name  + " " + version);
        TextUtil.Log(" ");
        TextUtil.Log(" &2> &aTwoj &2server &aposiada aktualna licencje pluginu!");
        TextUtil.Log(" &2> &aPlugin stworzony przez &2" + author + " &adla &2KCode");
        TextUtil.Log(" &2> &aNasz server discord: &2https://discord.gg/Dd5duqNyyn");
        TextUtil.Log("&2&m------------------------------");
        return;
    }

}
