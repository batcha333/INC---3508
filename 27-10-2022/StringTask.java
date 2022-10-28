public class StringTask
{
	static void printString(char c,String count)
	{
		int rep = Integer.parseInt(count);
		while(rep>0)
		{
			System.out.print(c);	
			rep--;
		}
	}
	public static void main(String[] args)
	{
		String str = "a1b10";
		int i=0;
		while (i<str.length())
		{
			String count = ""; char c=' ';
			if(str.charAt(i)>='a' && str.charAt(i)<='z')
			{
				c = str.charAt(i++);
				if(str.charAt(i)>='0' && str.charAt(i)<='9')
				{
				count += str.charAt(i++);
				if(str.charAt(i)>='0' && str.charAt(i)<='9')
					count += str.charAt(i++);
				}
			}
			printString(c,count);
		}
	}
}