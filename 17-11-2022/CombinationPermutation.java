import java.util.*;
public class CombinationPermutation
{
	void combination(List<char[]> list,char[] str,char[] temp,int s,int e,int c,int r)
	{
		if(c == temp.length)
		{
			list.add(temp.clone());
			return;
		}
		if(s<=e)
		{
			temp[c] = str[s];
			combination(list,str,temp,s+1,e,c+1,r);
			combination(list,str,temp,s+1,e,c,r);
		}
	}	

	void print(List<char[]> list)
	{
		for(char[] i: list)
		{
			System.out.println(Arrays.toString(i));
		}
	}

	void printPermute(char[] str)
	{		
		System.out.print("[");
		for(int i=0;i<str.length;i++)
		{
			System.out.print(str[i]);
			if(i<str.length-1)
				System.out.print(", ");
		}System.out.print("]");
		System.out.println();
	}

	void swap(char[] str,int a,int b)
	{
		char temp = str[a];
		str[a] = str[b];
		str[b] = temp;
	}

	void permute(char[] str,int idx)
	{
		CombinationPermutation c = new CombinationPermutation();
		if(idx==str.length-1)
		{
			printPermute(str);
			return;
		}
		for(int i=idx;i<str.length;i++)
		{
			swap(str,i,idx);
			c.permute(str,idx+1);
			c.swap(str,i,idx);
		}
	}

	public static void main(String[] args)
	{
		CombinationPermutation c = new CombinationPermutation();
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a string : ");
		String s = in.next();
		char[] str = s.toCharArray();
		List<char[]> list = new ArrayList<>();
		for(int r=0;r<str.length;r++)
		{
			char[] temp = new char[r];
			c.combination(list,str,temp,0,str.length-1,0,r);
		}
		c.print(list);
		c.permute(str,0);
	}
}