import java.util.Scanner;
public class StringMethods
{
	int length(String str)
	{
		char[] strArray = str.toCharArray();
		int length = 0;
		for (char k : strArray) {++length;}
		return length;
	}
	String reverse(String str, int l)
	{
		char[] strArray = str.toCharArray();
		String revStr = "";
		for(int i=l-1;i>=0;i--)
		{
			revStr += strArray[i];
		}
		return revStr;
	}
	boolean startsWith(String str,String a)
	{
		char[] strArray = str.toCharArray();	
		char[] find = a.toCharArray();	
		if(strArray[0]==find[0])
		{
			return true;
		}
		return false;
	}
	String toUpperCase(String str)
	{
		char[] strArray = str.toCharArray();
		String upperString = "";
		for(char k : strArray)
		{
			if(k>=97 && k<=122)
				upperString += (char) (k-32);
			else
				upperString += k;
		}
		return upperString;
	}
	String toLowerCase(String str)
	{
		char[] strArray = str.toCharArray();
		String lowerString = "";
		for(char k : strArray)
		{
			if(k>=65 && k<=92)
				lowerString += (char) (k+32);
			else
				lowerString += k;
		}
		return lowerString;
	}
	String substringOfRange(String str, int l,int r)
	{
		char[] strArray = str.toCharArray();
		String subStr = "";
		for(int i=l;i<r;i++)
		{
			subStr += strArray[i];
		}
		return subStr;
	}
	boolean isEmpty(String str)
	{	
		char[] strArray = str.toCharArray();
		int l = 0;
		for (char k : strArray) {++l;}
		if(l==0)
		{
			return true;
		}
		return false;
	}
	int indexOf(String str, int l, char c)
	{
		char[] strArray = str.toCharArray();
		
		for(int i=0;i<l;i++)
		{
			if(strArray[i]==c)
			{
				return i;
			}
		}
		return -1;
	}
	char charAt(String str, int index)
	{
		char[] strArray = str.toCharArray();
		return strArray[index];
	}
	String concatString(String str1,String str2)
	{
		return str1+str2;
	}
	void methods(StringMethods s,int choice,String str)
	{
		Scanner in = new Scanner(System.in);
		int len = s.length(str);
		switch(choice)
			{
			case 1 : System.out.println("1 - Length of the given string is "+s.length(str)); break;
			case 2 : System.out.println("2 - Reverse of the given string is  "+s.reverse(str,len)); break;
			case 3 : 
				System.out.println("3 - Enter the char to be started with :");
				String findChar = in.next();
				if(s.startsWith(str,findChar))
				{
					System.out.println("Yes the String is starting with "+findChar);
					System.out.println();
				}
				else 
				{
					System.out.println("No the String isn't starting with "+findChar);
					System.out.println();
				}
				break;
			case 4 : System.out.println("4 - String to upper case : "+s.toUpperCase(str)); break;
			case 5 : System.out.println("5 - String to lower case : "+s.toLowerCase(str)); break;
			case 6 : 
				System.out.print("Give a range for the substring (start & end): ");
				int start  = in.nextInt();
				int end = in.nextInt();
				System.out.println("6 - Substring of a given range : "+s.substringOfRange(str,start,end));
				break;
			case 7 : System.out.println("7 - Check whether the string is empty : "+s.isEmpty(str));	break;
			case 8 : System.out.println("8 - Index of the given character : "+s.indexOf(str,len,'a')); break;
			case 9 :
				System.out.print("Enter an index : ");
				int index = in.nextInt();
				System.out.println("9 - Character at the given Index : "+s.charAt(str,index));
				break;
			case 10 : System.out.println("10 - Concatenate 2 strings : "+s.concatString(str,str));break;
			}
	}
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.println("<----------------------STRING METHODS--------------------->");
		System.out.print("Enter a string : ");
		String str = in.next();
		int choice = 0;
		StringMethods s = new StringMethods();
		do
		{
			System.out.println("1.String Length\n2.Reverse String\n3.Startswith\n4.To uppercase\n5.To lowercase\n6.Substring of given range\n7.Check empty\n8.Index character\n9.Character Index\n10.Concatenate 2 strings\n11.Exit");
			System.out.print("Enter your choice : ");
			choice = in.nextInt();
			s.methods(s,choice,str);
		}while(choice!=11);
		in.close();	
	}
}
	