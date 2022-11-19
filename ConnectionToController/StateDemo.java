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