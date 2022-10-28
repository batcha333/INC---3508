public class SubArraySum
{
	static void lenOfLongSubarr(int[] arr,int k,int n)
	{
		int start=0,end=0,sum=0,max=0;
		for(int i=1;i<n;i++)
		{
			sum += arr[start]+arr[i];
			if(sum==k)
			{
				end = i;
				start = start;
				int len = end - start;
				if(max < len)
				{
					max = len;
				}
				start +=1;
			}
		}
		System.out.print("Maximum : "+max);
	}
	public static void main(String[] args)
	{
		int[] array = {10,5,2,7,1,9};
		int k = 15;
		int size = array.length;
		lenOfLongSubarr(array,k,size);
	}
}