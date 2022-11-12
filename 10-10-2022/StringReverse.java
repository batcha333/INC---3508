import java.util.*;
public class StringReverse
{
	public static void PerformReverse(String s)
	{
		StringBuilder newString = new StringBuilder(s);
		newString.reverse();
		System.out.println("Reverse String is "+ newString.toString());
		String revString="";
		char s1[] = s.toCharArray();
		for (int i=s1.length-1;i>=0;i--)
		{
			revString+=s1[i];
		}
		System.out.println("Reverse String using iteration : "+revString);
	}
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a string : ");
		String str = in.nextLine();
		PerformReverse(str);
	}
}