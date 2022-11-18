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