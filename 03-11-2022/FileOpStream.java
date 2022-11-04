import java.io.*;
public class FileOpStream
{
	public static void main(String args[]) throws IOException
	{
		FileOutputStream fop = new FileOutputStream("C:\\Users\\Administrator\\Desktop\\INC - 3508\\03-11-2022\\Opstream.txt");
		String str = "Hello, This is FileopStream example";
		int i=0;
		while(i<str.length())
		{
			fop.write((int)(str.charAt(i)));
			i++;
		}
		fop.close();
 	}
}