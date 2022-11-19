package Connection;

public class Sales implements Connection {

    @Override
    public void open() {
        System.out.println("Open Databse for sales");
    }

    @Override
    public void close() {
        System.out.println("Close Databse for sales");
    }

    @Override
    public void log() {
        System.out.println("log activities");
    }
    @Override
    public void update() {
        System.out.println("Sales has been updated");
    }
}