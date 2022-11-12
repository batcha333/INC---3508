import java.util.Scanner;
public class UserArray
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter size: ");
		int n = in.nextInt();
		int[] arr = new int[n];
		for (int i=0;i<n;i++)
		{
			arr[i]=in.nextInt();
		} 	
		for (int i : arr)
		{
			System.out.println(i);
		}
	}
}