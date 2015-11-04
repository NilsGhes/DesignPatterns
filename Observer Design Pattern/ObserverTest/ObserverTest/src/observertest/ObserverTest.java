/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observertest;

import java.util.Scanner;

/**
 *
 * @author Nils
 */
public class ObserverTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DataObservable save = new DataObservable();
        DataWriter writer = new DataWriter(save);

        Scanner sc = new Scanner(System.in);
        System.out.println("invoer?");
        String inv = sc.next();
        while (!inv.equals("stop")) {
            String arr[] = inv.split(",");
            save.addData(Integer.parseInt(arr[0]), arr[1]);
            System.out.println("invoer?");
            inv = sc.next();
        }
        
        System.out.println(save.getData(1));
    }

}
