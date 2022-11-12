import java.util.*;
public class PalindromeString
{
	public static void CheckPalindrome(String str)
	{
		StringBuilder revString = new StringBuilder(str);
		revString.reverse();
		if(str.equals(revString.toString()))
		{
			System.out.println("Palindrome");
		}
		else 
		{
			System.out.println("Not a Palidrome");
		}
	}
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a string : ");
		String name = in.nextLine();
		CheckPalindrome(name);
	}
}