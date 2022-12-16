import java.util.*;
public class Prefix
{
	public int length(String[] arr)
	{
		int l = Integer.MAX_VALUE;
		for(String s : arr)
		{
			if(s.length()<l)
				l = s.length();
		}
		return l;
	}
	public void findPrefix(String[] arr)
	{
		String newStr = "";
		int n = length(arr);
		boolean flag = true;
		for(int i=0;i<n;i++)
		{		
			char c = arr[0].charAt(i);
			for(String s : arr)
			{
				if(s.charAt(i)!=c)
				{
					flag = false;
					break;
				}	
			}
			if(!flag)
				break;
			newStr += c;
		}
		System.out.println("Ans : "+newStr);
	}
	
	public static void main(String[] args)
	{
		Prefix p = new Prefix();
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a size : ");
		int n = in.nextInt();
		String[] arr = new String[n];
		System.out.print("Enter a arr : ");
		for(int i=0;i<n;i++)
		{
			arr[i] = in.next();
		}
		p.findPrefix(arr);
	}
}