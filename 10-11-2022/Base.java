import java.util.*;
public class Base
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter 2 numbers : ");
		int n1=in.nextInt();
		int n2=in.nextInt();
		System.out.print("Enter base : ");
		int b=in.nextInt();
		int c =0,fsum=0;
		String sum="";
		while(n1>0 || n2>0)
		{
			fsum = n1%10 + n2%10 + c;
			sum = fsum%b+sum;
			c = fsum/b;
			n1 /= 10;
			n2 /= 10;
		}
		if(c!=0)
			sum=c+sum;
		System.out.print("Sum : "+sum);
	}
}