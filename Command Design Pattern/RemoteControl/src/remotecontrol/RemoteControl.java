package remotecontrol;


import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Nils
 */
public class RemoteControl {

    Command[] onCommands;
    Command[] offCommands;

    public RemoteControl() {
        onCommands = new Command[7];
        offCommands = new Command[7];

        //array initializeren.
        Command noCommand = new NoCommand();
        for (int i = 0; i < 7; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        this.onCommands[slot] = onCommand;
        this.offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot) {
        onCommands[slot].execute();
    }

    public void offButtonWasPushed(int slot) {
        offCommands[slot].execute();
    }

    
    //Test this (used lambdas instead of for loop
    @Override
    public String toString() {
        StringBuilder stringBuild = new StringBuilder();
        stringBuild.append("\n------ Remote Control ------\n");
        Arrays.stream(onCommands).forEach(command -> stringBuild.append("[slot ")
                .append(Arrays.asList(onCommands).indexOf(command))
                .append("]").append(command.getClass().getName()).append("    ")
                .append(offCommands[Arrays.asList(onCommands).indexOf(command)].getClass().getName()).append("\n"));
        return stringBuild.toString();
    }

}
