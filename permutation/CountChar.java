import java.util.*;
public class CountChar
{
	static void countChar(String str,int n)
	{
		String newStr = "";
		int i = 0;
		while(i<n)
		{
			int count = 1;
			char c = str.charAt(i);
			while(i+1<n && c==str.charAt(i+1))
			{
				count++;
				i++;
			}
			newStr += count+""+c;
			i++;
		}
		System.out.print("Answer : "+newStr);
	}
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a string : ");
		String str = in.next();
		countChar(str,str.length());
	}
}