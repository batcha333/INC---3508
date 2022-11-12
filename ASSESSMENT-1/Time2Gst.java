import java.util.Scanner;
public class Time2Gst
{
	public static void perform(long hrs)
	{
		long millisec = System.currentTimeMillis();
		long totalSeconds = millisec /1000;
		long currentSecond = totalSeconds %60;
		long totalMinutes = totalSeconds /60;
		long currentMinutes = totalMinutes % 60;
		long totalHrs = totalMinutes / 60;
		long currentHrs = ((totalHrs+hrs)%24);
		System.out.printf("Current Time is %2d:%2d:%2d",currentHrs,currentMinutes,currentSecond);
	}
	public static void main(String[] args)
	{
		System.out.println("Input the time zone offset to GMT: ");
		Scanner in = new Scanner(System.in);
		long hrs = in.nextLong();
		perform(hrs);		
	}
}