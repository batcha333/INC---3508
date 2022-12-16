import java.util.Scanner;
public class BalanceParanthesis
{
	int index = -1;
	char[] stack;
	public static void main(String[] args)
	{
		BalanceParanthesis b = new BalanceParanthesis();
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a string : ");
		String s = in.next();
		System.out.println("True/False : "+b.balance(s));
	}
	public boolean balance(String s)
	{
		int n = s.length();
		stack = new char[n];
		char[] arr = s.toCharArray();
		for(char c : arr)
		{
			if(c=='(')
				push(')');
			else if(c=='[')
				push(']');
			else if(c=='{')
				push('}');
			else
				return pop() == c;
		}
		return stack.length==0;
	}
	public void push(char element)
	{
		stack[++index] = element;
	} 
	public int pop()
	{
		if(index==-1)
			return -1;
		return stack[index--];
	}
	
}