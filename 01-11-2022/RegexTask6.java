import java.util.*;
import java.util.regex.*;
public class RegexTask6
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a string : ");
		String str = in.next();
		Pattern p = Pattern.compile("\\w*");
		Matcher m = p.matcher(str);
		while(m.find())
		{
			System.out.println(m.group());
		}
	}
}