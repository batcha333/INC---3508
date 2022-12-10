import java.util.Scanner;
import java.util.Arrays;
public class Unique2
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter size : ");
		int n = in.nextInt();
		System.out.print("Enter array : ");
		int[] arr = new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i] = in.nextInt();
		}
		int pos = 0;
		for(int i=0;i<n;i++)
		{
			int e = arr[i];
			boolean flag = false;
			for(int j=0;j<pos;j++)
			{
				if(arr[j] == e)
				{
					flag = true;
				}
			}
			if(!flag){arr[pos++]=e;}
		}
		for(int i=pos;i<n;i++)
		{
			arr[i] = Integer.MIN_VALUE;	
		}	
		System.out.println(Arrays.toString(arr));
	}
}