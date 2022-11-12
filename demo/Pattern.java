public class Pattern
{
	public static void main(String []args)
	{
		int n=1;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");		
			}
			for(int j=1;j<=5-i;j++)
			{
				System.out.print(n++);
			}n=1;
			System.out.println();
		}
	}
}