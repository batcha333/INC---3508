import java.util.Scanner;
public class PatternStar
{
	public static void printStar(int range)
	{
		for(int j=0;j<range;j++)
		{
			System.out.print("* ");
		}
	}
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter row count : ");
		int rows = in.nextInt();
		int mid = (rows+1)/2;
		for(int i=1;i<=rows;i++)
		{
			if(i<mid)
			{
				printStar(2*i-1);
			}
			else
			{
				printStar(rows-2*(i%mid));
			}
			System.out.println();
		}
	}
}