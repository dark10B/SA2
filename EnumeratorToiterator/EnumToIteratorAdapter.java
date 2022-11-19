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