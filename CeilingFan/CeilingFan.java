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