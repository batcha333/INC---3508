import java.util.*;
public class MaxProductTriplet
{
	
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		int n = Integer.parseInt(in.readLine());
		int arr[] = new int[n];
		System.out.print("Enter the array elements : "+in.readLine());
		
		for(int i=0;i<n;i++)
		{
			arr[i]=Integer.parseInt(in.readLine());
		}
	}
}