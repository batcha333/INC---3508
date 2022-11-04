import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class RegexTask1
{
	//string.matches() method
	boolean check(String str)
	{
		if(str.matches("^[a-zA-Z0-9]*$"))
			return true;
		return false;
	}
	//Regex class
	{}
	public static void main(String[] args)
	{
		RegexTask1 r = new RegexTask1();
		String str = "12345***abcdeABCDE";
		System.out.print("Regex : "+r.check(str));
	}
}
