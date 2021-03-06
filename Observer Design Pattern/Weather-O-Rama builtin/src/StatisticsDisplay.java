
import java.util.Observable;
import java.util.Observer;


public class StatisticsDisplay implements Observer, DisplayElement {
	private float maxTemp = 0.0f;
	private float minTemp = 200;
	private float tempSum= 0.0f;
	private int numReadings;
  Observable observable;

	public StatisticsDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

        @Override
   public void update(Observable obs, Object arg) {
        if (obs instanceof WeatherData) {
            WeatherData weatherdata = (WeatherData) obs;
		tempSum += weatherdata.getTemperature();
		numReadings++;

		if (weatherdata.getTemperature() > maxTemp) {
			maxTemp = weatherdata.getTemperature();
		}
 
		if (weatherdata.getTemperature() < minTemp) {
			minTemp = weatherdata.getTemperature();
		}

		display();
	}}

        @Override
	public void display() {
		System.out.println("Avg/Max/Min temperature = " + (tempSum / numReadings)
			+ "/" + maxTemp + "/" + minTemp);
	}
}
