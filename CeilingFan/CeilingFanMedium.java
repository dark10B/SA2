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