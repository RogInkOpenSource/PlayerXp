package tech.dsstudio.minecraft.xp;

import com.comphenix.protocol.ProtocolLibrary;
import com.comphenix.protocol.ProtocolManager;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public class PlayerXpApi extends JavaPlugin {
	@Override
	public void onEnable() {
		pm = ProtocolLibrary.getProtocolManager();
		instance = this;
	}

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		return false;
	}

	private ProtocolManager pm;
	private static PlayerXpApi instance;
}
