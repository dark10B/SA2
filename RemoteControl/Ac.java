package remotecontrol;


public class Ac {
	String a;
	public Ac(String string)
	{
		this.a= string;
	}
	
	public void powerOn()
	{
		System.out.println(a+" "+ "AC is ON.");
	}
	
	public void powerOff()
	{
		System.out.println(a+" "+ "AC is OFF.");
	}

}
