import java.util.*;
public class MaxProduct
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
	int maxProduct(int[] array,int size)
	{
		Arrays.sort(array);
		int firstMax = array[size-1],secondMax = array[size-2],thirdMax = array[size-3];
		return firstMax*secondMax*thirdMax;
	}
	public static void main(String args[])
	{
		MaxProduct max = new MaxProduct();
		System.out.print("ENter array size : ");
		int size = in.nextInt();
		int[] array = max.getArrayInput(size);
		System.out.print("Max Product : "+max.maxProduct(array,size));		
		in.close();
	}
}