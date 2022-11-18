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