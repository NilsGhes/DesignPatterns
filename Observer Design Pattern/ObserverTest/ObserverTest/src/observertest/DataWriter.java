/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observertest;

import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author Nils
 */
public class DataWriter implements Observer {

    Observable observable;

    public DataWriter(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable obs, Object arg) {
        if (obs instanceof DataObservable) {
            DataObservable data = (DataObservable) obs;
            data.showData();
        }
    }
   
}
