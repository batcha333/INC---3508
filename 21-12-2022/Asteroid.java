import java.util.*;
public class Asteroid
{
	static int[] a;
	public void method()
	{
		int n = a.length;
		for(int i=0;i<n;i++)
		{
			if(a[i]<0 && i>0 && a[i]!=Integer.MIN_VALUE)
			{
				if(a[i-1]>Math.abs(a[i]))
				{
					a[i] = Integer.MIN_VALUE;
				}	
				else if(a[i-1]==Math.abs(a[i]))
				{
					a[i] = Integer.MIN_VALUE;
					a[i-1] = Integer.MIN_VALUE;
				}
				else
				{
					a[i-1] = a[i];
					a[i] = Integer.MIN_VALUE;
					method();
				}
			}
		}
	}
	public void print()
	{
		for(int i : a)
		{
			if(i!=Integer.MIN_VALUE)
				System.out.print(i+" ");
		}
	}
	public static void main(String[] args)
	{
		Asteroid t = new Asteroid(); 
		Scanner in = new Scanner(System.in);
		//int[] a = {10,2,-5};
		//int n = a.length;
		System.out.print("Enter a range : ");
		int n = in.nextInt();
		a = new int[n];
		int[] res = new int[n];
		for(int i=0;i<n;i++)
		{
			a[i] = in.nextInt();
		}
		t.method();
		t.print();
	}
}