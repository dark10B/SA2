package ceilingfan;

public interface Command {
	public void execute();
	public void undo();
}

package ceilingfan;

public class NoCommand implements Command
{
	public void execute()
	{}
	public void undo()
	{}
}

package ceilingfan;

public class CeilingFan {
    public static final int OFF = 0;
    public static final int LOW = 1;
    public static final int MEDIUM = 2;
    public static final int HIGH = 3;
    String location;
    int speed;
    public CeilingFan(String location) {
        this.location = location;
        speed = OFF;
    }
    public void off() {
        speed = OFF;
        System.out.println(location + "Fan is off.");
    }
    public void low() {
        speed = LOW;
        System.out.println(location + "Fan is low.");
    }
    public void medium() {
        speed = MEDIUM;
        System.out.println(location + "Fan is medium.");
    }
    public void high() {
        speed = HIGH;
        System.out.println(location + "Fan is high.");
    }
    public int getSpeed() {
        return speed;
    }
}

package ceilingfan;

public class CeilingFanHigh implements Command {
    CeilingFan ceilingFan;
    int prevSpeed;
    public CeilingFanHigh(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }
    public void execute() {
        prevSpeed = ceilingFan.getSpeed();
        ceilingFan.medium();
    }
    public void undo() {
        if (prevSpeed == CeilingFan.OFF)
            ceilingFan.off();
        else if (prevSpeed == CeilingFan.LOW)
            ceilingFan.low();
        else if (prevSpeed == CeilingFan.MEDIUM)
            ceilingFan.medium();
        else if (prevSpeed == CeilingFan.HIGH)
            ceilingFan.high();
    }
}

package ceilingfan;

public class CeilingFanMedium implements Command {
    CeilingFan ceilingFan;
    int prevSpeed;
    public CeilingFanMedium(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }
    public void execute() {
        prevSpeed = ceilingFan.getSpeed();
        ceilingFan.medium();
    }
    public void undo() {
        if (prevSpeed == CeilingFan.OFF)
            ceilingFan.off();
        else if (prevSpeed == CeilingFan.LOW)
            ceilingFan.low();
        else if (prevSpeed == CeilingFan.MEDIUM)
            ceilingFan.medium();
        else if (prevSpeed == CeilingFan.HIGH)
            ceilingFan.high();
    }
}

package ceilingfan;

public class CeilingFanLow implements Command {
    CeilingFan ceilingFan;
    int prevSpeed;
    public CeilingFanLow(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }
    public void execute() {
        prevSpeed = ceilingFan.getSpeed();
        ceilingFan.low();
    }
    public void undo() {
        if (prevSpeed == CeilingFan.OFF)
            ceilingFan.off();
        else if (prevSpeed == CeilingFan.LOW) ceilingFan.low();
        else if (prevSpeed == CeilingFan.MEDIUM)
            ceilingFan.medium();
        else if (prevSpeed == CeilingFan.HIGH)
            ceilingFan.high();
    }
}

package ceilingfan;

public class CeilingFanOff implements Command {
    CeilingFan ceilingFan;
    int prevSpeed;
    public CeilingFanOff(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }
    public void execute() {
        prevSpeed = ceilingFan.getSpeed();
        ceilingFan.off();
    }
    public void undo() {
        if (prevSpeed == CeilingFan.OFF)
            ceilingFan.off();
        else if (prevSpeed == CeilingFan.LOW)
            ceilingFan.low();
        else if (prevSpeed == CeilingFan.MEDIUM)
            ceilingFan.medium();
        else if (prevSpeed == CeilingFan.HIGH)
            ceilingFan.high();
    }
}

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

package ceilingfan;

public class RemoteLoader {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();
        CeilingFan ceilingFan = new CeilingFan("Living Room.");
        CeilingFanOff ceilignFanOff = new CeilingFanOff(ceilingFan);
        CeilingFanLow ceilignFanLow = new CeilingFanLow(ceilingFan);
        CeilingFanMedium ceilingFanMedium = new CeilingFanMedium(ceilingFan);
        CeilingFanHigh ceilingFanHigh = new CeilingFanHigh(ceilingFan);
        remoteControl.setCommand(0, ceilignFanLow, ceilignFanOff);
        remoteControl.setCommand(1, ceilingFanMedium, ceilignFanOff);
        remoteControl.setCommand(2, ceilingFanHigh, ceilignFanOff);
        remoteControl.onButtonPushed(0);
        remoteControl.offButtonPushed(0);
        System.out.println(remoteControl);
        remoteControl.undoButtonPushed();
        remoteControl.onButtonPushed(1);
        remoteControl.offButtonPushed(1);
        System.out.println(remoteControl);
        remoteControl.undoButtonPushed();
        remoteControl.onButtonPushed(2);
        remoteControl.offButtonPushed(2);
        System.out.println(remoteControl);
        remoteControl.undoButtonPushed();
    }
}
