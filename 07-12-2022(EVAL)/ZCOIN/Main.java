import java.util.*;
public class Main
{
	static Scanner in = new Scanner(System.in);
	int zId = 1;

	public boolean isValidPassword(String s1,String s2,String s3)	
	{
		/*if(!s1.matches(".*\\d+.*"))
		{
			System.out.print("Must have a single digit!");
			return false;
		}*/
		if(!s1.matches(".*[a-zA-Z0-9]+.*"))
		{
			System.out.print("Must have a single AlphaNumeric!");
			return false;
		}
		if(s1.length()<8)	
		{
			System.out.print("Must have 8 or more character!");
			return false;
		}
		if(!s1.matches(".*[!,#,%,<,>,&,*]+.*"))	
		{
			System.out.print("Must have special char!");
			return false;
		}
		if(s1.matches(s2))
		{
			System.out.print("Mustn't contain Username in it!");
			return false;
		}
		if(s1.matches(s3))
		{
			System.out.print("Mustn't contain Usermail in it!");
			return false;
		}
		return true;
	}

	public void createUser(ArrayList<User> list)
	{
		System.out.println();
		System.out.print("Enter User Name : ");
		String name = in.next();
		//System.out.println();
		System.out.print("Enter User Mail : ");
		String mail = in.next();
		System.out.print("Enter User Number : ");
		int number = in.nextInt();
		System.out.print("Enter User ID : ");
		int id = in.nextInt();
		String pass;
		do
		{
			System.out.print("Enter User password : ");
			pass = in.next();
		}while(!isValidPassword(pass,name,mail));
		System.out.print("Enter Initial RC Deposit : ");
		int deposit = in.nextInt();
		list.add(new User(name,mail,number,id,pass,deposit));
	}
	
	public void showUser(ArrayList<User> list)
	{	
		int i = 1;
		System.out.println("\nUsers List : \n");
		if(list.isEmpty())
		{
			System.out.println("No Users to show!!!\n");
		}
		else
		{
			System.out.println("SNo.   UserName\t  UserMail\tUserNumber\tUserId\tRCD\tZ-ID\tZCW");
			for(User u : list)
			{
				double wallet = 0;
				if(u.getZId()!=0)
				{
					wallet = 78.50*(double)(u.getRcDeposit());
				}
				u.setZWallet(wallet);
				System.out.println((i++)+" .\t"+u.getUserName()+"\t"+u.getUserMail()+"  "+u.getUserNumber()+"\t  "+u.getUserId()+"\t"+u.getRcDeposit()+"\t"+u.getZId()+"\t"+u.getZWallet());
				if(u.getZId()!=0)
				{
					int j = 0;
					String newStr =  j++ + " .\t"+u.getUserName()+"\t"+u.getUserMail()+"  "+u.getUserNumber()+"\t"+u.getUserId()+"\t"+u.getRcDeposit()+"\t"+u.getZId()+"\t"+u.getZWallet();
					u.history.add(newStr);
				}
			}
		}
	}

	public void showHistory(ArrayList<User> list,int id)
	{		
		if(list.isEmpty()){System.out.println("No Data available in the list!! :(");return;}
		for(User u : list)
		{
			if(u.getUserId()==id)
			{
				for(String s : u.history)
				{
					System.out.println(s);
				}
			}
			else
			{
				System.out.println("User can't be found!!!");
			}	
		}
	}
	
	public void acceptRequest(ArrayList<User> list)
	{
		showUser(list);
		System.out.println("\nEnter User Id : ");
		int id = in.nextInt();
		for(User u : list)
		{
			if(u.getUserId()==id)
			{
				u.access = true;
				u.setZId(zId++);
			}
		}
	}	

	public void showDenied(ArrayList<User> list)
	{
		System.out.println("\nUnAccepted Users List : \n");
		int i =1;
		if(list.size()<1)
		{
			System.out.println("No Requests Yet!!!\n");
		}
		else
		{
			for(User u : list)
			{
				if(!u.access)
				{
					System.out.println((i++)+". "+u.getUserName()+"\t\t"+u.getUserMail()+"\t\t"+u.getUserNumber()+"\t\t"+u.getUserId()+"\t\t"+u.getRcDeposit());
				}
			}
		}
	}

	public void employeeUtilities(ArrayList<User> list)
	{
		boolean flag = true;
		while(flag)
		{
			System.out.print("\nStaff Utilities \n1. Accept Request\n2. Show Unaccepted Users\n3. Exit\nEnter Your choice : ");
			int c = in.nextInt();
			switch(c)
			{
				case 1 : acceptRequest(list);break;
				case 2 : showDenied(list);break;
				case 3 : flag = false;break;
				default : System.out.println("Enter valid choice!!"); 
			}
		}
		
	}

	public void userUtilities(ArrayList<User> list,int id)
	{
		boolean flag = true;
		while(flag)
		{
			System.out.print("\nEmployee Utilities \n1. Balance History\n2. Exit\nEnter Your choice : ");
			int c = in.nextInt();
			switch(c)
			{
				case 1 : showHistory(list,id);break;
				case 2 : flag = false;break;
				default : System.out.println("Enter valid choice!!"); 
			}
		}
		
		
	}

	public void employeeLogin(ArrayList<User> list)
	{
		System.out.println();
		Zemployee z = new Zemployee();
		System.out.print("Enter Employee Mail : ");
		String mail = in.next();
		System.out.print("Enter Employee Password : ");
		String pass = in.next();
		if(!pass.equals(z.getPassword()) || !mail.equals(z.getEmpMail()))
		{
			System.out.print("Entered Wrong Details, please check and re-enter again :(\n");
			System.out.print("Enter Employee Mail : ");
			mail = in.next();
			System.out.print("Enter Employee Password : ");
			pass = in.next();
		}
		if(mail.equals(z.getEmpMail()) && pass.equals(z.getPassword()))
		{
			System.out.println("\nWelcome Ms."+z.getEmpName());
			employeeUtilities(list);
		}
	}

	public void userLogin(ArrayList<User> list)
	{
		if(list.isEmpty()){System.out.println("No details stored!!!");return;}
		else
		{
			System.out.println();
			System.out.print("Enter User Mail : ");
			String mail = in.next();
			System.out.print("Enter User Password : ");
			String pass = in.next();
			for(User u : list)
			{
				if(!mail.equals(u.getUserMail()) && !pass.equals(u.getPassword()))
				{
					System.out.print("Invalid Id or Password!");
					userLogin(list);
				}
				else if(mail.equals(u.getUserMail()) && pass.equals(u.getPassword()))
				{
					if(!u.access)
					{
						System.out.println("You dont have Z-Employee Permission to go forward, Please Wait until your request is accepted!!!");
					}
					else
					{
						System.out.println("Welcome To Z-Coin Exchange "+u.getUserName());
						userUtilities(list,u.getUserId());
					}
				}
			}
		}
	}
	
	public void loginUser(ArrayList<User> list)
	{
		boolean flag = true;
		System.out.print("\n\nWelome to Login page\n");
		while(flag)
		{	
			System.out.print("\n1. Employee Login\n2. User Login\n3. Exit\nEnter a choice : ");
			int c = in.nextInt();
			switch(c)
			{
				case 1 : employeeLogin(list);break;
				case 2 : userLogin(list);break;
				case 3 : flag = false;break;
				default : System.out.println("Enter valid choice!!");
			}
		}
	}

	public static void main(String[] args)
	{
		ArrayList<User> list = new ArrayList<>();
		Main m = new Main();
		boolean flag = true;
		
		System.out.print("\t\t\t\tZCOIN EXCHANGE\nMENU : ");
		while(flag)
		{
			System.out.print("\n1. Create New Account\n2. Login\n3. Exit\n4. Debug->Show All Users\nEnter your choice : ");	
			int c = in.nextInt();
			switch(c)
			{
				case 1 : m.createUser(list);break;
				case 2 : m.loginUser(list);break;
				case 3 : System.out.println("Thank you!!!");flag = false;break;
				case 4 : m.showUser(list);break;
				default : System.out.println("Enter Valid Choice!!!");break;
			}
		}
	}
}