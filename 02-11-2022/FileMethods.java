import java.io.*;
public class FileMethods
{
	public static void main(String[] args)
	{
		try
		{
			File f = new File("C:\\Users\\Administrator\\Desktop\\INC - 3508\\02-11-2022\\Demo.txt");
			f.createNewFile();
			if(f.exists())
			{
				System.out.println("File is existing");
			}
			System.out.println("Directory : "+f.isDirectory());
			System.out.println("File : "+f.isFile());
			System.out.println("Name : "+f.getName());
			System.out.println("Absolute Path : "+f.getAbsolutePath());
		}	
		catch(IOException i)
		{
			i.printStackTrace();	
		}	
	}
}