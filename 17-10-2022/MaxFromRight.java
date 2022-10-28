import java.util.*;
public class MaxFromRight
{
	static void maxFromRight(int[] arr, int size)
	{
		int max = arr[size-1];
		arr[size-1] = -1;
		for(int i=size-2;i>=0;i--)
		{
			int temp = arr[i];
			arr[i] = max;
			if(max<temp)
				max=temp;
		}
	}
	public static void main(String args[])
	{
		int[] array = {16,17,4,3,5,2};
		int len = array.length;
		maxFromRight(array,len);
		System.out.print(Arrays.toString(array));
	}
}