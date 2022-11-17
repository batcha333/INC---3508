import java.util.*;
public class CountCharPattern
{
	String countChar(String str)
	{
		String newStr ="";
		int i=0;
		while(i<str.length())
		{
			int count = 1;
			char c = str.charAt(i);
			while(i+1<str.length() && c==str.charAt(i+1))
			{
				count++;
				i++;
			}
			newStr += count+""+c;
			i++;
		}
		return newStr;	
	}
	public static void main(String[] args)
	{
		CountCharPattern ccp = new CountCharPattern();
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the range : ");
		int n = in.nextInt();
		String current = "1";
		System.out.println(current);
		for(int i=1;i<n;i++)
		{
			current = ccp.countChar(current);
			System.out.println(current);
		}
	}
}