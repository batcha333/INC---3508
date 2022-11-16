import java.util.*;

public class FibonacciElement
{
	static int Fibo(int num)	
	{
		if(num==0 || num==1)
		{
			return num;
		}
		else
		{
			return Fibo(num-1)+Fibo(num-2);
		}
	}
	public static void main(String[] args)
	{
		Scanner in= new Scanner(System.in);
		System.out.print("Enter a Number : ");
		int n= in.nextInt();
		System.out.println(Fibo(n-1));
	}
}