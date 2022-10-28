import java.util.*;
public class UnionOf2Arrays
{
	static int[] LOOKUP = new int[10000];
	static int m = 10,n=2;
	public static boolean contains(int e,int l)
	{
		for(int i=0;i<l;i++)
		{
			if(LOOKUP[i]==e){return true;}
		}
		return false;
	}
	public static void main(String[] args)
	{
		int[] a ={1,2,2,4,5,6,7,8,9,10};
		int[] b ={85,2};
		int k=0;
		int count=0;
		for(int i=0;i<m;i++)
		{
			if(!contains(a[i],m))
			{
				LOOKUP[k++]=a[i];
				System.out.print(a[i]+" ");
				count++;	
			}
			else{
				continue;
			}
		}
		for(int i=0;i<n;i++)
		{
			if(!contains(b[i],n))
			{
				LOOKUP[k++]=a[i];
				System.out.print(b[i]+" ");
				count++;	
			}
			else{
				continue;
			}
		}
		System.out.print("Count is : "+count);	
	}
}