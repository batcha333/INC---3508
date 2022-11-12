import java.util.*;
import java.lang.Math;
public class SumOfPairs
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the array elements : ");
		String strArray[] = in.nextLine().split(",");
		int len = strArray.length;
		int[] array = new int[len];
		System.out.print("Enter a targetSum : ");
		int target = in.nextInt();
		in.close();
		for(int i=0;i<len;i++)
			array[i] = Integer.parseInt(strArray[i]);
		Arrays.sort(array);
		int left=0,right=len-1;
		while(left<right)
		{
			if(Math.abs(array[left]+array[right])==target){
				System.out.print("("+array[left]+","+array[right]+")");
				left++;
				right--;	
			}
			else if(Math.abs(array[left]+array[right])<target)
				left++;
			else right--;
		}
	}
}