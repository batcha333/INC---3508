import java.util.*;
public class CharAtPosition
{
	char charAtPosition(char[] arr,int p)
	{
		char empty = '0';
		for(int i=0;i<arr.length;i++)
		{
			if(i==p-1){return arr[i];}
		}
		return empty;
	}
	public static void main(String[] args)
	{
		CharAtPosition cp = new CharAtPosition();
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a string : ");
		String str = in.nextLine();
		char[] arr = str.toCharArray();
		System.out.print("Enter a position : ");
		int p = in.nextInt();
		System.out.println("Char at Position "+p+" is "+cp.charAtPosition(arr,p));
		in.close();
	}
}