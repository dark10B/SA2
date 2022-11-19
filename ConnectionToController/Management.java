package Connection;

public class Management implements Connection {

    @Override
    public void open() {
        System.out.println("Open Databse for management");
    }

    @Override
    public void close() {
        System.out.println("Close Databse for management");
    }

    @Override
    public void log() {
        System.out.println(" log activities");
    }
    @Override
    public void update() {
        System.out.println("Management has been updated");
    }
}