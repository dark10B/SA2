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


package Enumerator;

import java.util.Enumeration;
import java.util.Iterator;
public class EnumToIteratorAdapter implements Iterator {
	
	Enumeration enumA;
	public EnumToIteratorAdapter(Enumeration e)
	{
		enumA=e;
	}
	public boolean hasNext()
	{
		return enumA.hasMoreElements();
	}
	public Object next()
	{
		return enumA.nextElement();
	}
	public void remove()
	{
		throw new UnsupportedOperationException();
	}
}


package Enumerator;

import java.util.Iterator;

public class Product {

	
	public void displayProduct(Iterator iterator)
	{
		for(;iterator.hasNext();)
			System.out.println(iterator.next());
	}
	public static void main(String[] args) {
		Product product=new Product();
		EnumProduct enumproduct=new EnumProduct();
		EnumToIteratorAdapter enumToIteratorAdaptor=new EnumToIteratorAdapter(enumproduct.getProduct());
		product.displayProduct(enumToIteratorAdaptor);
	}

}
