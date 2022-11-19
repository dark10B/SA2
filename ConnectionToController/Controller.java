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
