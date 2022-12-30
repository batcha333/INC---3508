import java.util.*;
public class Add
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a number : ");
		String s1 = in.next();
		System.out.print("Enter a number : ");
		String s2 = in.next();
		int i=s1.length()-1,j=s2.length()-1;
		String ans = "";
		int carry = 0,sum = 0;
		while(i>=0 || j>=0)
		{
			if(i>=0 && j>=0)
			{
				sum = (int)(s1.charAt(i)-48) + (int)(s2.charAt(j)-48) + carry;
			}
			else if(i>=0 && !(j>=0))
			{
				sum = (int)(s1.charAt(i)-48) + carry;
			}
			else if(!(i>=0) && j>=0)
			{
				sum = (int)(s2.charAt(j)-48) + carry;
			}
			ans = sum%10+ans;
			carry = sum/10;
			i--;j--;
		}
		if(carry>0)
			ans = carry+ans;
		System.out.println(ans);
	}
}