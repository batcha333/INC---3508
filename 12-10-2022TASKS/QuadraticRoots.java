import java.util.*;
public class QuadraticRoots
{
	static double a,b,c;
	public static double determinant(double a,double b,double c)
	{
		double res = b*b - 4*a*c;
		return res;
	}
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a : ");
		double a = in.nextDouble();
		System.out.print("Enter b : ");
		double b = in.nextDouble();
		System.out.print("Enter c : ");
		double c = in.nextDouble();
		double d = determinant(a,b,c);
		if(d==0)
		{
			System.out.print("Roots are real and equal, Roots are : "+(-b/2*a)+","+(-b/2*a));
		}
		else if(d>0)
		{
			System.out.print("Roots are Real and Unequal, Roots are : "+ ((-b+Math.sqrt(d))/2*a) +" ," + ((-b-Math.sqrt(d))/2*a));
		}
		else if(d<0)
		{
			double r= -b/(2*a);
			double i= Math.sqrt(-d)/(2*a);
			System.out.print("Roots are Imaginary and unequal, Roots are : "+r+"+"+i+"i, "+r+"-"+i+"i");
		}
	}
}