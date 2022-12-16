import java.util.Scanner;
public class MaxInWindow
{	
	public int maximum(int[] arr,int s,int e)
	{
		int max = Integer.MIN_VALUE;
		for(int i=s;i<=e;i++)
		{
			if(max<arr[i])
			{
				max = arr[i];
			}	
		}
		return max;
	}
	public void print(int[] arr,int k)
	{
		int s=0,e=k-1;
		while(e<arr.length)
		{
			int max = maximum(arr,s,e);
			System.out.println(max);
			s++;e++;
		}
	}
	public static void main(String[] args)
	{
		MaxInWindow m = new MaxInWindow();
		Scanner in = new Scanner(System.in);
		System.out.print("Enter size : ");
		int n = in.nextInt();
		int[] arr = new int[n];
		System.out.print("Enter array : ");
		for(int i=0;i<n;i++)
		{
			arr[i] = in.nextInt();	
		}
		System.out.print("Enter k : ");
		int k = in.nextInt();
		m.print(arr,k);
		in.close();
	}
}