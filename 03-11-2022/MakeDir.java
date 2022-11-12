import java.io.*;
public class MakeDir
{
	public static void main(String[] args)
	{

		File f = new File("C:\\Users\\Administrator\\Desktop\\INC - 3508\\03-11-2022\\DirFolder1");
		if(f.mkdir())
			System.out.println("Done");
		else
			System.out.println("Not done");	
	}
}