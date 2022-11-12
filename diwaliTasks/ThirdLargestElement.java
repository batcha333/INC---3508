import java.util.*;
public class ThirdLargestElement
{
	static Scanner in = new Scanner(System.in);
	int[] getInput(int n)
	{	
		System.out.print("Enter Array elements : ");
		int[] array = new int[n];
		for(int i=0;i<n;i++)
		{
			array[i] = in.nextInt();
		}
		return array;
	}
	public static int partition(int[] array,int left,int right)
	{
		int pivot = array[right];
		int  j = left-1;
		for(int i=left;i<right;i++)
		{
			if(array[i]<pivot)
			{
				j++;
				int temp = array[i];
				array[i] = array[j];
				array[j] = temp;
			}
		}
		j++;
		int temp = array[j];
		array[j] = pivot;
		array[right] = temp;
		return j;
	}
	public static void quickSort(int[] array,int left,int right)
	{
		if(left>=right)
			return;
		int partitionIdx  = partition(array,left,right);
		quickSort(array,left,partitionIdx-1);
		quickSort(array,partitionIdx+1,right); 
	}
	int thirdLargest(int[] array, int n)
	{
		if(n<3){return -1;}
		return array[n-3];
	}
	public static void main(String[] args)
	{
		ThirdLargestElement third = new ThirdLargestElement();
		System.out.print("Enter Array size : ");
		int size = in.nextInt();
		int[] array = third.getInput(size);
		quickSort(array,0,size-1);
		System.out.print("THird Largest ELment : "+third.thirdLargest(array,size));
	}
}