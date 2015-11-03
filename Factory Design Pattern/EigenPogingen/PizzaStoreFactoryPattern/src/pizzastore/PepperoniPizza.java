/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzastore;

/**
 *
 * @author Nils
 */
public class PepperoniPizza extends Pizza {
PizzaIngredientFactory ingredientFactory;

public PepperoniPizza(PizzaIngredientFactory ingredientFactory){
    this.ingredientFactory = ingredientFactory;
}
    @Override
    void prepare() {
        System.out.println("Preparing " + name);
        this.dough = ingredientFactory.createDough();
        this.sauce = ingredientFactory.createSauce();
        this.cheese = ingredientFactory.createCheese();
        this.pepperoni = ingredientFactory.createPepperoni();
    }
}
