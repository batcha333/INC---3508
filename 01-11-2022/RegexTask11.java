import java.util.*;
import java.util.regex.*;
public class RegexTask11
{
	public static void main(String[] args)
	{
		int count = 0;
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a number: ");
		String str = in.next();
		Pattern p = Pattern.compile("[0-9]*");
		Matcher m = p.matcher(str);
		if(m.find() && m.end()==4 || m.end()==6 || m.end()==8)
		{
			System.out.print("Can be a PinNumber"); 
			return;
		}
		System.out.print("Not a pinNumber"); 
	}
}
