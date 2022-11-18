package remotecontrol;

public class AcOffCommand implements Command{
	Ac ac;
	public AcOffCommand (Ac ac)
	{
		this.ac=ac;
	}
	public void execute()
	{
		ac.powerOff();
	}
}