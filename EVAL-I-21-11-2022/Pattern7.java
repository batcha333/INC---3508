import java.util.*;
public class Pattern7
{
	void pattern(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int s=n-i;s>0;s--)
			{
				System.out.print("  ");
			}
			for(int c1=1;c1<=i;c1++)
			{
				System.out.print(c1+" ");
			}
			for(int c2=1;c2<i;c2++)
			{
				System.out.print((i-c2)+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args)
	{
		Pattern7 p = new Pattern7();
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int n = in.nextInt();
		p.pattern(n);
	}
}