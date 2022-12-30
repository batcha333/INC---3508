import java.util.*;
import java.util.regex.*;
public class Arrange
{
	public static void main(String[] args)
	{
		String[] month = {"JAN","FEB","MAR","APR","MAY","JUN","JUL","AUG","SEP","OCT","NOV","DEC"};
		Scanner in = new Scanner(System.in);
		System.out.println("Enter number  : ");
		int n = in.nextInt();
		String[] para = new String[n];
		System.out.print("Enter lines : ");
		in.nextLine();
		for(int i=0;i<n;i++)
		{
			para[i] = in.nextLine();
		}
		int[] year = new int[n];
		int index = 0;
		int[] mon = new int[n];
		for(String s : para)
		{
			Pattern pattern = Pattern.compile("[0-9]{4}");
			Matcher matcher = pattern.matcher(s);
			System.out.println(matcher.group());
				
		}
		Arrays.sort(year);
		System.out.println(Arrays.toString(year));
	}
}