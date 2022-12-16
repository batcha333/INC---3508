import java.util.*;
import java.io.*;

public class Main
{	
	static Scanner in = new Scanner(System.in);	
	static SerializationClass sc = new SerializationClass();

	boolean validatePassword(String s)
	{
		if(s.length()<5)
		{
			System.out.println("PassWord must have minimum length of 6");
			return false;
		}
		if(!s.matches(".*[a-z]{2}.*"))
		{
			System.out.println("PassWord must have 2 lowerCase letters");
			return false;
		}
		if(!s.matches(".*[A-Z]{2}.*"))
		{
			System.out.println("PassWord must have 2 upperCase letters");
			return false;
		}
		return true;
	}

	String encryptPassword(String s)
	{
		char[] arr = s.toCharArray();
		String pass = "";
		int index = 0;
		for(char c : arr)
		{
			if(c=='9'){c=(char)(47);}
			else if(c=='z'){c=(char)(96);}
			else if(c=='Z'){c=(char)(64);}
			pass += (char)(c+1);
		}
		return pass;
	}

	String decryptPassword(String s)
	{
		char[] arr = s.toCharArray();
		String pass = "";
		int index = 0;
		for(char c : arr)
		{
			if(c=='0'){c=(char)(58);}
			else if(c=='z'){c=(char)(98);}
			else if(c=='Z'){c=(char)(66);}
			pass += (char)(c-1);
		}
		return pass;
	}

	void withdraw(ArrayList<Customer> list,Customer cust)
	{
		System.out.print("Enter withdraw amount : ");
		int amount = in.nextInt();
		for(Customer c : list)
		{
			if(c.getCustId()==cust.getCustId())
			{
				if(c.getBalance()-amount>1000)
				{
					System.out.println("------------------------------------------------------");
					System.out.println("Amount Withdrawn Successfully!");
					c.setBalance(c.getBalance()-amount);
					System.out.println("------------------------------------------------------");
				}
				else
				{
					System.out.println("------------------------------------------------------");
					System.out.println("Amount can't be withdrawn!-> Low Minimum balance");	
					System.out.println("------------------------------------------------------");
				}
			}
		}
		sc.doSerialization(list);
	}

	void deposit(ArrayList<Customer> list,Customer cust)
	{
		System.out.print("Enter Deposit amount : ");
		int amount = in.nextInt();
		for(Customer c : list)
		{
			if(c.getCustId()==cust.getCustId())
			{
				c.setBalance(c.getBalance()+amount);
				System.out.println("------------------------------------------------------");
				System.out.println("Amount Deposited Successfully!");
				System.out.println("------------------------------------------------------");
			}
		}
		sc.doSerialization(list);
	}

	void transfer(ArrayList<Customer> list,Customer cust)
	{
		boolean flag = false;
		System.out.print("Enter Recepient Id : ");
		int rId = in.nextInt();
		System.out.print("Enter Recepient Name : ");
		String rName = in.next();
		for(Customer c : list)
		{
			if((c.getCustId()==rId) && (c.getCustName().equals(rName)))
			{
				System.out.print("Enter Deposit amount : ");
				int amount = in.nextInt();
				if(cust.getBalance()-amount>=1000)
				{
					c.setBalance(c.getBalance()+amount);
					cust.setBalance(cust.getBalance()-amount);
					System.out.println("------------------------------------------------------");
					System.out.println("Amount Transferred Successfully!");
					System.out.println("------------------------------------------------------");
				}
				else
				{
					System.out.println("------------------------------------------------------");
					System.out.println("Amount can't be Transferred!-> Low Minimum balance");
					System.out.println("------------------------------------------------------");
				}
				flag = true;
			}
		}
		if(flag==false)
			System.out.println("Recepient can't be found!!!");
		sc.doSerialization(list);
	}

	void transaction(ArrayList<Customer> list,Customer cust)
	{
		System.out.println("\nWelcome to Transacations!");
		boolean flag = true;		
		while(flag)
		{
			System.out.print("\n1.ATM Withdrawl\n2.Cash Deposit\n3.Account Transfer\n4.Exit\n5.Show All\nEnter your choice : ");	
			int choice = in.nextInt();
			switch(choice)
			{
				case 1 : withdraw(list,cust);break;
				case 2 : deposit(list,cust);break;
				case 3 : transfer(list,cust);break;	
				case 4 : flag = false;break;
				case 5 : showCustomers();break;
				default : System.out.println("Enter Valid Choice !!!");customerUtils(list,cust);break;
			}
		}
	}

	void changePassword(ArrayList<Customer> list,Customer cust)
	{
		System.out.println("Enter new PassWord : ");
		String pass = in.next();
		for(Customer c : list)
		{
			if(c.getCustId()==cust.getCustId())
			{
				String password = encryptPassword(pass);
				c.setPassword(password);
			}
		}
		sc.doSerialization(list);
	}

	void customerUtils(ArrayList<Customer> list,Customer cust)
	{	
		boolean flag = true;
		for(Customer c : list)
		{
			if(c.getCustId()==cust.getCustId())
			{
				while(flag)
				{
					System.out.print("\nCustomer Menu -->\n1.Change Password\n2.Transactions\n3.Exit\nEnter your choice : ");
					int choice = in.nextInt();
					switch(choice)
					{
						case 1 : changePassword(list,cust);break;
						case 2 : transaction(list,cust);break;
						case 3 : flag = false;break;
						default : System.out.println("Enter Valid Choice !!!");customerUtils(list,cust);break;
					}
				}
			}
		}
	}

	void authenticateCustomer()
	{
		System.out.print("Please, Enter your Name : ");
		String name = in.next();
		String pass = "";
		System.out.print("Please, Enter your Password : ");
		String password = in.next();
		ArrayList<Customer> list = sc.doDeSerialization();
		for(Customer c : list)
		{
			//System.out.println(c.getCustName());
			if(c.getCustName().equals(name))
			{
				pass = decryptPassword(c.getPassword());
				if(password.equals(pass))
				{
					System.out.println("Welcome "+c.getCustName());
					customerUtils(list,c);
				}
				else
				{
					System.out.println("Wrong password! PLease try again!");
					authenticateCustomer();
				}
			}
		}
	}

	void showTopCustomers()
	{
		System.out.println();
		System.out.print("Enter a number  : ");
		int n = in.nextInt();
		ArrayList<Customer> list = sc.doDeSerialization();
		Collections.sort(list);
		System.out.println("\nOur Top "+n);
		System.out.println("CusId\tAccountNo\tName\tBalance\tEncryptedPwd");
		System.out.println("----------------------------------------------------");
		for(int i=0;i<n;i++)
		{
			Customer c = list.get(i);
			System.out.println(c.getCustId()+"\t"+c.getAccountNo()+"\t\t"+c.getCustName()+"\t"+c.getBalance()+"\t"+c.getPassword());
		}
	}	

	void showCustomers()
	{
		ArrayList<Customer> list = sc.doDeSerialization();
		System.out.println("CusId\tAccountNo\tName\tBalance\tEncryptedPwd");
		System.out.println("----------------------------------------------------");
		for(Customer c : list)
		{
			System.out.println(c.getCustId()+"\t"+c.getAccountNo()+"\t\t"+c.getCustName()+"\t"+c.getBalance()+"\t"+c.getPassword());
		}
	}

	void addCustomerData(String name, String password)
	{
		ArrayList<Customer> list = sc.doDeSerialization();
		int id = list.get(list.size()-1).getCustId() + 11;
		int acc = list.get(list.size()-1).getAccountNo() + 11011;
		Customer cust = new Customer(id,acc,name,10000,password);
		sc.doSerialization(cust);
	}
	
	void addCustomer()
	{
		System.out.println("Welcome New Customer!!!");
		System.out.print("Please, Enter your Name : ");
		String name = in.next();
		String password = "";
		System.out.print("Please, Enter your Password : ");
		String p1 = in.next();
		System.out.print("Please, Re-Enter your Password : ");
		String p2 = in.next();
		if(p1.equals(p2))
		{
			if(validatePassword(p1))
			{
				password = encryptPassword(p1);	
				addCustomerData(name,password);	
			}
		}
		else
		{
			System.out.println("An error occured, Please enter valid username & password(on both boxes)!!!");
			addCustomer();
		}
	}

	void showMenu()
	{
		boolean flag = true;
		while(flag)
		{
			System.out.print("\nMENU --->\n1.Add new Customer\n2.Show Customers\n3.Login(Authentication)\n4.Top -n Customers\n5.Exit\nEnter your choice : ");
			int choice = in.nextInt();
			switch(choice)				
			{
				case 1 : addCustomer();break;
				case 2 : showCustomers();break;
				case 3 : authenticateCustomer();break;
				case 4 : showTopCustomers();break;
				case 5 : System.out.println("ThankYou!!!");flag = false;break;
				default : System.out.println("Enter Valid Choice !!!");showMenu();break;
			}
		}
	}

	public static void main(String[] args)
	{
		System.out.println("\t\t\t\tBank Application\n");
		Main m = new Main();
		ArrayList<Customer> custList =  new ArrayList<>();
		custList.add(new Customer(11,11011,"Kumar",10000,"ApipNbjm"));
		custList.add(new Customer(22,22022,"Madhu",20000,"Cbolijoh"));
		custList.add(new Customer(33,33033,"Rahul",30000,"dbnqvt"));
		custList.add(new Customer(44,44044,"Robin",40000,"kbwb22"));
		sc.doSerialization(custList);
		m.showMenu();
		//m.showCustomers();
	}
}