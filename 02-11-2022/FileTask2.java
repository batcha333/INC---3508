import java.io.*;
public class FileTask2
{
	public static void main(String[] args)
	{
		try
		{
			File f = new File("C:\\java\\abc.txt");
			f.createNewFile();
			if(f.exists())
			{
				System.out.println("File is created and existing!!");
			}
			else{System.out.println("File is not created");}
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
}