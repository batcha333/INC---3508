import java.util.Scanner;
public class Pali
{
	static boolean isPali(String s)
	{
		String newstr ="";
		for(int i=s.length()-1;i>=0;i--)
		{
			newstr += s.charAt(i);
			//System.out.println("string : "+newstr);
			if(newstr.equals(s))
				return true;
		}
		return false;
	}
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter string 1 : ");
		String[] s1 = in.nextLine().split(" ");
		for(String s : s1)
		{
			if(!isPali(s)){System.out.println(s);}
		}
	}
}
