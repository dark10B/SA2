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