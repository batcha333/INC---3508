import java.io.*;
public class FileWrite
{
	public static void main(String[] args) throws IOException
	{
		FileWriter fw = new FileWriter("NEWFILE.txt");
		fw.write("hello world!");
		fw.close();
		System.out.println("file written successfully!!!");
	}
}