import java.util.*;
public class MaxSum
{
	static Scanner in = new Scanner(System.in);
	int[] getInput(int n)
	{
		System.out.print("Enter Array elements : ");
		int[] array = new int[n];
		for(int i=0;i<n;i++)
		{
			array[i] = in.nextInt();
		}
		return array;
	}
	int findMaxSum(int[] array, int n)
	{
		int sum = 0;
		int max = Integer.MIN_VALUE;
		for(int i=0;i<n;i++)
		{
			sum = array[i];
			for(int j=i+2;j<n;j+=2)
			{
				sum += array[j];
			}
			if(sum>max)
			{
				max = sum;
			}
		}
		return max;
	}
	public static void main(String[] args)
	{
		MaxSum m = new MaxSum();
		System.out.print("Enter Array size : ");
		int size = in.nextInt();
		int[] array = m.getInput(size);
		System.out.print("Maximum SUm : "+m.findMaxSum(array,size));
	}
}