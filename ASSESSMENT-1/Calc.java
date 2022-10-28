import java.util.*;
public class Calc
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter num 1 : ");
		int num1 = in.nextInt();
		System.out.println("Enter num 2 : ");
		int num2 = in.nextInt();
		int add= num1+num2;
		int sub = num1-num2;
		int multi = num1*num2;
		int div= num1/num2;
		int mod= num1%num2;
		System.out.println(num1+"+"+num2+"="+add);
		System.out.println(num1+"-"+num2+"="+sub);
		System.out.println(num1+"*"+num2+"="+multi);
		System.out.println(num1+"/"+num2+"="+div);
		System.out.println(num1+"%"+num2+"="+mod);
	}
}