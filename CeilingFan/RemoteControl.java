package ceilingfan;

public class RemoteControl {
    Command[] onCommands;
    Command[] offCommands;
    Command undoCommands;
    public RemoteControl() {
        onCommands = new Command[5];
        offCommands = new Command[5];
        Command noCommand = new NoCommand();
        //NoCommand object is for null object
        for (int i = 0; i < 5; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
        undoCommands = noCommand;
    }
    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }
    public void onButtonPushed(int slot) {
        onCommands[slot].execute();
        undoCommands = onCommands[slot];
    }
    public void offButtonPushed(int slot) {
        offCommands[slot].execute();
        undoCommands = offCommands[slot];
    }
    public void undoButtonPushed() {
        undoCommands.undo();
    }
    public String toString() {
        StringBuffer strBuff = new StringBuffer();
        strBuff.append("\n-----------Remote Control---------\n");
        for (int i = 0; i < onCommands.length; i++) {
            strBuff.append("[slot" + i + ")" + onCommands[i].getClass().getName() + " " + offCommands[i].getClass().getName() + "\n");
            return strBuff.toString();
        }
        return null;
    }
}