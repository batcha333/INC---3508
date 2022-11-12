import java.util.Scanner;
public class Task9
{
	public static int sum(int n)
	{
		int sum = 0;
		while(n!=0)
		{
			sum += n%10;
			n/=10;
		}
		return sum;
	}
	public static int reverse(int n)
	{
		int rev = 0;
		while(n!=0)
		{
			rev = rev*10+n%10;
			n/=10;
		}
		return rev;
	}
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = in.nextInt();
		System.out.println("Sum of Digits in the given number : "+sum(num));
		System.out.println("Reverse of the given number : "+reverse(num));
	}
}