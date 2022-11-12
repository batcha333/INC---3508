import java.util.ArrayList;
import java.util.Arrays;
public class Combinations
{
	void combination(ArrayList<int[]> list,int[] temp,int[] array,int start,int end,int currentIdx,int range)
	{
		if(currentIdx == temp.length)
		{
			list.add(temp.clone());
			return;
		}
		if(start<=end)
		{
			temp[currentIdx] = array[start];
			combination(list,temp,array,start+1,end,currentIdx+1,range);
			combination(list,temp,array,start+1,end,currentIdx,range);
		}
	}
	void printList(ArrayList<int[]> list)
	{
		for(int[] i : list)
		{
			System.out.println(Arrays.toString(i)+" ");
		}
	}
	public static void main(String[] args)	
	{
		Combinations c = new Combinations();
		ArrayList<int[]> list = new ArrayList<>();
		int[] array = {1,2,3,4};
		//int range = 3;
		for(int range=0;range<=array.length;range++)
		{
			int[] temp = new int[range];
			c.combination(list,temp,array,0,array.length-1,0,range);
		}	
		c.printList(list);
	}
}