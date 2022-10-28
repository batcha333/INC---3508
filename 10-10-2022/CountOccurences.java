import java.util.*;
public class CountOccurences
{
	public static void CheckDuplicates(String str)
	{
		int count;
		char strArr[] = str.toCharArray();
		for(int i=0;i<strArr.length;i++)
		{
			count=1;
			for(int j=i+1;j<strArr.length;j++)
			{
				if(strArr[i]==strArr[j] && strArr[i]!=' ')
				{
					count++;
					strArr[j]='0';
				}
			}
			if(count>=1 && strArr[i]!='0')
			{
				System.out.print(strArr[i]+count);
			}
		}
	}
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a string : ");
		String str = in.nextLine();
		CheckDuplicates(str);
	}
}