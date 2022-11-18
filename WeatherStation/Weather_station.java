package weather;

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
		temparature=t;
		humidity=h;
		pressure=p;
	}
}