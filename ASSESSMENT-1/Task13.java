import java.util.Scanner;
public class Task13
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		double num = in.nextDouble();
		double den = in.nextDouble();
		boolean d= Double.isFinite(num/den);
		System.out.println(d);
	} 
}