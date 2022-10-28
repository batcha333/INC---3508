abstract class Bank
{
	abstract int getBalance(); 
}
class BankA extends Bank
{
	int getBalance()
	{
		int balance = 100;
		return balance;
	}	
}
class BankB extends Bank
{
	int getBalance()
	{
		int balance = 150;
		return balance;
	}
}
class BankC extends Bank
{
	int getBalance()
	{
		int balance = 200;
		return balance;
	}
}
public class BankAbstractDemo
{
	public static void main(String[] args)
	{
		Bank b1 = new BankA();
		Bank b2 = new BankB();
		Bank b3 = new BankC();
		System.out.println("Bank A balance : "+b1.getBalance());
		System.out.println("Bank A balance : "+b2.getBalance());
		System.out.println("Bank A balance : "+b3.getBalance());
	}
}