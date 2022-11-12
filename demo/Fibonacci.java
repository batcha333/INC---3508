import java.util.*;

public class Fibonacci
{
	static int n1=0,n2=1,n3;
	static void fibo(int num)
	{
		int i;
		if(num>1)
		{
			n3=n1+n2;
			n1=n2;
			n2=n3;
			System.out.print(n3+" ");
			fibo(num-1);		
		}
	}
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int n= in.nextInt();
		System.out.print(n1+" "+n2+" ");
		fibo(n-2);
	}
}