import java.util.Scanner;
public class SumOfEven
{		
	public void add(int[] arr)
	{
		int sum = 0;
		sum += arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]%2==0)
				sum += arr[i];
			else
			{
				if(arr[i-1]%2!=0)
					sum += arr[i];
			}
		}
		System.out.println("Sum : "+sum);
	}
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a size : ");
		int n = in.nextInt();
		int[] arr = new int[n];	
		System.out.print("Enter a array : ");
		for(int i=0;i<n;i++)
		{
			arr[i] = in.nextInt();
		}
		SumOfEven s = new SumOfEven();
		s.add(arr);
	}
}