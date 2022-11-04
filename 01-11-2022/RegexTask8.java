import java.util.*;
import java.util.regex.*;
public class RegexTask8
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a string : ");
		String str = in.next();
		Pattern p = Pattern.compile("[p|P]ython");
		Matcher m = p.matcher(str);
		if(m.find())
		{
			System.out.println("java");
		}
		else
		{
			System.out.println("c++");
		}
	}
}