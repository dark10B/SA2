package Connection;
public interface Connection {
	public void open();
	public void close();
	public void log();
	public void update();
}


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

package Connection;
public class Controller {
	public static Accounting acc;
	public static Sales sales;
	public static Management mng;

	public static Connection con;
	
	Controller()
	{
		acc=new Accounting();
		sales=new Sales();
		mng=new Management();
	}
	
	public void setAccountingConnection()
	{
		con=acc;
	}
	
	public void setSalesConnection()
	{
		con=sales;
	}
	
	public void setManagementConnection()
	{
		con=mng;
	}
	
	public void open()
	{
		con.open();
	}
	public void close()
	{
		con.close();
	}
	
	public void log()
	{
		con.log();
	}
	public void update()
	{
		con.update();
	}
}


package Connection;
public class StateDemo {
    //private static final String management=null;

    Controller controller;
    StateDemo(String con) {
        controller = new Controller();
        if (con.equalsIgnoreCase("Accounting"))
            controller.setAccountingConnection();
        if (con.equalsIgnoreCase("Management"))
            controller.setManagementConnection();
        if (con.equalsIgnoreCase("Sales"))
            controller.setSalesConnection();

        controller.open();
        controller.close();
        controller.log();
        controller.update();
    }
    public static void main(String[] args) {
        String c = "sales";
        new StateDemo(c);
    }
}
