import java.util.Scanner;
public class Adjacent
{
	static void print(String s1,String s2,int l,int r)
	{
		for(int i=l;i<r;i++)
		{
			System.out.print(s1.charAt(i));
		}
		System.out.print("-");
		for(int i=l;i<r;i++)
		{
			System.out.print(s2.charAt(i));
		}
		
	}
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter string 1 : ");
		String s1 = in.next();
		char[] a = s1.toCharArray();
		System.out.println("Enter string 2 : ");
		String s2 = in.next();
		char[] b = s2.toCharArray();
		int left=0,right=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=b[i])
			{
				left = i;
				for(int j=left;j<a.length;j++)
				{
					if(a[j]==b[j])
						right = j;
						break;
				}
				print(s1,s2,left,right);
			}
		}
	}
}