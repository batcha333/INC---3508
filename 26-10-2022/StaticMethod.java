public class StaticMethod
{
	static int a =10;
	static
	{
		System.out.println("in static block");
	}
	public static void main(String[] args)
	{
		System.out.println("A : "+a);
	}
}