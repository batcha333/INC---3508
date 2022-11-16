import java.util.*;
public class RemoveDuplicates
{
	public static void checkDuplicates(int[] checkArray,int len)
	{
		int[] resultArray = new int[len];
		int k=0;
		for(int t=0;t<len-1;t++)
		{
			if(checkArray[t]!=checkArray[t+1])
			{
				resultArray[k++]=checkArray[t];
			}
		}
		resultArray[k++]=checkArray[len-1];
		System.out.print(Arrays.toString(resultArray));
	}
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter array elements : ");
		String str[] = in.nextLine().split(" ");
		int len = str.length;
		int[] array = new int[len];
		for(int i=0;i<len;i++)
		{
			array[i] = Integer.parseInt(str[i]);
		}
		Arrays.sort(array);
		//System.out.print(Arrays.toString(array));
		checkDuplicates(array,len); 
	}
}