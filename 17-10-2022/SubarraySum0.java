import java.util.*;
public class SubarraySum0
{
	public static boolean checkSum(int[] arr)
	{
		Set<Integer> set = new HashSet<Integer>();
		int sum = 0;
		for(int i=0;i<arr.length;i++)
		{
			sum+=arr[i];
			if(sum==0   || arr[i]==0 || set.contains(sum))	return true;
			set.add(sum);
		}
		return false;
	}
	public static void main(String args[])
	{
		int[] arr={3,2,1,9,6};
		if(checkSum(arr)){System.out.print("True");}
		else System.out.print("False");
	}
}