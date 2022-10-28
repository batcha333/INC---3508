import java.util.*;
public class Search2DimArray
{
	public static void main(String[] args)
	{
		String name = "WELCOMETOZOHOCORPORATION";
		char str[] = name.toCharArray();
		//System.out.println(Arrays.toString(str)+" ");
		int k=0;
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{
				System.out.print(str[k]+" ");
				k++;
			}System.out.println();
		}
	}
}