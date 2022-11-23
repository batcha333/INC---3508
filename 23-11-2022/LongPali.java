import java.util.*;
public class LongPali
{
	String findPali(String str)
	{
		int[] LOOKUP  = new int[26];
		String newStr = "";			
		int len = 0,max = 0;
		for(int i=0;i<str.length();i++)
		{
			LOOKUP[str.charAt(i)-97]++;
		}
		for(int i=0;i<LOOKUP.length;i++)
		{		
			if(LOOKUP[i]%2!=0 && max<LOOKUP[i])
			{
				max = LOOKUP[i];
			}
			if(LOOKUP[i]%2==0)
			{
				len += LOOKUP[i];
			}
		}
		len += max;
		char[] array = new char[len];
		int left = 0,right=len-1;
		for(int i=0;i<LOOKUP.length;i++)
		{
			if(LOOKUP[i]%2==0)
			{
				for(int j=0;j<LOOKUP[i]/2;j++)
				{
					array[left++] = (char)(i+97);
					array[right--] = (char)(i+97);
				}
			}
		}
		for(int i=0;i<LOOKUP.length;i++)
		{
			if(LOOKUP[i]==max)
			{
				for(int j=0;j<max;j++)
				{
					array[left++] = (char)(i+97);
				}
				break;
			}
		}
		newStr += new String(array);
		//System.out.println(Arrays.toString(LOOKUP));
		return newStr;
	}
	public static void main(String[] args)
	{
		LongPali l = new LongPali();
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a string : ");
		String str = in.next();
		System.out.println("Palindrome : "+l.findPali(str));
	}	
}
/*
String findPali(String str)
	{
		int[] LOOKUP  = new int[26];
		String newStr = "";			
		boolean flag = false;
		for(int i=0;i<str.length();i++)
		{
			LOOKUP[str.charAt(i)-97]++;
		}
		for(int i=0;i<LOOKUP.length;i++)
		{		
			if(LOOKUP[i]%21 && !flag)
			{
				newStr += (char)(i+97);
				flag = true;
				i=0;
			}
			if(LOOKUP[i]%2==0 && LOOKUP[i]!=0 && flag)
			{
				for(int j=0;j<LOOKUP[i]/2;j++)
				{
					newStr = (char)(i+97) + newStr + (char)(i+97);
				}
			}
		}
		//System.out.println(Arrays.toString(LOOKUP));
		return newStr;
	}
*/