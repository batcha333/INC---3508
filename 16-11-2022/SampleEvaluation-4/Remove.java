import java.util.Scanner;
public class Remove
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a string : ");
		String str = in.next();
		int n = str.length();
		System.out.println("Enter a substring : ");
		String sub = in.next();
		char[] arr = sub.toCharArray();
		String newStr ="";
		for(int i=0;i<arr.length;i++)
		{
			int j=0;
			while(j<str.length())
			{
				if(str.charAt(j)!=arr[i])
				{
					newStr += str.charAt(j);
					j++;
					//continue;	
				}
				else
				{	
					newStr += 0;
					j++;
					//continue;
				}	
			}
			str = newStr;
		}
		char[] ansArray = str.toCharArray();
		String ans = "";
		for(int i=n;i<ansArray.length;i++)
			if(ansArray[i]!='0')
				ans += ansArray[i];
		System.out.print(ans);
	}
}
