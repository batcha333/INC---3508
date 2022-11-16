// Find the Maximum product of a triplet in array using Quick Sort in java.
import java.util.*;
public class MaxProductTriplet
{
	public static int partitionIdx(int[] arr,int left,int right)
	{
		int i = left-1;
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
	public static void quickSort(int[] arr,int leftIdx,int rightIdx)
	{
		if(leftIdx>=rightIdx){return;}
		int partition = partitionIdx(arr,leftIdx,rightIdx);
		quickSort(arr,leftIdx,partition-1);
		quickSort(arr,partition+1,rightIdx);
	}
	public static void main(String args[])
	{
		Scanner in= new Scanner(System.in);
		System.out.println("Enter the Array Elements : ");
		String str[] = in.nextLine().split(" ");
		int len = str.length;
		int[] array = new int[len];
		for(int i=0;i<len;i++)
		{
			array[i]=Integer.parseInt(str[i]);
		}
		in.close();
		//System.out.println(Arrays.toString(array));
		quickSort(array,0,array.length-1);
		int size = array.length-1;
		int firstMax = array[size],secondMax= array[size-1],thirdMax = array[size-2];
		int firstMin = array[0],secondMin= array[1];
		int product1 = firstMax * secondMax * thirdMax;
		int product2 = firstMax * firstMin * secondMin;
		if(product1>product2)
		{
			System.out.println("Max product : "+product1);
			System.out.print(firstMax +","+ secondMax +","+ thirdMax);
		}
		else
		{
			System.out.println("Max product : "+product2);
			System.out.print(firstMin +","+ secondMin +","+ firstMax);
		}
	}
}