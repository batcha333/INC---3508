import java.util.Scanner;
public class AddDigits
{
	public static void Perform(int n)
	{
		int t=n;
		int sum=0,rem;
		while(t>0)
		{
			rem = t%10;
			sum += rem;
			t /=10;
		}	
		System.out.println("The sum of all the digits in "+n+" is "+sum);
	}
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Input an integer between 0 and 1000: ");
		int num = in.nextInt();
		Perform(num);
	}
}