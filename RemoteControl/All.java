package remotecontrol;

public interface Command {
	public void execute();

}

package remotecontrol;

public class NoCommand implements Command {

	public void execute()
	{ }
}

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


package remotecontrol;


public class LightOnCommand implements Command
{
	Light light;

	public LightOnCommand(Light light) {
		this.light = light;
	}
	
	public void execute()
	{
		light.on();
	}
}


package remotecontrol;


public class LightOffCommand implements Command
{
	Light light;

	public LightOffCommand(Light light) {
		this.light = light;
	}
	
	public void execute()
	{
		light.off();
	}
}

package remotecontrol;

public class RemoteControl {
	Command[] onCommands;
	Command[] offCommands;
	public RemoteControl() 
	{
		
		onCommands = new Command[3];
		offCommands = new Command[3];
		
		Command noCommand = new NoCommand();
		for(int i=0;i<3;i++)
		{
			onCommands[i]=noCommand;
			offCommands[i]=noCommand;
		}
		
	}
	public void setCommand(int slot,Command onCommand, Command offCommand)
	{
		onCommands[slot]=onCommand;
		offCommands[slot]=offCommand;
	}
	
	public void onButtonPushed(int slot)
	{
		onCommands[slot].execute();
	}
	public void offButtonPushed(int slot)
	{
		offCommands[slot].execute();
	}
	public String toString()
	{
		StringBuffer stringBuff= new StringBuffer();
		stringBuff.append("\n ----------------- Remote Control ---------------\n");
		for(int i=-0; i< onCommands.length; i++)
		{
			stringBuff.append("[Slot " + i +"]"+onCommands[i].getClass().getName() + "\n");
		}
		return stringBuff.toString();
	}
}


package remotecontrol;


public class RemoteLoader {
	public static void main(String args[])
	{
		RemoteControl remoteControl=new RemoteControl();
		Light KitchenRoomLight= new Light("Living Room");
		Ac BedRoomAc = new Ac("Bed Room");
		
		//Kitchen Room light on and off
		LightOnCommand kitchenRoomLightOn=new LightOnCommand(KitchenRoomLight);
		LightOffCommand kitchenRoomLightOff=new LightOffCommand(KitchenRoomLight);
		
		// Bedroom AC On and Off
		AcOnCommand BedRoomAcOn=new AcOnCommand(BedRoomAc);
		AcOffCommand BedRoomAcOff=new AcOffCommand(BedRoomAc);
		
		remoteControl.setCommand(0, kitchenRoomLightOn, kitchenRoomLightOff);
		remoteControl.setCommand(1, BedRoomAcOn, BedRoomAcOff);
		
		System.out.println(remoteControl);
		
		remoteControl.onButtonPushed(0);
		remoteControl.offButtonPushed(0);
		remoteControl.onButtonPushed(1);
		remoteControl.offButtonPushed(1);
		
	}
}
