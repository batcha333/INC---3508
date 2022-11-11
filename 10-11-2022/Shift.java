import java.util.*;
public class Shift
{
	public static void main(String[] args)	
	{
		int[] array = {1,0,2,3,0,4,5,0};
		for(int i=0;i+1<array.length;i++)
		{
			if(array[i]==0)
			{
				int temp = array[i+1];
				array[i+1] = 0;
				for(int j=i+2;j<array.length;j++)
				{
					int t = temp;
					temp = array[j];
					array[j] = t;
				}i++;
			}
		}
		System.out.println(Arrays.toString(array));
	}
}