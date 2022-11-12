import java.util.Scanner;
import java.lang.Math;
public class SumOfPairs
{
	public static void main(String args[])
	{
		int arr[] = new int[5];
		int n= 5;
		int flag=0;
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the array elements : ");
		for(int i=0;i<n;i++)
		{
			arr[i]= in.nextInt();
		}
		System.out.print("Enter the number: ");
		int givenNum = in.nextInt();
		in.close();
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(Math.abs(arr[i]+arr[j])==givenNum)
				{
					System.out.print("("+arr[i]+","+arr[j]+") ");
					flag = 1;
					break;
				}
			}
		}
		if(flag == 0){System.out.print("No pair exists");}
	}
}
