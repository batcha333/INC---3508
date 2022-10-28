public class FloidTriPattern
{
	public static void main(String[] args)
	{
		int row,col;
		for(row=5;row>=1;row--)
		{
			for(col=0;col<=5-row;col++)
			{
				System.out.print(row+col);
			}
			System.out.println();
		}
	}
}