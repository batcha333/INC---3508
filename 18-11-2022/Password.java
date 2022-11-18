import java.util.*;
public class Password
{
	boolean validatePassword(String s)
	{
		if(!s.matches(".*\\d+.*"))
		{
			System.out.print("Must have a single digit!");
			return false;
		}
		if(!s.matches(".*[a-z]+.*"))
		{
			System.out.print("Must have a single lowercase!");
			return false;
		}
		if(!s.matches(".*[A-Z]+.*"))
		{
			System.out.print("Must have a single uppercase!");
			return false;
		}
		if(s.length()<6)	
		{
			System.out.print("Must have 6 or more character!");
			return false;
		}
		if(s.matches(".*[/, ].*"))	
		{
			System.out.print("Mustn't have slash or space!");
			return false;
		}
		return true;
	}
	public static void main(String[] args)
	{	
		Password p = new Password();
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a string : ");
		String str = in.nextLine();
		if(p.validatePassword(str)){System.out.println("PassWord valid");}
		else{System.out.print(" PassWord Invalid");}
	}
}