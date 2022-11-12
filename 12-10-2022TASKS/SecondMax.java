import java.util.Scanner;
public class SecondMax
{
	public static int secondMax(int[] arr,int n)
	{
		int max=arr[0];
		int sec_max=arr[0];
		for(int i=1;i<n;i++)
		{
			if(arr[i]>max)
			{
				sec_max=max;
				max=arr[i];
			}	
		}
		return sec_max;
	}	
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter number of elements : ");
		int n = in.nextInt();
		int[] arr=new int[10];
		for(int i=0;i<n;i++)
		{
			arr[i] = in.nextInt();
		}
		System.out.print("Second max -> "+secondMax(arr,n));
	}
}