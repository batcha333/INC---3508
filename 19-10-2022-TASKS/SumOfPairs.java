import java.util.*;
public class SumOfPairs
{
	static int n=4, k=2;
	public static void main(String[] args)
	{
		int[] array={1,1,1,1};
		Arrays.sort(array);
		int count=0;
		int l=0,r=array.length-1;
		//while(l<r)
		//{
		//	if(array[r] <=k)
		//	{
		//		if(array[l]+array[r]==k)
		//		{
		//			count++;
		//			l++;
		//		}
		//	}
		//	else
		//	{
		//		r--;
		//	}
		//	
		//}
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(array[i]+array[j]==k)
				{
					count++;
				}
				else if(array[i]+array[j]>k)
				{
					break;
				}
			}
		}
		System.out.print("Count : "+count);
	}
}