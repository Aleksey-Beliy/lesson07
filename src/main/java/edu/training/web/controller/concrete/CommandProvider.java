package edu.training.web.controller.concrete;

import java.util.HashMap;
import java.util.Map;

import edu.training.web.controller.concrete.impl.DoAuth;
import edu.training.web.controller.concrete.impl.DoRegistration;
import edu.training.web.controller.concrete.impl.GoToAuthPage;
import edu.training.web.controller.concrete.impl.GoToIndexPage;
import edu.training.web.controller.concrete.impl.GoToMainPage;
import edu.training.web.controller.concrete.impl.GoToRegistrationPage;

public class CommandProvider {

	private Map<CommandName, Command> commands = new HashMap<>();

	public CommandProvider() {
		commands.put(CommandName.DO_AUTH, new DoAuth());
		commands.put(CommandName.DO_REGISTRATION, new DoRegistration());
		commands.put(CommandName.GO_TO_MAIN_PAGE, new GoToMainPage());
		commands.put(CommandName.GO_TO_INDEX_PAGE, new GoToIndexPage());
		commands.put(CommandName.NO_SUCH_COMMAND, new NoSuchCommand());
		commands.put(CommandName.GO_TO_AUTH_PAGE, new GoToAuthPage());
		commands.put(CommandName.GO_TO_REGISTRATION_PAGE, new GoToRegistrationPage());
	}

	public Command takeCommand(String userCommand) {
		CommandName commandName;
		Command command;

		try {
			commandName = CommandName.valueOf(userCommand.toUpperCase());
			command = commands.get(commandName);
		} catch (IllegalArgumentException | NullPointerException e) {
			command = commands.get(CommandName.NO_SUCH_COMMAND);
		}

		return command;
	}
}
