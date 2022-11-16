import java.util.*;
import java.lang.Math;
public class SumOfPairs
{
	public static int partitionIdx(int[] arr,int left,int right)
	{
		int i = left-1;
		int p = arr[right];
		for(int j=left;j<right;j++)
		{
			if(arr[j]<p)
			{
				i+=1;
				int temp = arr[j];
				arr[j] = arr[i];
				arr[i] = temp;
			}
		}
		int temp = arr[i+1];
		arr[i+1] = p;
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
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the Array Elements : ");
		String str[] = in.nextLine().split(",");
		int len = str.length;
		int[] array = new int[len];
		for(int i=0;i<len;i++)
		{
			array[i] = Integer.parseInt(str[i]);
		}
		System.out.print("Enter the target sum : ");
		int target = in.nextInt();
		in.close();
		quickSort(array,0,len-1);
		//System.out.print(Arrays.toString(array));
		int l = 0,r= len-1;
		while(l<r)
		{
			if(Math.abs(array[l]+array[r])==target)
			{
				System.out.print("("+array[l]+","+array[r]+")");
				l++;
				r--;
			}
			else if(Math.abs(array[l]+array[r])<target)
			{
				l++;
			}
			else if(Math.abs(array[l]+array[r])>target)
			{
				r--;
			}
		}
		/*for(int i=0;i<len;i++)
		{
			for(int j=i+1;j<len;j++)
			{
				if(Math.abs(array[i]+array[j])==target)
				{
					System.out.print("("+array[i]+","+array[j]+") ");
				}
			}
		}*/
	}
}