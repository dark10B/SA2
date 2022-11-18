import java.io.*;

public class Inputtest {
	
	public static void main(String[] args)
	{
		int c;
		try
		{
			InputStream is = new LowerCaseInputStream(new BufferedInputStream(new FileInputStream("C:\\Users\\Arbaaz\\eclipse-workspace\\Programs\\Decorator\\src\\Deco\\file1.txt")));
			while((c=is.read())>=0)
			{
				System.out.print((char)c);
				
			}
			is.close();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
}