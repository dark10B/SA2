package remotecontrol;

public class Light 
{
	String a;
	public Light(String string)
	{
		this.a=string;
	}
	
	public void on()
	{
		System.out.print(a+" " + "Light is On.");
	}
	
	public void off()
	{
		System.out.print(a+" " + "Light is Off.");
	}
}