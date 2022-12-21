import java.util.*;
public class DivisibleString
{
	public boolean check(String t,String u)
	{
		int r1 = t.length()/u.length();
		String s1="";
		for(int i=0;i<r1;i++)
		{
			s1 = s1+u;
			if(s1.equals(t)){
				return true;		
			}
		}
		return false;
	}

	public void find(String s,String t)
	{
		String u = "";
		for(int i=0;i<t.length();i++)
		{
			u += t.charAt(i);
			if(check(t,u)){
				System.out.println("UUUUUUUUUUUUUU : "+u);
				break;
			}
		}
		int l1 = s.length()/u.length();
		String s1="";
		for(int i=0;i<l1;i++)
		{
			s1 = s1+u;
			if(s1.equals(s)){
				System.out.println("S string : "+""+u+" "+(i+1));		
			}
			else if(s1.equals(t)){
				System.out.println("T string : "+""+u+" "+(i+1));		
			}
		}
	}
	
	public static void main(String[] args)
	{
		DivisibleString d = new DivisibleString();	
		Scanner in = new Scanner(System.in);
		boolean flag = true;
		System.out.print("Enter a string s : ");
		String s = in.next();
		System.out.print("Enter a string t : ");
		String t = in.next();
		int l1 = s.length();
		int l2 = t.length();
		int r = l1/l2;
		String newStr = "";
		for(int i=0;i<r;i++)
		{
			newStr = newStr+t; 
			if(newStr.equals(s)){
				d.find(s,t);
				flag = true;
			}
			else
				flag=false;
		}
		
		if(flag==false)
			System.out.println("-1");
	}
}