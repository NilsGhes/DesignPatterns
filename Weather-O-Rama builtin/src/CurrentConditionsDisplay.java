
import java.util.Observable;
import java.util.Observer;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nils
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {

    Observable observable;
    private float temperature;
    private float humidity;


    //out constructor now takes an Observable and we use this to add the current conditions object as an Observer
    public CurrentConditionsDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable obs, Object arg) {
        //we must first make sure the observable is of type WeatherData, then we can use its getters
        if (obs instanceof WeatherData) {
            WeatherData weatherdata = (WeatherData) obs;
            this.temperature = weatherdata.getTemperature();
            this.humidity = weatherdata.getHumidity();
            display();
        }
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature + "C degrees and " + humidity + "% humidiry");

    }
}
