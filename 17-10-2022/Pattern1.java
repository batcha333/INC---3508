public class Pattern1
{
	public static void main(String args[])
	{
		pattern1(5);
	}
	static void pattern1(int n)
	{
		for(int row=1;row<2*n;row++)
		{
			int noOfColumns = row>n?(2*n)-row:row;
			for(int col=1;col<=noOfColumns;col++)
			{
				System.out.print("*"+" ");
			}System.out.println();
		}
	}
}