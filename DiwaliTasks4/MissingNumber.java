import java.util.*;
public class MissingNumber
{
	static Scanner in = new Scanner(System.in);
	int[] getArrayInput(int n)
	{
		int[] arr = new int[n];
		System.out.print("ENter array elements : ");
		for(int i =0;i<n;i++)
		{
			arr[i] = in.nextInt();
		}
		return arr;
	}
	void findMissingNumber(int[] array,int n)
	{
		int sum =0;
		for(int i=0;i<n;i++)
		{
			sum +=array[i];
		}
		int product = n * (n+1)/2;
		System.out.print("Missing Number : "+(product-sum));
	}
	public static void main(String[] args)
	{
		MissingNumber miss = new MissingNumber();
		System.out.print("Enter array size : ");
		int size  = in.nextInt();
		int[] array = miss.getArrayInput(size);
		miss.findMissingNumber(array,size);
	}
}