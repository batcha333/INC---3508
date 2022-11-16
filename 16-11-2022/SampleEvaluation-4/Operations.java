import java.util.Scanner;
public class Operations
{
	int add(int a,int b)
	{
		return a+b;
	}
	
	int sub(int a,int b)
	{
		int c = -1*b;
		return a+c;
	}
		
	int mul(int a,int b)
	{
		int count = 0; 
		if(a<0) {
			a = -a; 
			count++;}
		if(b<0){ b = -b;count++;}
		int sum = 0;
		while(b>0)
		{	
			sum += a;
			b--;	
		}
		if(count==1)sum = -sum;
		a = sum;
		return a+b;
	}

	int div(int a,int b)
	{
		int count = 0; 
		if(a<0){a = -a;count++;}
		if(b<0){b = -b;count++;}
		int c = 0;
		while(a>=b)
		{	
			a = a-b;
			c++;	
		}
		a = 0;
		if(count==1)c = -c;
		b = c;
		return a+b;
	}
	
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		Operations o = new Operations();
		System.out.println("Enter 2 numbers : ");
		int a = in.nextInt(),b=in.nextInt();
		System.out.println("Addition : "+o.add(a,b));
		System.out.println("Subtraction : "+o.sub(a,b));
		System.out.println("Multiplication : "+o.mul(a,b));
		System.out.println("Division : "+o.div(a,b));
	}
}