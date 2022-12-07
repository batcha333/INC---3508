public class SlidingWindow
{
	static void print(int[] a,int l,int r)
	{
		for(int i=l;i<=r;i++)	
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	public static void main(String[] args)
	{
		int[] array = {1,2,3,4,5};	
		int n = array.length;
		for(int i=0;i<n;i++)
		{
			int left = 0,right = i;
			while(right<n)
			{
				print(array,left,right);
				left++;right++;
			}
		}
	}
}