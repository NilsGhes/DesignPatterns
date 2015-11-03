/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nils
 */
public class StarbuzzCoffee {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Beverage beverage = new Espresso(); //espresso, no condiments
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        Beverage beverage2 = new DarkRoast(); //make DarkRoast object
        beverage2 = new Mocha(beverage2); //Wrap it with a Mocha
        beverage2 = new Mocha(beverage2); //Wrap it in a second Mocha
        beverage2 = new Whip(beverage2); //Wrap it in a Whip
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());

        Beverage beverage3 = new HouseBlend(); //make a HouseBlend object
        beverage3 = new Soy(beverage3); //Wrap it with a Soy
        beverage3 = new Mocha(beverage3); //Wrap it with a Mocha
        beverage3 = new Whip(beverage3); //Wrap it with a Whip
        System.out.println(beverage3.getDescription() + " $" + beverage3.cost());
    }

}
