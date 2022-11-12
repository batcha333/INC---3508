import java.util.*;
public class PrintSortAlternate
{
	Scanner in =new Scanner(System.in);
	public static int partitionIdx(int[] arr,int l,int r)
	{
		int p = arr[r];
		int i = l-1;
		for(int j=l;j<r;j++)
		{
			if(arr[j]>p)
			{
				i++;
				int temp = arr[j];
				arr[j] = arr[i];
				arr[i] = temp;
			}
		}
		i++;
		int temp = arr[i];
		arr[i] = p;
		arr[r] = temp;
		return i;
	}
	public static void quickSort(int[] arr,int left,int right)
	{
		if(left>right)
			return;
		int partition = partitionIdx(arr,left,right);
		quickSort(arr,left,partition-1);
		quickSort(arr,partition+1,right);
	}
	public int[] getInput()	
	{	
		System.out.print("Enter a array : ");	
		String str[] = in.nextLine().split(" ");
		int len = str.length;
		int[] arr = new int[len];
		for(int i=0;i<len;i++)
			arr[i] = Integer.parseInt(str[i]); 
		return arr;
	}
	public static void main(String[] args)
	{
		PrintSortAlternate obj = new PrintSortAlternate();
		int[] array = obj.getInput();
		quickSort(array,0,array.length-1);
		System.out.print(Arrays.toString(array));
		int l = 0,r= array.length-1;
		while(l<r)
		{
			System.out.print(array[l]+" "+array[r]+" ");
			l++;
			r--;
		}
	}
}