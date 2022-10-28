import java.util.*;
public class FindTarget
{
	int findTarget(int[] array,int target,int len)
	{
		Arrays.sort(array);
		for(int i=0;i<len;i++)
		{
			if(array[i]==target)
			{
				return i;
			}
			else if(array[len-1]<target)
			{
				return len;
			}
			else if(array[i]<target && array[i+1]>target)
			{
				return i+1;
			}
		}return -1;
	}
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		FindTarget f = new FindTarget();
		System.out.print("Enter Array elements : ");
		String[] str = in.nextLine().split(" ");
		int len = str.length;
		int[] array = new int[len];
		for(int i=0;i<str.length;i++)
		{
			array[i] = Integer.parseInt(str[i]);
		}
		System.out.print("Enter target value : ");
		int target = in.nextInt();
		System.out.print("Target Index : "+f.findTarget(array,target,len));
	}
}