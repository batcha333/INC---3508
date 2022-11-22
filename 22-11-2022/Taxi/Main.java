import java.util.*;
public class Main
{
	static Scanner in = new Scanner(System.in);
	int freeTaxi()
	{
		Taxi[] taxi = new Taxi[4];
		boolean[] bool = new boolean[4];
		s
	}
	
	void taxiBooking(ArrayList<Booking> bookList)
	{
		System.out.print("Enter Customer ID : ");
		int id = in.nextInt();
		Taxi taxi = new Taxi();
		//taxi.setTaxiNumber(taxi.freeTaxi());
		taxi.setTaxiNumber(1);
		System.out.print("Enter Location (A/B/C/D/E/F): ");
		char from = in.next().charAt(0);
		if(from<'A' || from>'F')
		{
			System.out.print("Wrong Choice, Enter Correct Location : ");
			from = in.next().charAt(0);
		}
		System.out.print("Enter Destination (A/B/C/D/E/F): ");
		char to = in.next().charAt(0);
		if(to<'A' || to>'F')
		{
			System.out.print("Wrong Choice, Enter Correct Destination : ");
			to = in.next().charAt(0);
		}
		System.out.print("Enter Pickup Time : ");
		int pick = in.nextInt();
		bookList.add(new Booking(id,from,to,pick,taxi));
	}

	void showDetails(ArrayList<Booking> bookList)
	{
		System.out.println();
		if(bookList.size()>0)
		{
			System.out.println("Booking ID\tCustomerId\tFrom\tTo\tPickupTime\tDropTime\tAmount");
			for(Booking i: bookList)
			{
				if(i.getTaxiNumber()==1)
				{
					System.out.println("TAXI - 1");
					System.out.println(i.getBookingId()+"\t\t"+i.getCustomerId()+"\t\t"+i.getLocation()+"\t"+i.getDestination()+"\t"+i.getPickupTime()+"\t\t"+i.getDropTime()+"\t\t"+i.getFare());
				}
			}
		}
		else
		{
			System.out.println("Book List is empty!");
		}
	}

	public static void main(String[] args)
	{	
		Main m = new Main();
		boolean flag = true;
		ArrayList<Booking> bookList = new ArrayList<Booking>();
		while(flag)	
		{
			System.out.println("\n<.................TAXI BOOKING SYSTEM.................>\n");
			System.out.print("MENU : \n1.Book a Taxi\n2.Display Taxi Details\n3.Exit\n\nEnter your choice : ");
			int choice  = in.nextInt();
			switch(choice)
			{
				case 1 : m.taxiBooking(bookList);System.out.println("Taxi can be Alloted");break;
				case 2 : m.showDetails(bookList);break;
				case 3 : flag = false;break;
				default : System.out.println("\nChoice Invalid, Enter correct choice!! ");
			}
		}
		in.close();
	}
}