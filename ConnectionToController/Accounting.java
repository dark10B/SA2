package Connection;

public class Accounting implements Connection {

    @Override
    public void open() {
        System.out.println("Open Databse for accounting");
    }

    @Override
    public void close() {
        System.out.println("Close Databse for accounting");
    }

    @Override
    public void log() {
        System.out.println(" log activities");
    }
    @Override
    public void update() {
        System.out.println("Accountiing has been updated");
    }
}
