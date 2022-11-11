import java.util.*;
public class Pairs
{	
	static boolean check(int[] arr)
	{
		if(arr.length%2!=0) return false;
		Arrays.sort(arr);
		int c = 0; 
		for(int i=0;i<arr.length;i+=2)
		{
			if(arr[i] != arr[i+1])
				return false;u
		}
		return true;
	}
	public static void main(String[] args)
	{
		int[] arr = {2,2,3,3,2,2};
		System.out.print("Pairs : "+check(arr));
	}
}