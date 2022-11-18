import java.io.*;
public class LowerCaseInputStream extends FilterInputStream{

	protected LowerCaseInputStream(InputStream in)
	{
		super(in);
	}
	
	public int read() throws IOException
	{
		int c=super.read();
		return (c==-1 ? c:Character.toLowerCase((char)c));
	}
	
	public int read(byte[] b,int offset,int len) throws IOException
	{
		int result=super.read(b,offset,len);
		for(int i=offset;i<offset+result;i++)
		{
			b[i]=(byte)Character.toLowerCase((char)b[i]);
		}
		return result;
				
	}

}

import java.io.*;

public class Inputtest {
	
	public static void main(String[] args)
	{
		int c;
		try
		{
			InputStream is = new LowerCaseInputStream(new BufferedInputStream(new FileInputStream("C:\\Users\\NAME\\eclipse-workspace\\Programs\\Decorator\\src\\Deco\\file1.txt")));
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

