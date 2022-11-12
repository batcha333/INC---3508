import java.util.*;
public class Keypad
{
	static String method(String a, String b)
	{
		System.out.println(a+" "+b);
		return a+b;
	}
	public static void main(String[] args)
	{	
		Scanner in = new Scanner(System.in);
		int[] intArray = {1,2,3,4,5,6,7,8,9};
		String[] strArray = {"","abc","def","ghi","jkl","mno","pqrs","tuv","xyz"};
		System.out.print("Enter a string : ");
		String str = in.nextLine();
		char[] s = str.toCharArray();
		if(s.length==1 && s[0]==' '){System.out.println("[]");}
		int[] a = new int[s.length];
		for(int i=0;i<a.length;i++)
		{
			a[i] = s[i]-'0';
		}
		System.out.println(s);
		for(int i=0;i+1<s.length;i++)
		{
			System.out.println("Answer : "+method(strArray[a[i]],strArray[a[i+1]]));
		}
	}
}