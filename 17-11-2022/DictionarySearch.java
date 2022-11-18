import java.util.*;
public class DictionarySearch
{
	boolean isPresent(String s,char[][] str)
	{
		int count = 1;
		for(int i=0;i<str.length;i++)
		{
			for(int j=0;j<str[i].length;j++)
			{
				if(str[i][j]==s.charAt(0))
				{
					for(int k=1;k<s.length();k++)
					{
						if(i<str.length-1 && str[i+1][j]==s.charAt(k))			//search down
						{
							count++;
							i++;
						}
						else if(j<str[i].length-1 && str[i][j+1]==s.charAt(k))		//search right
						{
							count++;
							j++;
						}
					}
				}		
			}	
		}
		return (count==s.length());
	}
	
	public static void main(String[] args)
	{
		DictionarySearch ds = new DictionarySearch();
		Scanner in = new Scanner(System.in);
		/*System.out.print("Enter range : ");
		int n = in.nextInt();
		System.out.print("Enter matrix : ");
		char[][] str =  new char[n][n];
		for(int i=0;i<str.length;i++)
		{
			for(int j=0;j<str[i].length;j++)
			{
				str[i][j] = in.next();
			}
		}*/
		char[][] str = {{'a','z','o','l'},{'n','x','h','o'},{'v','y','i','v'},{'o','r','s','e'}};
		String[] dictionary = {"van","zoho","love","are","is"};
		for(int i=0;i<dictionary.length;i++)
		{
			if(ds.isPresent(dictionary[i],str))
				System.out.println(dictionary[i]);
		}
		in.close();
	}
}