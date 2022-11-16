public class AsciiPrint
{
	public static void main(String  args[])
	{
		int c= 65;
		for(int i=1;i<=5;i++)
		{
			for(int j=0;j<(5-i);j++)
			{
				System.out.print(" ");
			}
			for(int k=0;k<i;k++)
			{
				System.out.print((char)(c+k));
			}
			System.out.println();
		}
	}
}