public class LongestPrefix
{
	static String printPrefix(String[] strs)
	{
		String newStr = "";
		int i=0,j=0;
		while(i<strs[0].length())
		{
			char currentChar = strs[0].charAt(i);
			while(i>=strs[i].length() ||strs[j].charAt(i)!=currentChar)
			{
				return newStr;
			}
			j++;
			newStr += currentChar;
			i++;
		}return newStr;
	}
	public static void main(String[] args)
	{
		String[] strs = {"flower","flow","float"};
		System.out.print("Prefix : "+printPrefix(strs));
	}
}