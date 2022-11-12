import java.util.Scanner;
public class RegexTask2
{
	boolean check(String str)
	{
		return str.matches("pq*?");
	}
	public static void main(String[] args)
	{
		RegexTask2 r = new RegexTask2();
		System.out.print("Enter a string : ");
		Scanner in = new Scanner(System.in);
		String str = in.next();
		System.out.println("Regex : "+r.check(str));
		in.close();
	}
}