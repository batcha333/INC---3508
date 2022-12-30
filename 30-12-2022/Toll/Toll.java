import java.util.*;
public class Toll
{
	private int tollCollections;
	private ArrayList<String> tollList = new ArrayList<String>();
	public void setTollList(ArrayList<String> tollList)
	{
		this.tollList = tollList;
	}
	public ArrayList<String> getTollList()
	{
		return tollList;
	}
	public void tollRate(int amount)
	{
		tollCollections += amount;
	}
}