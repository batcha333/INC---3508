import java.util.Scanner;
public class AdjacentPairs
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter string 1 : ");
		String s1 = in.next();
		System.out.print("Enter string 2 : ");
		String s2 = in.next();
		String newStr1 ="",newStr2="";
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)==s2.charAt(i))
			{
				if(newStr1 != "")
				{
					System.out.println(newStr1+"-"+newStr2);
					newStr1 = "";
					newStr2 = "";
				}
			}
			else
			{
				newStr1 += s1.charAt(i);
				newStr2 += s2.charAt(i);
			}
		}
		System.out.println(newStr1+"-"+newStr2);
		in.close();
	}
}