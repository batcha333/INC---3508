import java.util.*;
public class Mode
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a size : ");
		int n = in.nextInt();
		System.out.print("Enter an array : ");
		int[] arr = new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i] = in.nextInt();
		}
		int[] LOOKUP = new int[10];
		for(int i : arr)
			LOOKUP[i]++;
		int max = Integer.MIN_VALUE,value = 0;
		for(int i=0;i<LOOKUP.length;i++)
		{
			if(LOOKUP[i]>max)
			{
				max = LOOKUP[i];
				value = i;
			}	
		}
		System.out.println("Mode  : "+value);
	}
}