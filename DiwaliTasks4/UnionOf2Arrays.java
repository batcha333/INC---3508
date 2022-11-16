import java.util.*;
public class UnionOf2Arrays
{
	static Scanner in = new Scanner(System.in);
	int[] getInput(int size)
	{
		System.out.print("Enter Array elements : ");
		int[] array = new int[size];
		for(int i=0;i<size;i++)
		{
			array[i] = in.nextInt();
		}
		return array;
	}
	void findUnion(int[] arr1,int[] arr2,int n,int m)
	{
		boolean[] check = new boolean[10];
		int size = (n>m)?n:m;
		int[] newArray = new int[n+m];
		int k = 0;
		for(int i=0;i<size;i++)
		{
			if(i<n)
			{
				if(!check[arr1[i]])
				{
					check[arr1[i]] = true;
					newArray[k++] = arr1[i];
				}
			}
			if(i<m)
			{
				if(!check[arr2[i]])
				{
					check[arr2[i]] = true;
					newArray[k++] = arr2[i];
				}
			}
		}
		Arrays.sort(newArray);
		System.out.print("Answer :  ");
		for(int i : newArray)
		{
			if(i>0){System.out.print(i+" ");}
		}
	}
	public static void main(String args[])
	{
		UnionOf2Arrays union = new UnionOf2Arrays();
		System.out.print("Enter array1 size : ");
		int n = in.nextInt();
		int[] array1= union.getInput(n);
		System.out.print("Enter array2 size : ");
		int m = in.nextInt();
		int[] array2= union.getInput(m);
		union.findUnion(array1,array2,n,m);
	}
}