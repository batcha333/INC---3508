import java.util.*;
public class SubString
{
	static boolean check(char[] s1,char[] s2,int l,int r)
	{
		for(int i=0,j=l;i<s2.length && j<=r;i++,j++)
		{
			if(s1[j]!=s2[i]){
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args)
	{
		int index=-1;
		int l=0,r=0;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter string : ");
		String str = in.next();
		char[] s1 = str.toCharArray();	
		System.out.println("Enter substring : ");	
		String sstr = in.next();
		char[] s2 = sstr.toCharArray();
		for(int i=0;i<s1.length;i++)
		{
			if(s1[i]!=s2[0]){continue;}
			else
			{
				l=i;
				r=i+(s2.length-1);
				//System.out.println(l+""+r);
				if(check(s1,s2,l,r))
				{
					index = i;
					break;
				}
			}
		}
		System.out.println("Index :"+index);
	}
}