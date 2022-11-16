import java.util.*;

class Booking
{
	static Scanner in = new Scanner(System.in);
	static int upperBerth = 2;
	static int lowerBerth = 2;
	static int middleBerth = 2;
	static int rac = 2;
	static int waitList = 2;
	static ArrayList<Passenger> pList = new ArrayList<Passenger>();
	static Passenger p = new Passenger();

	void bookTicket()
	{	
		System.out.println("Enter Passenger Name : ");
		String name = in.nextLine();
		System.out.println("Enter Passenger Age : ");
		int age = in.nextInt(); ;
		System.out.println("Enter Berth Preference(L/M/U): ");
		char preference = in.next().charAt(0);
		p.setPassengerName(name);
		p.setPassengerAge(age);
		p.setBerthPreference(preference);
		pList.add(p);
		in.close();
	}

	void showTicket()
	{
		for(Passenger i : pList)
		{
			System.out.println("Passenger Name : "+i.getPassengerName()+"\nPassenger Age : "+i.getPassengerAge()+"\nBerth preference : "+i.getBerthPreference());
		}
	}
}
