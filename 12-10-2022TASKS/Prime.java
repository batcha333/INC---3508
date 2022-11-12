import java.util.Scanner;
public class Prime
{
	public static boolean primeCheck(int n)
	{
		if(n==1){return true;}
		for(int i=2;i<n/2;i++)
		{
			if(n%i==0){return false;}
		}
		return true;
	}
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = in.nextInt();
		if(primeCheck(num)){System.out.print(num+" is a prime");}
		else {System.out.print(num+" is not a prime");} 
	}
}