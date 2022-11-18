public class Singleton {
	private static Singleton instance;
	public String value;
	private Singleton(String value)
	{
		this.value=value;
	}
	public static Singleton getInstance(String value)
	{
		Singleton result=instance;
		if(result!=null)
		{
			return result;
		}
		synchronized(Singleton.class)
		{
			if(instance==null)
			{
				instance=new Singleton(value);
			}
			return instance;
		}
	}
}


public class Demomultithread {
	public static void main(String[] args)
	{
		System.out.println("If you see single value at a time singleton is reused"+"if you see both values 2 singletons are created");
		Thread t1=new Thread(new t1());
		Thread t2=new Thread(new t2());
		
		t1.start();
		t2.start();	
	}
	
	static class t1 implements Runnable
	{
		public void run()
		{
			Singleton singleton=Singleton.getInstance("Name");
			System.out.println(singleton.value);	
		}
	}
	static class t2 implements Runnable
	{
		public void run()
		{
			Singleton singleton=Singleton.getInstance("Surname");
			System.out.println(singleton.value);	
		}
	}
}
