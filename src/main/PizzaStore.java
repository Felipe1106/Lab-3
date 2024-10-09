public class PizzaStore {
    private PizzaFactory factory;

    public PizzaStore(PizzaFactory factory) {
        this.factory = factory;
    }

    public PizzaInterface orderPizza(String type) {
        PizzaInterface PizzaInterface = factory.createPizza(type);

        if (PizzaInterface != null) {
            PizzaInterface.prepare();
            PizzaInterface.bake();
            PizzaInterface.cut();
            PizzaInterface.box();
        } else {
            System.out.println("Sorry, we don't have that type of pizza.");
        }

        return PizzaInterface;
    }
}