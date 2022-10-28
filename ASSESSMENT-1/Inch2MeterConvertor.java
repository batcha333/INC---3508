import java.util.Scanner;
public class Inch2MeterConvertor
{
	public static void Convert2Inch(double inch)
	{
		System.out.println(inch+" inch is "+inch*0.0254+" meters "); 	
	}
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Input a value for inch : ");
		double inch = in.nextDouble();
		Convert2Inch(inch);
	}
}