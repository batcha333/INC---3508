public class Passenger
{
	private char berthPreference;
	private String passengerName;
	private int passengerAge;
	public void setBerthPreference(char berthPreference)
	{
		this.berthPreference = berthPreference;
	}
	public char getBerthPreference()
	{
		return berthPreference;
	}
	public void setPassengerName(String passengerName)
	{
		this.passengerName = passengerName;
	}
	public String getPassengerName()
	{
		return passengerName;
	}
	public void setPassengerAge(int passengerAge)
	{
		this.passengerAge = passengerAge;
	}
	public int getPassengerAge()
	{
		return passengerAge;
	}
}