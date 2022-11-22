import java.util.*;
public class LeftRight
{
	boolean calculate(int[] arr,int pos)
	{
		int sum1 = 0,sum2 = 0;
		for(int i=0;i<pos;i++)
		{
			sum1 += arr[i];
		}
		for(int i=pos+1;i<arr.length;i++)
		{
			sum2 += arr[i];
		}
		if(sum1==sum2) return true;
		return false;
	}
	String perform(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(calculate(arr,i)) return "YES";	
		}
		return "NO";
	}
	public static void main(String[] args)
	{
		LeftRight lr = new LeftRight();
		Scanner in = new Scanner(System.in);
		System.out.print("Enter no of testCases : ");
		int t = in.nextInt();
		for(int i=0;i<t;i++)
		{
			System.out.print("Enter a range : ");
			int r = in.nextInt();
			int[] arr = new int[r];
			for(int j=0;j<r;j++)
			{
				arr[j] = in.nextInt();
			}
			System.out.println(lr.perform(arr));
		}
	}
}