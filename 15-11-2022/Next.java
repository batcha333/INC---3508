import java.util.*;
public class Next
{
	/*
	static int element(int[] arr,int e)
	{
		for(int i=0;i+1<arr.length;i++)
		{
			if(arr[i]==e && e!=arr[arr.length-1])
				return arr[i+1];
		}	
		if(e==arr[arr.length-1])
			return -1;
		return 0;
	}
	static void nextGreater(int[] arr,int[] arr1)
	{
		Arrays.sort(arr1);
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = element(arr1,arr[i]);
			//System.out.println(arr[i]);
		}
		System.out.println(Arrays.toString(arr));
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==-1)
				System.out.print("_ ");	
			else
				System.out.print(arr[i]+" ");	
		}
		//System.out.println(Arrays.toString(arr));
		//System.out.println(Arrays.toString(arr1));
	}*/
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter an array : ");
		String[] s = in.nextLine().split(" ");
		int[] arr = new int[s.length];
		//int[] arr1 = new int[s.length];
		for(int i=0;i<s.length;i++)
		{
			arr[i] = Integer.parseInt(s[i]);
			//arr1[i] = Integer.parseInt(s[i]);
		} 
		nextGreater(arr);
		System.out.println(Arrays.toString(arr));
		nextGreater(arr,arr1);
	}
}