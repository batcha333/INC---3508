import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class RegexTask3
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a string : ");
		String str = in.next();
		Pattern p = Pattern.compile("[a-z]_[a-z]");
		Matcher m = p.matcher(str);
		while(m.find())
			System.out.println(m.group());
		in.close();
	}
}