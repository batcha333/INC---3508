import java.io.*;
public class FileRename
{
	public static void main(String[] args)
	{
		File f = new File("C:\\Users\\Administrator\\Desktop\\INC - 3508\\03-11-2022\\Demo1.txt");
		String rename = args[0]+".txt";
		File r = new File("C:\\Users\\Administrator\\Desktop\\INC - 3508\\03-11-2022\\"+rename);
		if(f.renameTo(r))
			System.out.println("Done");
		else
			System.out.println("File Not Found");
		r.delete();
	}	
			
}