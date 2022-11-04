import java.io.*;
public class FileRead
{
	public static void main(String[] args)
	{
		int ch;
		try
		{
			FileReader fr = new FileReader("Hello.txt");
			while((ch=fr.read())!=-1)
			{
				System.out.print((char)ch);
			}
			fr.close();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}	
	}
}