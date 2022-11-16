class Outer
{
	public static void main()
	{

	}
	class Inner
	{
		public void print()
		{
			System.out.println("In inner class");
		}
	}
}
public class InnerClass
{
	public static void main(String args[])
	{
		Outer obj = new Outer();
		Outer.Inner obj1 = obj.new Inner();
		obj1.print();
	}
}