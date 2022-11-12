import java.util.*;
public class RemoveZero
{
	public static void main(String args[])
	{
		int[] array = {1,2,3,4,5,0,23,0,56,0,0,8,7};
		int len = array.length;
		int[] temp = new int[len]; 
		int k =0;
		for (int i=0;i<len;i++)
		{
			if(array[i]!=0)
			{
				temp[k++] = array[i];
			}
		}
		for(int i=0;i<k;i++){System.out.print(temp[i]+" ");}
		//System.out.print(Arrays.toString(temp));
	}
}