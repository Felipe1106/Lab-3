public class PizzaFactory {
    public PizzaInterface createPizza(String type) {
        if (type.equals("cheese")) {
            return new CheesePizza();
        } else if (type.equals("greek")) {
            return new GreekPizza();
        } else if (type.equals("pepperoni")) {
            return new PepperoniPizza();
        } else if (type.equals("glutenfree")) {
            return new GlutenFreePizza();
        } else {
            return null;
        }
    }
}