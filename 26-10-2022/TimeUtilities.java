import java.util.*;
public class TimeUtilities
{
	int hour,minute,second;
	int showTotalSeconds()
	{
		int totalSeconds = hour*60*60 + minute*60 + second;
		return totalSeconds;
	}
	void getInput()
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter hour : ");
		hour = in.nextInt();
		System.out.print("Enter minute : ");
		minute = in.nextInt();
		System.out.print("Enter second : ");
		second = in.nextInt();
	}
	public static void main(String args[])
	{
		TimeUtilities t = new TimeUtilities();
		t.getInput();
		System.out.print("Total Seconds : "+t.showTotalSeconds());
	}
}