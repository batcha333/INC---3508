import java.util.*;

public class Train
{
	static Train t = new Train();
	Booking book;
	static Scanner in = new Scanner(System.in);

	void run(int choice)
	{
		System.out.println("Enter your choice : ");
		choice  = in.nextInt();
		book = new Booking();
		while(choice<=4)
		{
			switch(choice)
			{
				case 1 : 
					book.bookTicket();
					break;
				case 2 : 
					//System.out.println("Enter your TicketId : ");
					//int cId  = in.nextInt();
					//book.cancelTicket(cId);
					break;
				case 3 : 
					book.showTicket();
					break;
			}
		}
	}

	public static void main(String[] args)
	{
		System.out.println("Welcome to Railway reservation system!");
		System.out.println("1.Book Tickets\n2.Cancel Tickets\n3.Print Booked Tickets\n4.Print Available Tickets");
		int choice = 0;
		t.run(choice);
		in.close();
	}
}