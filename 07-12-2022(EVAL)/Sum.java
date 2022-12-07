import java.util.*;
public class Sum
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a array");
		String[] str = in.nextLine().split(",");
		String newStr ="";
		for(String i : str)
		{
			newStr += i;	
		}	
		//System.out.println(newStr);
		int ans = Integer.parseInt(newStr) + 1;
		char[] result = Integer.toString(ans).toCharArray();
		for(char c : result)
		{
			System.out.print(c+",");
		}
	}
}