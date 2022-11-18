public class Weather_station {
	int temparature,humidity,pressure;

	public Weather_station(int temparature, int humidity, int pressure) {
		this.temparature = temparature;
		this.humidity = humidity;
		this.pressure = pressure;
	}
	
	public void measurementsChanged()
	{
		System.out.println("Temprature"+temparature+"\n Humidity:"+humidity+"\n Measure:"+pressure);
		
	}
	
	public void getTemperature()
	{
		System.out.println("Temparature:"+temparature);
	}
	
	public void getHumidity()
	{
		System.out.println("Humidity:"+humidity);
	}
	
	public void getPressure()
	{
		System.out.println("Measurement:"+pressure);
	}
	

	public void setMeaturement(int t, int h, int p) {
		// TODO Auto-generated method stub
		temparature=t;
		humidity=h;
		pressure=p;
	}
}

public class Main {
	public static void main(String[] args) {
		Weather_station w1=new Weather_station(20, 7, 5);
		w1.getTemperature();
		w1.getHumidity();
		w1.getPressure();
		w1.setMeaturement(5, 7, 9);
	}
}
