import java.util.Scanner;
import java.io.*;
public class Task12
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		String str = Integer.toString(num);
		for ( int i=0;i<str.length();i++)
		{
			System.out.print(str.charAt(i)+" ");
		}
	}
}