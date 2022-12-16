import java.io.*;
import java.util.*;

class Customer implements Serializable,Comparable<Customer>
{
	private int custId;
	private int accountNo;
	private String custName;
	private int balance;
	private String password;	

	public Customer(int custId,int accountNo,String custName,int balance,String password)
	{
		this.custId = custId;
		this.accountNo = accountNo;
		this.custName = custName;
		this.balance = balance;
		this.password = password;
	}

	public int getCustId()
	{
		return custId;
	}

	public int getAccountNo()
	{
		return accountNo;
	}
	
	public String getCustName()
	{
		return custName;
	}

	public int getBalance()
	{
		return balance;
	}
		
	public String getPassword()
	{
		return password;
	}
	
	public void setPassword(String password)
	{
		this.password = password;
	}
		
	public void setBalance(int balance)
	{
		this.balance = balance;
	}

	@Override
	public int compareTo(Customer c)
	{
		return c.balance - this.balance;
	}
}