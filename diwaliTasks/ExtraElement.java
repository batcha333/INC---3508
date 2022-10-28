import java.util.*;
public class ExtraElement
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
	int findExtra(int[] arr1,int[] arr2,int n)
	{
		for(int i=0;i<n;i++)
		{
			if(arr1[i]!=arr2[i])
			{
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args)
	{
		ExtraElement extra = new ExtraElement();
		System.out.print("Enter Array size : ");
		int size = in.nextInt();
		int[] array1 = extra.getInput(size);
		int[] array2 = extra.getInput(size-1);
		in.close();
		System.out.print("Extra element index : "+extra.findExtra(array1,array2,size));
	}
}