import java.util.*;
public class Median
{
	static Scanner in = new Scanner(System.in);
	int[] getInput(int size)
	{
		System.out.print("Enter Array elements : ");
		int[] arr = new int[size];
		for(int i=0;i<size;i++)
		{
			arr[i]= in.nextInt();
		}
		return arr;
	}
	void medianOfArrays(int[] array1,int[] array2,int m,int n)
	{
		
		int[] newArray = new int[m+n];
		int len = (m<n)?n:m;
		int j=0,k=0,l=0;
		for(int i=0;i<len;i++)
		{
			if(i<m)
			{
				newArray[k++] = array1[j++];
				
			}
			if(i<n)
			{		
				newArray[k++] = array2[l++];
			}
		}
		Arrays.sort(newArray);
		int x = m+n;
		int y = x/2;
		Number ans = (x!=0)?newArray[y]:(newArray[y]+newArray[y-1])/2;
		System.out.print("ans : "+(newArray[y]+newArray[y-1])/2);
		System.out.print(Arrays.toString(newArray)); 
		System.out.print("Answer : "+ans); 
	}
	public static void main(String[] args)
	{
		Median med = new Median();
		System.out.print("Enter array1 size : ");
		int m = in.nextInt();
		int[] array1 = med.getInput(m);
		System.out.print("Enter array2 size : ");
		int n = in.nextInt();
		int[] array2 = med.getInput(n);
		med.medianOfArrays(array1,array2,m,n);
	}
}