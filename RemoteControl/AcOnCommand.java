package remotecontrol;


public class AcOnCommand implements Command{
	Ac ac;
	public AcOnCommand (Ac ac)
	{
		this.ac=ac;
	}
	public void execute()
	{
		ac.powerOn();
	}
}