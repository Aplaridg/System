package de.simon.main;

import de.simon.commands.Heal;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    public static String Prefix = "§7[§9System§7]§r";

    public void onEnable() {
        System.out.println("§4System wurde aktiviert!");
        getCommand("heal").setExecutor(new Heal());

    }


}
