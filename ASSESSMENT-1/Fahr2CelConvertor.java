import java.util.Scanner;
public class Fahr2CelConvertor
{
	public static void Convert(double temp)
	{
		double result = (temp-32)*5/9;
		System.out.println(temp+" degree Fahrenheit is equal to "+result+" in celsius");	
	}
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter Temperature : ");
		Double temp = in.nextDouble();
		Convert(temp);
	}
}