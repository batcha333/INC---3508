import java.util.*;
public class Distance
{
	int distance1,distance2;
	void getDistanceInput()
	{
		System.out.print("Enter 2 distance values : ");
		Scanner in = new Scanner(System.in);
		distance1 = in.nextInt();
		distance2 = in.nextInt();
	}
	float showTotalDistance()
	{
		float totalDistance = distance1+distance2;
		//float distance = totalDistance%12.0f;
		totalDistance = totalDistance/12.0f;
		return totalDistance; 
	}
	public static void main(String[] args)
	{
		Distance d = new Distance();
		d.getDistanceInput();
		System.out.print("Total Distance (in-feet):"+d.showTotalDistance());
	}
}