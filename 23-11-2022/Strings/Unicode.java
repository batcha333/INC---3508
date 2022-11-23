import java.util.*;
public class Unicode
{
	char check(String str,int u)
	{
		char empty = '0';
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==(char)u)
				return str.charAt(i);	
		}
		return empty;
	}
	public static void main(String[] args)
	{
		Unicode uc = new Unicode(); 
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a string : ");
		String str = in.nextLine();
		System.out.print("Enter a unicode point : ");
		int u = in.nextInt();
		System.out.println("Unicode character : "+uc.check(str,u));
		in.close();
	}
}