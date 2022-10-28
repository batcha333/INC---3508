import java.util.Scanner;
public class Min2Days
{
	public static void Calculate(long mins)
	{
		long days= mins/60/24;
		long years = days/356;
		long rem = days%365;
		System.out.println(mins+" minutes is approximately "+years+" years and "+rem+" days");
	}
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Input the number of minutes: ");
		long min = in.nextLong();
		Calculate(min);
	}
}