public class Pattern4
{
	public static void pattern4(int n)
	{
		for(int row = 1;row<=n;row++)
		{
			for(int space=n-row;space>=0;space--)
			{
				System.out.printf(" ");
			}
			for(int col=1;col<=row;col++)
			{
				System.out.printf("$ ");
			}System.out.println();
		}
	}
	public static void main(String[] args)
	{
		int n = 4;
		pattern4(n);
	}
}