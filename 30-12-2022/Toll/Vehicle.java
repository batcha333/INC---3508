import java.util.*;
public class Vehicle
{
	private String type;
	private String number;
	private boolean vip;
	private ArrayList<String> logList = new ArrayList<String>();
	public Vehicle(String type,String number,boolean vip)
	{
		this.type = type;
		this.number = number;
		this.vip = vip;
	}
	public void setType(String type)
	{
		this.type = type;
	}
	public String getType()
	{
		return type;
	}
	public void setNumber(String number)
	{
		this.number = number;
	}
	public String getNumber()
	{
		return number;
	}
	public void setVip(boolean vip)
	{
		this.vip = vip;
	}
	public boolean getVip()
	{
		return vip;
	}
	public void setLogList(ArrayList<String> logList)
	{
		log.add(s);
	}
}