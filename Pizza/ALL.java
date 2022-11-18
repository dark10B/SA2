package pizza;

import java.util.ArrayList;

public abstract class Pizza {
	String name;
	String dough;
	String sauce;
	
	ArrayList toppings = new ArrayList();
	
	void prepare()
	{
		System.out.println("Prepareing "+name);
		System.out.println("Tossing dough...");
		System.out.println("Adding topping:");
		for(int i =0 ; i<toppings.size();i++)
		{
			System.out.println(""+toppings.get(i));
		}
	}
	
	void bake()
	{
		System.out.println("Bake for 25 min in 350 degree");
	}
	void cut()
	{
		System.out.println("Cutting pizza in diagonal shape");
	}
	void box()
	{
		System.out.println("Place pizza in box");
	}
	public String getName() {
		return name;
		}

	
	public String toString()
	{
		StringBuffer display=new StringBuffer();
		display.append("----"+name+"-----\n");
		display.append(dough+"\n");
		display.append(sauce+"\n");
		for(int i=0;i< toppings.size();i++)
		{
			display.append((String)toppings.get(i)+"\n");
		}
		return display.toString();
	}
}


package pizza;

public abstract class PizzaStore
{
	abstract Pizza createPizza(String item);
	public Pizza orderPizza(String type)
	{
		Pizza pizza=createPizza(type);
		System.out.println("---Making a "+pizza.getName()+"----");
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}
}


package pizza;

public class ChicagoStyleCheesePizza extends Pizza
{
	public ChicagoStyleCheesePizza()
	{
		name="Chicago Style Cheese Pizza";
		dough="Thin crust Dough";
		sauce="Tomato sauce";
		toppings.add("Grated Regiano Cheese");
	}
}


package pizza;

public class ChicagoPizzaStore extends PizzaStore
{
	Pizza createPizza(String item)
	{
		if (item.equals("cheese"))
		{
			return new ChicagoStyleCheesePizza();
		}
		else 
			return null;
	}
} 

package pizza;

public class NYStyleCheesePizza extends Pizza
{
	public NYStyleCheesePizza()
	{
		name="NY Style Cheese Pizza";
		dough="Thin crust Dough";
		sauce="Tomato sauce";
		toppings.add("Grated Regiano Cheese");
	}
}

package pizza;

public class NYPizzaStore extends PizzaStore
{
	Pizza createPizza(String item)
	{
		if (item.equals("cheese"))
		{
			return new NYStyleCheesePizza();
		}
		else
			return null;
	}
}

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
