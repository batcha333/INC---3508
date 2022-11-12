import java.util.*;
public class Complex
{
	int real,imaginary;
	void getInput()
	{
		System.out.print("Enter real and Imaginary values : ");
		Scanner in = new Scanner(System.in);
		real = in.nextInt();
		imaginary = in.nextInt();
	}	
	void showResult(Complex c1,Complex c2)
	{
		int realAdd = c1.real+c2.real;
		int imagAdd = c1.imaginary+c2.imaginary;
		int realSub = c1.real-c2.real;
		int imagSub = c1.imaginary-c2.imaginary;
		System.out.println("Sum of 2 complex numbers : "+realAdd+"+"+"i"+imagAdd);
		System.out.println("Difference of 2 complex numbers : "+realSub+"-"+"i"+imagSub);
	}
	public static void main(String[] args)
	{
		Complex c1 = new Complex();
		Complex c2 = new Complex();
		c1.getInput();
		c2.getInput();
		c1.showResult(c1,c2);	
	}
}