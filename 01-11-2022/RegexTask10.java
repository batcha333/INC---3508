import java.util.*;
import java.util.regex.*;
public class RegexTask10
{
	public static void main(String[] args)
	{
		int count = 0;
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a number with decimal points: ");
		String str = in.next();
		Pattern p = Pattern.compile("(?<=\\.)\\d+");
		Matcher m = p.matcher(str);
		if(m.find())
		{
			System.out.print("Length : "+(m.end()-m.start()));
		}
	}
}
