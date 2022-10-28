import java.lang.*;
public class MaxSumOfSubArray
{
	static void maximumSum(int[] array,int n)
	{
		int maxNow = array[0],minNow = array[0],max = array[0];
		for(int i=1;i<n;i++)
		{
			if(array[i]<0)
			{
				int temp = maxNow;
				maxNow = minNow;
				minNow = temp;
			}
			maxNow = Math.max(array[i],array[i]*maxNow);
			minNow = Math.min(array[i],array[i]*minNow);
			max = Math.max(max,maxNow);
			System.out.println(max);
		}
		System.out.print("Maximum subARray : "+max);
	}
	public static void main(String[] args)
	{
		int[] arr = {5,10,-2,6,1};
		maximumSum(arr,arr.length);
	}
}

