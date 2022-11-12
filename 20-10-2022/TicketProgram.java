import java.util.*;
public class TicketProgram
{
	static int ticketCost;		
	public int calculateTicketPrice(int age,char choice)
	{
		if(choice=='y' || choice=='Y'){ticketCost=30;}
		else	ticketCost=40;
		if(age>=65){return ticketCost/2;}
		if(age<5){return ticketCost*0;}
		return ticketCost;
	}
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter Customer age : ");
		int age = in.nextInt();
		System.out.print("Is customer a resident of Warren county (y/n): ");
		char choice = in.next().charAt(0);
		TicketProgram obj = new TicketProgram();
		System.out.println("Ticket price : "+obj.calculateTicketPrice(age,choice)+"$");
	}
}