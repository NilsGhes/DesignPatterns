/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nils
 */
public class NoQuarterState implements State {
    GumballMachine gumballmachine;
    
    public NoQuarterState(GumballMachine gumballmachine){
        this.gumballmachine = gumballmachine;
    }
    
    
    @Override
    public void insertQuarter() {
        System.out.println("You inserted a quarter");
        gumballmachine.setState(gumballmachine.getHasQuarterState());
        
    }

    @Override
    public void ejectQuarter() {
        System.out.println("You haven't inserted a quarter");
    }

    @Override
    public void turnCrank() {
        System.out.println("You turned, but there's no quarter");
    }

    @Override
    public void dispense() {
        System.out.println("You need to pay first");
    }
    
}
