import java.io.*;
class Pudhusu{
	public static void main(String args[]){
		File f = new File("c:\\java\\abc.txt");
		if(f.exists())	
			System.out.println("iruku");
		
		System.out.println(args[0]);
	}
}