import java.util.*;
import java.util.regex.*;
public class RegexTask9
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a string : ");
		String str = in.next();
		String regex = "[AEIOUaeiou]";
		String newStr = str.replaceAll(regex,"");
		System.out.print("New String : "+newStr);
		in.close();
	}
}