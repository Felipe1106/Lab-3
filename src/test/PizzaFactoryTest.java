import org.junit.Test;
import static org.junit.Assert.*;

public class PizzaFactoryTest {

    @Test
    public void testCreateCheesePizza() {
        PizzaFactory factory = new PizzaFactory();
        PizzaInterface PizzaInterface = factory.createPizza("cheese");
        assertTrue(PizzaInterface instanceof CheesePizza);
    }

    @Test
    public void testCreateGreekPizza() {
        PizzaFactory factory = new PizzaFactory();
        PizzaInterface PizzaInterface = factory.createPizza("greek");
        assertTrue(PizzaInterface instanceof GreekPizza);
    }

}