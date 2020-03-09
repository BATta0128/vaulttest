package red.man10.batta.vaulttest;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.UUID;


public final class Vaulttest extends JavaPlugin {
    VaultManager vault = new VaultManager(this);
    @Override

    public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {

        Player p = (Player)sender;
        int money = 100;
        if (cmd.getName().equalsIgnoreCase("vaulttest")) {
            sender.sendMessage("コマンド実行!");
            getLogger().info("コマンド実行!(コンソール)");
            return true;
        }
        if (cmd.getName().equalsIgnoreCase("vaulttest2")) {
            sender.sendMessage("コマンド実行2!");
            getLogger().info("コマンド実行2!(コンソール)");
            return true;
        }
        if (cmd.getName().equalsIgnoreCase("showmoney")) {
            sender.sendMessage("お金見たいコマンド実行!");
            getLogger().info("お金見たいコマンド実行!(コンソール)");
            vault.showBalance(p.getUniqueId());

            return true;
        }
        if (cmd.getName().equalsIgnoreCase("givemoney")) {
            sender.sendMessage("お金欲しいコマンド実行!");
            getLogger().info("お金欲しいコマンド実行!(コンソール)");
            vault.deposit(p.getUniqueId(), money);
            p.getPlayer().sendMessage(ChatColor.YELLOW + "$"+ money+"受取りました");

            return true;
        }

        return false;

    }
    public void onEnable() {

        getLogger().info("Vaulttest起動!");
        vault = new VaultManager(this);
    }


    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
