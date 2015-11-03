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
public class CaliforniaPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new CaliforniaPizzaIngredientFactory();
        switch (type) {
            case "cheese":
                pizza = new CheesePizza(ingredientFactory);
                pizza.setName("California Style Cheese Pizza");
                break;
            case "pepperoni":
                pizza = new PepperoniPizza(ingredientFactory);
                pizza.setName("California Style Pepperoni Pizza");
                break;
            case "clam":
                pizza = new ClamPizza(ingredientFactory);
                pizza.setName("California Style Cheese Pizza");
            case "veggie":
                pizza = new VeggiePizza(ingredientFactory);
                pizza.setName("California Style Veggie Pizza");
                break;
        }
        return pizza;
    }
}
