import java.util.*;
public class PreviousMax
{
	void printMax(int[] array,int n)
	{
		int max = array[0];
		ArrayList<Integer> list = new ArrayList<>();
		list.add(max);
		for(int i=1;i<n;i++)
		{
			if(array[i]>max)
			{
				max = array[i];
				list.add(max);
			}
		}
		System.out.print(list);
	}
	public static void main(String[] args)
	{
		PreviousMax p = new PreviousMax();
		int[] array = {2,-3,-4,5,9,7,8};
		p.printMax(array,array.length);
	}
}