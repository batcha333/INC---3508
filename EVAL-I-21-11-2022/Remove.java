import java.util.*;
public class Remove
{	
	void remove(char[] str)
	{
		boolean[] LOOKUP = new boolean[126];
		String newStr = "";
		for(int i=0;i<str.length;i++)
		{
			if(!LOOKUP[str[i]])
			{
				LOOKUP[str[i]] = true;
				newStr += str[i];
			}
		}
		System.out.print("Answer : "+newStr);
	}
	public static void main(String[] args)
	{	
		Remove r = new Remove();
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String s = in.next();
		char[] str = s.toCharArray();
		r.remove(str);
	}
}
