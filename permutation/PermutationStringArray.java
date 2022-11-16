import java.util.*;
public class PermutationStringArray
{
	static List<String> list = new ArrayList<>();
	static void printArray(String[] array)
	{
		System.out.println();
		for(int i=0;i<array.length;i++)
		{
			System.out.print(array[i]);
			list.add(array[i]);
		}
	}
	static void swap(String[] array,int a,int b)
	{
		String temp = array[a];
		array[a] = array[b];
		array[b] = temp;
	}
	static void printPermutation(String[] array,int index)
	{
		if(index == array.length-1)
		{
			printArray(array);
			return;
		}
		for(int i=index;i<array.length;i++)
		{
			swap(array,i,index);
			printPermutation(array,index+1);
			swap(array,i,index);
		}
	}
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter array of strings : ");
		String[] array = in.nextLine().split(" ");
		int len = array.length,j=0;
		printPermutation(array,0);
		String[] ans = new String[list.size()/len];
		String str = "";
		System.out.println("New string : "+list);
		System.out.print("Array: "+Arrays.toString(ans));
	}
}