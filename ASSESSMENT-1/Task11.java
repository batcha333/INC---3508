import java.util.Scanner;

public class Task11
{
	public static void convert(int meter,int ts)
	{
		float ms = ((float)meter/(float)ts);
		System.out.println("Your speed in meters/second is "+ms);
		float khr = ms * 18/5;
		float mhr = khr / 1.609f;
		System.out.println("Km/hr "+khr);
		System.out.println("M/hr "+mhr);
	}
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Distance in meters: ");
		int meter = in.nextInt();
		System.out.println("Input hour: ");
		int hr = in.nextInt();
		System.out.println("Input mins: ");
		int min = in.nextInt();
		System.out.println("Input secs: ");
		int sec = in.nextInt();
		convert(meter,hr*60*60+min*60+sec);		
	}
}