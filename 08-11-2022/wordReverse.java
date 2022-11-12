public class wordReverse
{
	static void reverse(String s,int l,int r)
	{
		for(int i=r;i>=l;i--)
		{
			System.out.print(s.charAt(i)+"");
		}
		System.out.print(" ");
	}
	public static void main(String[] args)
	{
		String str = "Hello World";
		int l = 0,r = 0;
		for(int i=0;i<str.length()-1;i++)
		{
			if(str.charAt(i)==' ')
			{
				r = i-1;
				reverse(str,l,r);
				l = i+1;
				r=str.length()-1;
			}
		}
		//System.out.print(l+""+r);
		reverse(str,l,r);
	}
}