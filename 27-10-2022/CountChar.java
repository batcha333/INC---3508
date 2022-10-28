import java.util.*;
public class CountChar
{
	String printCharCount(char[] array,int len)
	{
		String newStr ="";
		int i=0;	
		while(i<len)
		{
			char c = array[i];
			int count = 1;
			while(i+1<len && c==array[i+1])
			{
				count++;
				i++;
			}
			newStr += count+""+c+"";
			i++;
		}
		return newStr;
	}
	public static void main(String[] args)
	{	
		CountChar c = new CountChar();
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a string : ");
		String str = in.next();
		char[] charArray = str.toCharArray();
		//System.out.print(Arrays.toString(array));
		System.out.print("String : "+c.printCharCount(charArray,charArray.length));
	}
}