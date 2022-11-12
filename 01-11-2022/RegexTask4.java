import java.util.*;
import java.util.regex.*;
public class RegexTask4
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a string : ");
		String str = in.next();
		Pattern p = Pattern.compile(".*p.*q$");
		Matcher m = p.matcher(str);
		while(m.find())
		{
			System.out.println(m.group());
		}
	}
}