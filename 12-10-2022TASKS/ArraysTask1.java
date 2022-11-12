public class ArraysTask1
{
	int add(int a,int b)
	{
		return a+b;
	}
	int add(int a,int b,int c)
	{
		return a+b+c;
	}
	int add(int a,int b,int c,int d)
	{
		return a+b+c+d;
	}
	public static void main(String args[])
	{
		ArraysTask1 obj = new ArraysTask1();
		System.out.println("Add 2 num : "+obj.add(1,2));
		System.out.println("Add 3 num : "+obj.add(1,2,3));
		System.out.println("Add 4 num : "+obj.add(1,2,3,4));
	}
}