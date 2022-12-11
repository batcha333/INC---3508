import java.util.*;
public class BankApplication {
	public static void main(String args[]) {
      	Scanner in=new Scanner(System.in);
      	System.out.print("Dear Customer, Please enter your name...");
      	String sname=in.nextLine();
      	System.out.print("Enter you Account Number: ");
      	String sid=in.nextLine();
      	BankAccount obj1=new BankAccount(sname,sid);
      	obj1.showMenu();
    	}
}
class BankAccount{
	int balance;
	int previousTransaction;
    	String customerName;
    	String customerId;

    	BankAccount(String cname,String cid){
     		customerName=cname;
        	customerId=cid;
    	}
    	void deposit(int amount){
      	if(amount!=0)
		{
            	balance=balance+amount;
            	previousTransaction=amount;
			System.out.println("Amount successfully credited in you account...");
                  System.out.println("----------------------------------\n");
        	}
    	}
    	void withdraw(int amount){
        	if(amount!=0 && balance+500>=amount)
		{
            	balance=balance-amount;
            	previousTransaction=-amount;
                  System.out.println("Amount successfully debited from your account...");
                 	System.out.println("----------------------------------\n");
        	}
		else
		{
			System.out.println("Amount can't be Debited, Minimum Amount balance must be maintained!!");
			System.out.println("----------------------------------\n");
		}
    	}
    	void getPreviousTransaction(){
        	if(previousTransaction > 0)
		{
            	System.out.println("Deposited: "+previousTransaction);
        	}
        	else if(previousTransaction <0)
		{
            	System.out.println("Withdraw: "+Math.abs(previousTransaction));
        	}
        	else 
		{
            	System.out.println("No Transaction occured");
        	}
    	}
    	void showMenu()
	{
        	char option='\0';
        	Scanner in=new Scanner(System.in);
        	System.out.println("Welcome "+customerName);
        	System.out.println("Your ID is "+customerId);
        	System.out.println("\n");
        	System.out.println("A. Check Balance\nB. Deposit\nC. Withdraw\nD. PreviousTransaction\nE. Exit");

        	do{
            	System.out.println("==============================================================================================");
            	System.out.print("Enter an option: ");
            	option=in.next().charAt(0);
            	System.out.println("==============================================================================================");
            	System.out.println("\n");
            	switch(option){
                	case 'A':
                    	System.out.println("----------------------------------");
                    	System.out.println("Your current Balance is: "+balance);
                    	System.out.println("----------------------------------");
                    	System.out.println("\n");
                    	break;
                	case 'B':
                    	System.out.println("----------------------------------");
                    	System.out.print("Enter an amount to deposit: ");
                    	int amount=in.nextInt();
                    	deposit(amount);
                    	break;
                	case 'C':
                    	System.out.println("----------------------------------");
                    	System.out.print("Enter an amount to withdraw: ");
                    	int amount2=in.nextInt();
                    	withdraw(amount2);
                    	break;
                	case 'D':
                    	System.out.println("----------------------------------");
                    	getPreviousTransaction();
                    	System.out.println("----------------------------------");
                    	System.out.println("\n");
                    	break;
                	case 'E':
                    	System.out.println("***********************************");
                    	break;
                	default:
                    	System.out.println("Invalid option!! Please enter again... ");
                    	break;
            	}
        	}
        	while(option !='E');
        	System.out.println("ThankYou for using Happay services.");
    	}
}
