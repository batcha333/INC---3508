import java.io.*;
import java.text.*;
public class FileLastModified
{
	public static void main(String[] args)
	{
		File f1 = new File("C:\\Users\\Administrator\\Desktop\\INC - 3508\\03-11-2022\\FileLastModified.java");
		long t = f1.lastModified();
		DateFormat sdf = new SimpleDateFormat("MMMM dd YYYY hh:mm:ss a");
		System.out.println("Last Modified time : "+sdf.format(t)); 
	}
}