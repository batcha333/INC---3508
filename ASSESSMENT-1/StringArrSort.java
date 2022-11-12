import java.util.*;
public class StringArrSort
{
	public static void main(String[] args)
	{
		String[] names = {"Tharun","Muthu","Dinesh","Venky","Faa","Natu","Kee"};
		/*for(int i=0;i<names.length;i++)
		{
			for(int j=i+1;j<names.length;j++)
			{
				if(names[i].compareTo(names[j])>0)
				{
					String temp = names[i];
					names[i]=names[j];
					names[j]=temp;
				}
			}
		}*/
	Arrays.sort(names);
	System.out.print(Arrays.toString(names));
 	}
}