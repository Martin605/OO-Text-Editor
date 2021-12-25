package editor.record.command;

import java.util.*;


public class Invoker {
    
    private List <Command> commandList = new ArrayList<>();

    public void setCommand(Command command) {
        commandList.add(command);
    }

    public void removeCommand(Command command) {
        commandList.remove(command);
    }

    public void run() {
        for(Command command : commandList) {
            command.action();
        }
        commandList = new ArrayList<>();
    }

}
