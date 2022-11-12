import java.util.*;
public class CyclicArray
{
	public static void main(String[] args)
	{
		int[] arr = {1,2,3,4,5};
		int n = arr.length;
		int[] newArr = new int[n];
		newArr[0]= arr[n-1];
		int k =1;
		for(int i=0;i<n-1;i++)
		{
			newArr[k++]=arr[i];
		}
		System.out.print(Arrays.toString(newArr));
	}
}