/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package turkey.adapter;

/**
 *
 * @author Nils
 */
public class DuckTestDrive {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MallardDuck duck = new MallardDuck();
        WildTurkey turkey = new WildTurkey();
        Duck turkeyadapter = new TurkeyAdapter(turkey);
        
        System.out.println("The turkey says...");
        turkey.gobble();
        turkey.fly();
        
        System.out.println("\nThe duck says...");
        testDuck(duck);
        
        System.out.println("\nThe TurkeyAdapter says...");
        testDuck(turkeyadapter);
    }
    
    static void testDuck(Duck duck){
        duck.quack();
        duck.fly();
    }
    
}
