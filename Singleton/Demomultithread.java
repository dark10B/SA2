package singleton;

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