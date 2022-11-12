import java.lang.Math;
public class StringSort
{
	static int compareStrings(String word1,String word2)
	{
		for(int i=0;i<Math.min(word1.length(),word2.length());i++)
		{
			if((int)word1.charAt(i)!=(int)word2.charAt(i))
				return (int)word1.charAt(i)-(int)word2.charAt(i);
		}
		if(word1.length()!=word2.length())
			return word1.length()-word2.length();
		else return 0;
	}
	static String[] sort(String[] array)
	{
		for(int i=0;i<array.length-1;i++)
		{
			for(int j=i+1;j<array.length;j++)
			{
				if(compareStrings(array[i],array[j])>0)
				{
					String temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		return array;
	}
	public static void main(String[] args)
	{
		String[] names= {"Din","tha","Mut","faa","venk"};
		String[] sortedNames = sort(names);
		for(int i=0;i<names.length;i++)
		{
			System.out.print(sortedNames[i]+" ");
		}
	}
}