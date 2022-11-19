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