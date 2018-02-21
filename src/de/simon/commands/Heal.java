package de.simon.commands;

import de.simon.main.Main;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Heal implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if(sender instanceof Player) {
            Player p = (Player) sender;
            if(args.length == 0) {
                p.setFoodLevel(20);
                p.setHealth(20);
                p.sendMessage(Main.Prefix + "§9 Du wurdest geheilt!");
            } else if(args.length == 1)  {
                Player target = Bukkit.getPlayer(args[0]);
                if(target != null) {
                    target.setHealth(20);
                    target.setFoodLevel(20);
                    target.sendMessage(Main.Prefix + "§9 Du wurdest geheilt!");
                    p.sendMessage(Main.Prefix + "§9 Du hast den angegeben Spieler geheilt!");
                } else {
                    p.sendMessage(Main.Prefix + "§9 Der angegebene Spieler ist nicht online!");
                }
            } else {
                p.sendMessage(Main.Prefix + "§9 Bitte benutze /heal <SPIELER>");
            }

        }





        return false;
    }
}
