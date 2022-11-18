package pizza;

public class PizzaTest {
	public static void main(String[] args)
	{
		PizzaStore nyStore=new NYPizzaStore();
		PizzaStore chicagoStore=new ChicagoPizzaStore();
		
		Pizza pizza;
		pizza=nyStore.orderPizza("cheese");
		pizza=chicagoStore.orderPizza("cheese");
	}
}