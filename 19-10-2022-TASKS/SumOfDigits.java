public class SumOfDigits
{
	public static int sum(int num)
	{
		if((n/10)==0)
			return 0;
		else
			return n=n+n%10;
	}
	public static void main(String[] args)
	{
		int num = 1234;
		System.out.print("Sum : "+sum(num));
	}
}