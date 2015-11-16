
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Nils
 */
public class Coffee extends CaffeineBeverage {

    @Override
    void brew() {
        System.out.println("Drippping Coffee through filter");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding Sugar and Milk");
    }

    @Override
    public boolean customerWantsCondiments() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Would you like milk and sugar with your coffee(y/n)");
        String answer = sc.next();
        if (answer.toLowerCase().startsWith("y")) {
            return true;
        } else {
            return false;
        }
    }

}
