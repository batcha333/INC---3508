import java.util.*;
public class Triplets
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a array : ");
		String[] s = in.nextLine().split(",");	
		int n = s.length;
		int[] a = new int[n];
		for(int i=0;i<n;i++)
		{
			a[i] = Integer.parseInt(s[i]);
		} 	
		int max = Integer.MIN_VALUE;
		for(int i=0;i+2<a.length;i++)
		{
			for(int j=i+1;j+1<a.length;j++)
			{
				for(int k=j+1;k<a.length;k++)
				{
					int p = a[i]*a[j]*a[k];
					max = Math.max(p,max);
				}
			}
		}
		System.out.println("Maximum Product : "+max);
	}
}