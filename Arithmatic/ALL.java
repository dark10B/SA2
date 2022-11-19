package Arithmatic;


public interface Strategy {
	
	default int dooperation(int num1,int num2)
	{
		return 0;
	}

}



package Arithmatic;

public class Context {
	private Strategy strategy;
	public Context(Strategy strategy)
	{
		this.strategy=strategy;
	}
	
	public int executeStrategy(int num1,int num2)
	{
		return strategy.dooperation(num1, num2);
	}
}




package Arithmatic;

public class OperationAdd implements Strategy
{
	 public int dooperation(int num1, int num2)
	 {
		// TODO Auto-generated method stub
		return num1+num2;
	 }
}




package Arithmatic;

public class OperationMul implements Strategy
{
	 public int dooperation(int num1, int num2)
	 {
		// TODO Auto-generated method stub
		return num1*num2;
	 }
}



package Arithmatic;

public class OperationSub implements Strategy
{
	 public int dooperation(int num1, int num2)
	 {
		// TODO Auto-generated method stub
		return num1-num2;
	 }
}




package Arithmatic;

public class Strategydemo {
	public static void main(String[] args) {
		Context context=new Context(new OperationAdd());
		System.out.println("10+5="+context.executeStrategy(10,5));
		
		context=new Context(new OperationSub());
		System.out.println("10-5="+context.executeStrategy(10,5));
		
		context=new Context(new OperationMul());
		System.out.println("10*5="+context.executeStrategy(10,5));
		
	}

}
