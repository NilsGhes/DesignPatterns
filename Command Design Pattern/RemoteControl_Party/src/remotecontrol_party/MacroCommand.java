package remotecontrol_party;

import java.util.Arrays;
import java.util.Collections;

public class MacroCommand implements Command {

    Command[] commands;

    public MacroCommand(Command[] commands) {
        this.commands = commands;
    }

    @Override
    public void execute() {
        Arrays.stream(commands).forEach(command -> command.execute());

    }

    /**
     * NOTE: these commands have to be done backwards to ensure proper undo
     * functionality
     */
    @Override
    public void undo() {
        Command[] reverse = Arrays.copyOf(commands, commands.length);
        Collections.reverse(Arrays.asList(reverse));
        Arrays.stream(reverse).forEach(command -> command.undo());
    }
}
