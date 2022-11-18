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