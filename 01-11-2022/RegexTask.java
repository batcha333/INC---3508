import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class RegexTask
{
	public static void main(String[] args)
	{
		String str = "12345*+-+";
		String number = "";
		Pattern p = Pattern.compile("\\w"); //d -> for digits //w->alphabets(including numbers) //W->special characters
		Matcher m = p.matcher(str);
		while(m.find()) 
		{
			//System.out.println(m.group());
			number += m.group();
		}
		System.out.print("Numbers :"+number);
		
	}
}