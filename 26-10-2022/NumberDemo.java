public class NumberDemo
{
	private static double number = 123;
	boolean isZero(double n)
	{
		if(n==0){return true;}
		return false;
	}		
	boolean isPositive(double n)
	{
		if(n>0){return true;}
		return false;
	}
	boolean isNegative(double n)
	{
		if(n<0){return true;}
		return false;
	}
	boolean isOdd(double n)
	{
		if(n%2 != 0){return true;}
		return false;
	}
	boolean isEven(double n)
	{
		if(n%2 == 0){return true;}
		return false;
	}
	boolean isPrime(double n)
	{
		for(double i=0;i<Math.sqrt(n);i++)
		{
			if(n%i == 0){return false;}
		}return true;
	}
	boolean isArmstrong(double n)
	{
		double t = n,count=0,sum=0,temp=n;
		while(t!=0)
		{
			t = t/10;
			count++;
		}
		while(temp!=0)
		{
			sum = sum + Math.pow(temp%10,count);
			temp /=10;
		}
		if(sum==n){return true;}
		return false;
	}
	double getFactorial(double n)
	{
		double fact = 1;
		for(int i=1;i<=n;i++)
		{
			fact *= i;
		}
		return fact;
	}
	double getSqrt(double n)
	{
		return Math.sqrt(n);
	}
	double getSqr(double n)
	{
		return n*n;
	}
	double sumOfDigits(double n)
	{
		int sum=0,t=(int)n;
		while(t>0)
		{
			sum += t%10;
			t/=10;
		}
		return sum;
	}
	double getReverse(double n)
	{
		int temp = (int)n;double sum =0;
		while(temp!=0)
		{
			sum = sum*10 + temp%10;
			temp /=10;
		}
		return sum;
	}
	public static void main(String[] args)
	{
		NumberDemo n = new NumberDemo();
		System.out.println("number is zero : "+n.isZero(number));
		System.out.println("Number is positive : "+n.isPositive(number));
		System.out.println("Number is Negative : "+n.isNegative(number));
		System.out.println("Number is Odd : "+n.isOdd(number));
		System.out.println("Number is Even : "+n.isEven(number));
		System.out.println("Number is Prime : "+n.isPrime(number));
		System.out.println("Number is Armstrong : "+n.isArmstrong(number));
		System.out.println("factorial : "+n.getFactorial(number));
		System.out.println("Squareroot : "+n.getSqrt(number));
		System.out.println("Square : "+n.getSqr(number));
		System.out.println("SumofDigits : "+n.sumOfDigits(number));
		System.out.println("Reverse of a number : "+n.getReverse(number));
	}
}