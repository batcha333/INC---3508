import java.util.Scanner;
public class Circle
{
	static double pi = 3.141592653589793238;
	public static void main(String[] args)
	{
		Scanner in= new Scanner(System.in);
		System.out.print("Radius : ");
		double radius= in.nextDouble();
		double perimeter = 2*pi*radius;
		double area = pi*radius*radius;
		System.out.println("Perimeter : "+perimeter);
		System.out.println("Area : "+area);
	}
}