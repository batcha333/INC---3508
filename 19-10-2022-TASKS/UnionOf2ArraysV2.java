import java.util.*;
public class UnionOf2ArraysV2
{
	static boolean[] LOOKUP = new boolean[10000];
	static int m = 5,n=3;
	public static void main(String[] args)
	{
		int[] a ={1,2,3,4,5};
		int[] b ={1,2,3};
		int k=0;
		int count=0;
		for(int i=0;i<m;i++)
		{
			if(!LOOKUP[a[i]])
			{
				LOOKUP[a[i]]=true;
				System.out.print(a[i]+" ");
				count++;	
			}
		}
		for(int i=0;i<n;i++)
		{
			if(!LOOKUP[b[i]])
			{
				LOOKUP[b[i]]=true;
				System.out.print(b[i]+" ");
				count++;	
			}
		}
		System.out.print("Count is : "+count);	
	}
}