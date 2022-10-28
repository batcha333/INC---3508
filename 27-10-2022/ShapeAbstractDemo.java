abstract class Shape
{
	abstract int area(int a,int b);
}
class Rectangle extends Shape
{
	int area(int length,int breadth)
	{
		int area = length*breadth;
		return area;
	}
}
class Triangle extends Shape
{
	int area(int breadth,int height)
	{
		int area = (breadth * height)/2;
		return area;
	}
}
public class ShapeAbstractDemo
{
	public static void main(String[] args)
	{
		Shape sr = new Rectangle();
		Shape st = new Triangle();
		System.out.println("Area of rectangle : "+sr.area(4,5));
		System.out.println("Area of Triangle : "+st.area(4,5));
	}
}