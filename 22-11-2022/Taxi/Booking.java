class Booking
{
	private int bookingId;
	private int customerId;
	private char location;
	private char destination;
	private int pickupTime;
	private int dropTime;
	private int fare;
	private Taxi taxi;
	static int count = 0;
	public Booking(int customerId,char location,char destination,int pickupTime,Taxi taxi)
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
		this.taxi = taxi;
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
		return fare;
	}
	public int getTaxiNumber()
	{
		return taxi.getTaxiNumber();
	}
}