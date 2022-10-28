public class RemoveDuplicates
{
	public static int removeDups(int arr[])
	{
		int ans[] = new int[10];
		int len = arr.length;
		for (int i=0;i<len;i++)
		{
			for(int j=i+1;j<len;j++)
			{
				if(arr[i]!=arr[j])
				{
					ans[i]=arr[i];
					//for(int k=j;k<len;k++)
					//{
					//	arr[k]=arr[k+1];
					//}
				}len--;
			}
		}return ans;
	}
	public static void main(String[] args)
	{
		int[] arr={1,1,2};
		//removeDups(arr);
		System.out.println(removeDups(arr));
	}
}