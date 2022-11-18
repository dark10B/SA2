package weather;

public class Main {
	public static void main(String[] args) {
		Weather_station w1=new Weather_station(20, 7, 5);
		w1.getTemperature();
		w1.getHumidity();
		w1.getPressure();
		w1.setMeaturement(5, 7, 9);
	}
}
