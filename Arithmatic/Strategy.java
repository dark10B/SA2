package Arithmatic;


public interface Strategy {
	
	default int dooperation(int num1,int num2)
	{
		return 0;
	}

}