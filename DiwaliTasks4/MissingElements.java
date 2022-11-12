import java.util.*;
public class MissingElements
{
	static void findMissing(int[] arr1,int[] arr2,int n,int m)
	{
		HashMap<Integer,Integer> map = new HashMap<>();
		ArrayList<Integer> ans = new ArrayList<>();
		for(int i : arr2)
		{	
			map.put(i,1);
		}
		for(int i=0;i<n;i++)
		{
			if(!map.containsKey(arr1[i]))
			{
				ans.add(arr1[i]);
			}
		}
		System.out.println(ans);
	}
	public static void main(String[] args)
	{
		int[] array1 = {1,2,3,4,5,10};
		int[] array2 = {2,3,1,0,5};
		int n = array1.length;
		int m = array1.length;
		findMissing(array1,array2,n,m);
	}
}