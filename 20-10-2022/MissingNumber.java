import java.util.*;
public class MissingNumber
{	
	static int n=5;
	static boolean[] check = new boolean[10];
	public static void main(String[] args)
	{
		int[] array = {1,2,3,5};
		int sum =0;
		for(int i=0;i<array.length;i++)
		{
			if(!check[array[i]])
			{
				check[array[i]]=true;
			}
			sum += array[i];
		}
		for(int i=1;i<n;i++)
		{
			if(check[i]==false)
			{
				System.out.println("Missing number (bool):"+i);
			}
		}
		System.out.println("Missing Numbr  : "+((n*(n+1)/2)-sum));
	}
}