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
