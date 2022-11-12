public class EqualString
{
	static String concat(String[] s,int l)
	{
		String newStr = "";
		int i=0;
		while(l!=0)
		{
			l-=1;
			newStr += s[i];
			i++;
		}
		return newStr;
	}
	boolean equalString(String[] s1,String[] s2)
	{
		String str1 = concat(s1,s1.length);
		String str2 = concat(s2,s2.length);
		if(str1.equals(str2)){return true;}
		return false;
	}
	public static void main(String args[])
	{
		EqualString str = new EqualString();
		String[] word1 = {"ac","b"};
		String[] word2 = {"a","bc"};
		if(str.equalString(word1,word2)){System.out.print("true");}
		else System.out.print("false");
	}
}