public class MaxSubarray
{
	static void maxSubarray(int[] array, int n)
	{
		int start=0,end=0,max=Integer.MIN_VALUE,len=0;
		for(int i=0;i<n;i++)
		{
			boolean[] check = new boolean[10];
			check[array[i]] = true;
			for(int j=i+1;j<n;j++)
			{
				if(!check[array[j]])
				{
					check[array[j]] = true;
				}
				len = j-i;
				if(len>max)
				{
					end = j-1;
					start = i;
				}
			}
		}
		System.out.print(start+" "+end);
	}
	public static void main(String args[])
	{
		int[] array = {2,5,0,2,1,4,3,6,1,0};
		int size = array.length;
		maxSubarray(array,size);
	}
}