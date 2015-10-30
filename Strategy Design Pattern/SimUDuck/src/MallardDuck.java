/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nils
 */
public class MallardDuck extends Duck {
    
    public MallardDuck(){
        this.quackBehavior= new Quack();
        this.flyBehavior= new FlyWithWings();
    }
    
    @Override
    public void display(){
        System.out.println("I'm a real mallard duck");
    }
}
