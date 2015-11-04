/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observertest;

import java.util.Map;
import java.util.Observable;
import java.util.TreeMap;

/**
 *
 * @author Nils
 */
public class DataObservable extends Observable {

    private final Map<Integer, String> test;

    public DataObservable() {
        test = new TreeMap<>();
    }

    public void addData(int i, String s) {
        test.put(i, s);
        entryAdded();

    }
    
    public String getData(int i){
        return test.get(i);
    }

    public void showData() {
        System.out.println("-----------------");
        test.entrySet().stream().forEach((entry) -> {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        });
        System.out.println("-----------------");
    }

    public void entryAdded() {
        setChanged();
        notifyObservers();
    }
}
