import java.util.Scanner;
public class Task1819
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a double : ");
		double d = in.nextDouble();
		System.out.println((int)d);
		System.out.print("Enter a char : ");
		char c = in.next().charAt(0);	
		System.out.println((int)c);
	}
}