import java.util.Arrays;
public class QuickSortDemo
{
	public static int partitionIndex(int[] arr,int left,int right)
	{
		int i= left-1;
		int pivot = arr[right];
		for(int j=left;j<right;j++)
		{
			if(arr[j]<pivot)
			{
				i+=1;
				int temp = arr[j];
				arr[j] = arr[i];
				arr[i] = temp;
			}
		}
		int temp = arr[i+1];
		arr[i+1] = pivot;
		arr[right] = temp;
		return i+1;
	}
	public static void quickSort(int[] arr,int leftIndex,int rightIndex)
	{
		if(leftIndex>=rightIndex)
			return;

		int partition = partitionIndex(arr,leftIndex,rightIndex);
		quickSort(arr,leftIndex,partition-1); 	// Sorting left of pivot
		quickSort(arr,partition+1,rightIndex); 	// Sorting right of pivot
	}
	public static void main(String args[])
	{
		int[] arr = {5,10,7,1,2,11,25,6};
		quickSort(arr,0,arr.length-1);
		System.out.print(Arrays.toString(arr));
	}
}