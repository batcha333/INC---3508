class Bank
{
	void calculateEmi(){}
	float calculateEmi(float interest)
	{
		return interest*2;
	}
	int calculateEmi(int interest)
	{
		return interest*2;
	}
	double calculateEmi(double interest)
	{
		return interest*2;
	}
}

public class BankPolymorphismDemo
{
	public static void main(String[] args)
	{
		Bank b = new Bank();
		System.out.println("Sbi : "+b.calculateEmi(12));
		System.out.println("IOB : "+b.calculateEmi(12.5f));
		System.out.println("Icici : "+b.calculateEmi(12.5));
	}
}