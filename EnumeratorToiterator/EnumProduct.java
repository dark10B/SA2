package Enumerator;

import java.util.Enumeration;
import java.util.Vector;

public class EnumProduct {

	private Vector product;

	public EnumProduct() 
	{
		System.out.println("Implemeting adaptor pattern for enumeratior");
		
		product= new Vector();
		
		setProduct("ProductA:Laptop");
		setProduct("ProductB:Moblile");
		setProduct("ProductC:Tablets");
		setProduct("ProductD:Router");
	}
	
	public void setProduct(String s)
	{
		product.add(s);
	}
	
	public Enumeration getProduct()
	{
		Enumeration eproduct=product.elements();
		return eproduct;
	}
}
