import java.util.*;
public class MaxGuest
{
	public static void main(String[] args)
	{
		int max = Integer.MIN_VALUE;
		Scanner in = new Scanner(System.in);
		System.out.print("Enter time : ");
		int t = in.nextInt();
		System.out.print("Enter array 1: ");
		int[] a = new int[t]; 
		System.out.print("Enter array 2: ");
		int[] b = new int[t];
		for(int i=0;i<t;i++)
		{
			a[i] = in.nextInt();
		}
		for(int i=0;i<t;i++)
		{
			b[i] = in.nextInt();
		}		
		int count = 0;
		for(int i=0;i<t;i++)
		{
			count = count + a[i]-b[i];
			max = Math.max(count,max);
		}
		System.out.print("Max : "+max);
	}
}