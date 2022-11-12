import java.util.Scanner;
class Rectangle
{
	private int length,breadth;
	public void setArea(int l,int b)
	{
		length = l;
		breadth = b;
	}
	public int getArea()
	{
		//System.out.println("lb"+length+" "+breadth);
		return length*breadth*2;
	}
}
public class RectangleClass
{
	public static void main(String args[])
	{
		Rectangle r = new Rectangle();
		Scanner in =new Scanner(System.in);
		System.out.print("Enter Length and Breadth Parameters: ");
		int length = in.nextInt();
		int breadth = in.nextInt();
		r.setArea(length,breadth);
		System.out.print("Area is : "+r.getArea());
	}
}