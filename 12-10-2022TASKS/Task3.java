import java.util.Scanner;
public class Task3
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a char : ");
		char a= in.next().charAt(0);
		if(a >= 'a' && a<='z'){System.out.println(a+" is a lowercase");}
		else if(a>='A'&&a<='Z'){System.out.println(a+" is an uppercase");}
		else if(a>='0'&&a<='9'){System.out.println(a+" is an integer");}
		else{System.out.println(a+" is an Special character");}
	}
}