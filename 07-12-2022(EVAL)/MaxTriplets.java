import java.util.Scanner;
import java.util.Arrays;
public class MaxTriplets
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter size : ");
		int n = in.nextInt();
		System.out.print("Enter array : ");
		int[] arr = new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i] = in.nextInt();
		}
		int fMax = Integer.MIN_VALUE,sMax = Integer.MIN_VALUE,tMax = Integer.MIN_VALUE,fMin = Integer.MAX_VALUE,sMin = Integer.MAX_VALUE;
		for(int i=0;i<n;i++)
		{
			if(arr[i]<fMin)
			{
				sMin = fMin;
				fMin = arr[i];
			}
			if(arr[i]<sMin && arr[i]!=fMin)
			{
				sMin = arr[i];
			}
			if(arr[i]>fMax)
			{
				tMax = sMax;
				sMax = fMax;
				fMax = arr[i];
			}
			if(arr[i]>sMax && arr[i]!=fMax)
			{
				tMax = sMax;
				sMax = arr[i];
			}
			if(arr[i]>tMax && arr[i]!=sMax)
			{
				tMax = arr[i];
			}
		}
		System.out.println(fMin + "   " + sMin + "   " + tMax + "   " + sMax + "    " + fMax);
		int p1 = fMax * sMax * tMax;
		int p2 = fMax * fMin * sMin;
		System.out.println("Maximum Product : "+Math.max(p1,p2));
	}
}