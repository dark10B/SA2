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