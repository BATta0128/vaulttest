package red.man10.batta.vaulttest;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public final class Vaulttest extends JavaPlugin {
    VaultManager vault = null;
    @Override

    public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
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
