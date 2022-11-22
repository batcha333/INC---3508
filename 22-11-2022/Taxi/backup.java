/*//Main
import java.util.*;
public class Main
{
	static Scanner in = new Scanner(System.in);
	void taxiBooking(ArrayList<Booking> bookList)
	{
		System.out.print("Enter Customer ID : ");
		int id = in.nextInt();
		System.out.print("Enter Location : ");
		char from = in.next().charAt(0);
		System.out.print("Enter Destination : ");
		char to = in.next().charAt(0);
		System.out.print("Enter Pickup Time : ");
		int pick = in.nextInt();
		bookList.add(new Booking(id,from,to,pick));
	}
	void showDetails(ArrayList<Booking> bookList)
	{
		System.out.println();
		if(bookList.get(0)!=null)
		{
			System.out.println("Booking ID\tCustomerId\tFrom\tTo\tPickupTime\tDropTime\tAmount");
			for(Booking i: bookList)
			{
				System.out.println(i.getBookingId()+"\t\t"+i.getCustomerId()+"\t\t"+i.getLocation()+"\t"+i.getDestination()+"\t"+i.getPickupTime()+"\t\t"+i.getDropTime()+"\t\t"+i.getFare());
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
				case 1 : m.taxiBooking(bookList);break;
				case 2 : m.showDetails(bookList);break;
				case 3 : flag = false;break;
				default : System.out.println("\nChoice Invalid, Enter correct choice!! ");
			}
		}
		in.close();
	}
}*/
/* // Booking
class Booking
{
	private int bookingId;
	private int customerId;
	private char location;
	private char destination;
	private int pickupTime;
	private int dropTime;
	private int fare;
	static int count = 0;
	public Booking(int customerId,char location,char destination,int pickupTime)
	{
		this.bookingId = ++count;
		this.customerId = customerId;
		this.location = location;
		this.destination = destination;
		this.pickupTime = pickupTime;
		this.dropTime = pickupTime + (Math.abs(destination-location)*1);
		int distance = Math.abs(destination-location)*15;
		distance -= 5;
		this.fare = 100 + distance*10;	
	}
	public int getBookingId()
	{
		return bookingId;
	}
	public int getCustomerId()
	{
		return customerId;
	}
	public char getLocation()
	{
		return location;
	}
	public char getDestination()
	{
		return destination;
	}
	public int getPickupTime()
	{
		return pickupTime;
	}
	public int getDropTime()
	{
		return dropTime;
	}
	public int getFare()
	{
		int distance = Math.abs(destination-location)*15;
		distance -= 5;
		this.fare = 100 + distance*10;
		return fare;
	}
}
*/