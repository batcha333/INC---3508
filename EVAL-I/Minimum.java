import java.util.*;
public class Minimum
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a range : ");
		int r = in.nextInt();
		int[] arr1 = new int[r];
		int[] arr2 = new int[r];
		int a=0,b=0;
		System.out.print("Enter array 1 elements : ");
		for(int i=0;i<r;i++)
		{
			arr1[i] = in.nextInt();
		}
		System.out.print("Enter array 2 elements : ");
		for(int i=0;i<r;i++)
		{
			arr2[i] = in.nextInt();
		}	
		int min1 = arr1[0],min2 = arr2[0];
		for(int i=1;i<r;i++)
		{
			if(min1>arr1[i]) min1 = arr1[i];
			if(min2>arr2[i]) min2 = arr2[i];
		}
		System.out.println("min1 & min2 : "+min1+" "+min2);
		int min = min1+min2;
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<r;j++)
			{
				int sum = arr1[i]+arr2[j];
				if(min>=sum)
				{
					min = sum;
					a=i;b=j;
					if(b!=a)
					{
						System.out.println("a & b"+a+" "+b);
						System.out.println("Sum : "+sum);
					}
				}
			}
		}
	}
}