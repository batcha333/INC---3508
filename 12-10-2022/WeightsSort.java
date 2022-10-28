//Given a set of numbers like <10, 36, 54,89,12> we want to find sum of weights based //on the following conditions
//    1. 5 if a perfect square
//    2. 4 if multiple of 4 and divisible by 6
//    3. 3 if even number
import java.util.*;
public class WeightsSort
{
	public static void main(String[] args)
	{
		int[] arr = new int[]{10,36,54,89,12};
		int len = arr.length;
		int[] warr = new int[len];
		int t1,t2; 
		for(int i=0;i<len;i++)
		{
			warr[i] = 0;
			double sqr = Math.sqrt(arr[i]);
			if(sqr*sqr==arr[i])
			{
				warr[i]+=5;
			}
			if(arr[i]%4==0 && arr[i]%6==0)
			{
				warr[i]+=4;
			}
			if(arr[i]%2==0)
			{
				warr[i]+=3;
			}
		}
		for(int i=0;i<len;i++)
		{
			for(int j=i+1;j<len;j++)
			{
				if(warr[i]>warr[j])
				{
					t1= warr[i];
					t2= arr[i];
					warr[i]=warr[j];
					arr[i]=arr[j];
					warr[j]=t1;
					arr[j]=t2;
				}
			}
		}
		for(int i=0;i<len;i++)
		{
			System.out.print("<"+arr[i]+","+warr[i]+">");
		}
	}
}