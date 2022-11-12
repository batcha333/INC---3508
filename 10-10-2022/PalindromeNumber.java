import java.util.*;
public class PalindromeNumber
{
	public static void CheckPalindrome(int n)
	{
		int rev=0,rem;
		int temp=n;
		while(temp>0)
		{
			rem = temp%10;
			rev = rev*10 + rem;
			temp /=10;
		}
		System.out.println(rev==n?"Palindrome Number":"Not a Palindrome");
	}
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num= in.nextInt();
		CheckPalindrome(num);
	}
}