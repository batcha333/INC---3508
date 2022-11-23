import java.util.*;
public class EqualDifferenceString
{
	boolean check(String str)
	{
		int l=1,r=str.length()-2;
		while(l<=r)
		{
			int lsum = Math.abs(str.charAt(l)-str.charAt(l-1));
			int rsum = Math.abs(str.charAt(r)-str.charAt(r+1));
			if(lsum!=rsum)
			{
				return false;
			}
			l++;
			r--;
		}
		return true;
	}
	public static void main(String[] args)
	{
		EqualDifferenceString e = new EqualDifferenceString();
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a string : ");
		String str = in.next();
		if(e.check(str)){System.out.print("Equal Difference");}
		else{System.out.print("Unequal Difference");}
	}
}