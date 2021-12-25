package editor.record.command;

import java.util.*;


public class Invoker {
    //宣告commandList用來儲存使用者要求的動作
    private List <Command> commandList = new ArrayList<>();
    //將使用者要求的動作用add()新增到commandList
    public void setCommand(Command command) {
        commandList.add(command);
    }
    //將使用者要求的動作用remove()從commandList中移除
    public void removeCommand(Command command) {
        commandList.remove(command);
    }
    //將使用者要求的動作用for迴圈執行出來,並初始化commandList
    public void run() {
        for(Command command : commandList) {
            command.action();
        }
        commandList = new ArrayList<>();
    }

}
