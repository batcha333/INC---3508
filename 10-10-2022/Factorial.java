import java.util.*;
public class Factorial
{
	static int fact=1;
	static int Fact(int num)
	{
		for(int i=1;i<=num;i++)
		{
			fact*=i;
		}
		return fact;
	}
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int n= in.nextInt();
		System.out.print("factorial = "+Fact(n));	
	}
}