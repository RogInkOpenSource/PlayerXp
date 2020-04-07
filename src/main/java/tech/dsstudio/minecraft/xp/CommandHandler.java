package tech.dsstudio.minecraft.xp;

import org.bukkit.command.CommandSender;
import org.jetbrains.annotations.NotNull;

public class CommandHandler {
	public CommandHandler(@NotNull PlayerXpApi api) {
		this.api = api;
	}

	public boolean handleGet(@NotNull CommandSender who, @NotNull String[] args) {
		// TODO
		who.sendMessage("Not implemented");
		return false;
	}

	public boolean handleSet(@NotNull CommandSender who, @NotNull String[] args) {
		// TODO
		who.sendMessage("Not implemented");
		return false;
	}

	private PlayerXpApi api;
}
