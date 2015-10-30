
import java.util.Observable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Nils
 */
public class WeatherData extends Observable {

    private float temperature;
    private float humidity;
    private float pressure;

    //We don't need to make a data object to hold the observers
    public WeatherData() {
    }

    public void measurementsChanged() {
        setChanged();  //first setChanged to indicate the state has changed
        notifyObservers(); //we aren't sending a data object with the notifyObservers() call so we're using PULL
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    public float getTemperature() {
        return this.temperature;
    }

    public float getHumidity() {
        return this.humidity;
    }

    public float getPressure() {
        return this.pressure;
    }

}
