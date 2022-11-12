public class Task2
{
	public static void main(String[] args)
	{
		int a=10,b=10;
		System.out.println("Arithmetic operators");
		System.out.println("Addition : "+(a+b));
		System.out.println("Subtraction : "+(a-b));
		System.out.println("Multiplication : "+(a*b));
		System.out.println("Division : "+(a/b));
		System.out.println("Modulo : "+(a%b));
		System.out.println("\nInc and Dec operators");
		System.out.println("Pre Increment of a: "+(++a));
		System.out.println("Post Increment of a: "+(a++));
		System.out.println("Pre Decrement of b: "+(--b));
		System.out.println("Post Decrement of b: "+(b--));
		System.out.println("\nBitwise operators");
		System.out.println("Bitwise AND of a b: "+(a&b));
		System.out.println("Bitwise EX OR of a b: "+(a^b));
		System.out.println("Bitwise OR of a b: "+(a|b));
		System.out.println("\nRelational operators");
		System.out.println("Comparing A>b: "+(a>b));
		System.out.println("Comparing A<b: "+(a<b));
		System.out.println("Comparing A>=b: "+(a>+b));
		System.out.println("Comparing A<=b: "+(a<=b));
		System.out.println("\nBitwise operators");
		System.out.println("Bitwise commplement of a: "+(~a));
		System.out.println("\nCondtional operators");
		System.out.println("Ternary of a b: "+(a==b?true:false));
	}
}