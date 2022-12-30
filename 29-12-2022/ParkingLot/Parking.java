import java.util.*;
public class Parking
{
	Vehicle[][] vehicle;
	String parkingLotName;
	int floors;
	int slots;
	int freeSlots;
	int truckFreeSlots;
	int bikeFreeSlots;
	int carFreeSlots;

	
	public void freeFilledSlots()
	{
		int c1=0,c2=0,c3=0;
		for(int i=0;i<floors;i++)
		{
			for(int j=0;j<1;j++)
				if(vehicle[i][j]==null)
					c1++;
			for(int j=1;j<4;j++)
				if(vehicle[i][j]==null)
					c2++;
			for(int j=3;j<slots;j++)
				if(vehicle[i][j]==null)
					c3++;
		}
		truckFreeSlots = c1;
		bikeFreeSlots = c2;
		carFreeSlots = c3;
	}

	public void displayAll()
	{
		System.out.println("\n\nPARKING LOT ----------------------->\n");
		for(int i=0;i<floors;i++)
		{
			for(int j=0;j<slots;j++)
			{
				System.out.print(vehicle[i][j]+"\t\t");
			}
			System.out.println();
		}	
	}

	public void showFreeCount(int s,int e,String type)
	{
		for(int i=0;i<floors;i++)
		{
			int count = 0;
			for(int j=s;j<e;j++)
			{
				if(vehicle[i][j]==null)
					count++;
			}
			System.out.println("No. of free slots for "+type+" on Floor "+(i+1)+":"+count);
		}
	}
	
	public void showFreeSlots(int s,int e,String type)
	{
		for(int i=0;i<floors;i++)
		{
			List<Integer> list = new ArrayList<>();
			for(int j=s;j<e;j++)
			{
				if(vehicle[i][j]==null)
					list.add(j+1);
			}
			System.out.print("Free slots for "+type+" on Floor "+(i+1)+":");
			for(int j : list)
				System.out.print(" "+j);
			System.out.println();
		}
		
	}

	public void showOccupiedSlots(int s,int e,String type)
	{
		for(int i=0;i<floors;i++)
		{
			List<Integer> list = new ArrayList<>();
			for(int j=s;j<e;j++)
			{
				if(vehicle[i][j]!=null)
					list.add(j+1);
			}
			System.out.print("Occupied slots for "+type+" on Floor "+(i+1)+":");
			for(int j : list)
				System.out.print(" "+j);
			System.out.println();
		}
	}

	public void createParkingLot(String[] s)
	{
		parkingLotName = s[1];
		floors = Integer.parseInt(s[2]);
		slots = Integer.parseInt(s[3]);
		freeSlots = floors*slots;
		truckFreeSlots = floors;
		bikeFreeSlots = floors*2;
		carFreeSlots = freeSlots - (floors*3);
		vehicle = new Vehicle[floors][slots];
		System.out.println("Created parking Lot with "+floors+" floors "+slots+" slots per floor!!!.");
	}

	public void parkVehicle(String[] s)
	{
		if(freeSlots==0 || truckFreeSlots==0 || carFreeSlots==0 || bikeFreeSlots==0)
		{
			System.out.println("Parking Lot Full!");
			return;
		}	
		else if(s[1].equals("TRUCK") && truckFreeSlots!=0)
		{
			boolean flag = true;
			for(int i=0;i<floors && flag;i++)
			{
				for(int j=0;j<1;j++)
				{
					if(vehicle[i][j]!=null)
						break;
					else
					{
						String id = parkingLotName+"_"+(i+1)+"_"+(j+1);
						vehicle[i][j] = new Vehicle(s[1],s[2],s[3],id);
						flag = false;
						truckFreeSlots--;
					}
				}
			}	
			//System.out.println("Truck Parked!!!");
		}
		else if(s[1].equals("BIKE") && bikeFreeSlots!=0)
		{
			boolean flag = true;
			for(int i=0;i<floors && flag;i++)
			{
				for(int j=1;j<3;j++)
				{
					if(vehicle[i][j]!=null)
						continue;
					else
					{
						String id = parkingLotName+"_"+(i+1)+"_"+(j+1);
						vehicle[i][j] = new Vehicle(s[1],s[2],s[3],id);
						bikeFreeSlots--;
						flag = false;
						break;
					}
				}
				
			}	
			//System.out.println("Bike Parked!!!");
		}
		else if(s[1].equals("CAR") && carFreeSlots!=0)
		{
			boolean flag = true;
			for(int i=0;i<floors && flag;i++)
			{
				for(int j=3;j<vehicle[i].length;j++)
				{
					if(vehicle[i][j]!=null)
						continue;
					else
					{
						String id = parkingLotName+"_"+(i+1)+"_"+(j+1);
						vehicle[i][j] = new Vehicle(s[1],s[2],s[3],id);
						carFreeSlots--;
						flag = false;
						break;
					}
				}
			}	
			//System.out.println("Car Parked!!!");
		}
		freeSlots--;
	}

	void unParkVehicle(String[] s)
	{
		String id = s[1];
		boolean flag = true;
		for(int i=0;i<floors && true;i++)
		{
			for(int j=0;j<slots;j++)
			{
				if(vehicle[i][j]!=null && vehicle[i][j].getParkingId().equals(id))
				{
					System.out.println("Unparked Vehicle - Registration number : "+vehicle[i][j].getParkingId()+" , Color : "+vehicle[i][j].getVehicleColor());
					/*if(j<2)
						truckFreeSlots++;
					else if(j>1 && j<4)
						bikeFreeSlots++;
					else if(j>3)
						carFreeSlots++;*/
					vehicle[i][j] = null;
					flag = false;
					freeFilledSlots();
					break;
				}
			}
		}
		freeSlots++;
	}

	void displayVehicle(String[] s)
	{
		if(s[1].equals("free_count"))
		{	
			if(s[2].equals("CAR"))
				showFreeCount(3,slots,"CAR");
			else if(s[2].equals("BIKE"))
				showFreeCount(1,3,"BIKE");
			else if(s[2].equals("TRUCK"))
				showFreeCount(0,1,"TRUCK");
		}	
		else if(s[1].equals("free_slots"))
		{	
			if(s[2].equals("CAR"))
				showFreeSlots(3,slots,"CAR");
			else if(s[2].equals("BIKE"))
				showFreeSlots(1,3,"BIKE");
			else if(s[2].equals("TRUCK"))
				showFreeSlots(0,1,"TRUCK");
		}
		else if(s[1].equals("occupied_slots"))
		{	
			if(s[2].equals("CAR"))
				showOccupiedSlots(3,slots,"CAR");
			else if(s[2].equals("BIKE"))
				showOccupiedSlots(1,3,"BIKE");
			else if(s[2].equals("TRUCK"))
				showOccupiedSlots(0,1,"TRUCK");
		}				
	}

	public void runMethod(ArrayList<String[]> inList)
	{
		//for(String[] s : inList)
		//	System.out.println(Arrays.toString(s));	
		for(String[] s : inList)
		{
			if(s[0].equals("create_parking_lot"))
				createParkingLot(s);
			else if(s[0].equals("park_vehicle"))	
				parkVehicle(s);
			else if(s[0].equals("unpark_vehicle"))	
				unParkVehicle(s);
			else if(s[0].equals("display"))
				displayVehicle(s);
		}	
	}
	
	public static void main(String[] args)
	{
		ArrayList<String[]> inList = new ArrayList<String[]>();
		Parking p = new Parking();
		int i = 0;
		while(i<args.length)
		{
			int index = 0;
			if(args[i].equals("create_parking_lot"))
			{
				String[] s = new String[4];
				for(int j=0;j<4;j++)
				{
					s[j] = args[i];
					i++;	
				}
				inList.add(s);
				//System.out.println("Created!!");
			}
			else if(args[i].equals("park_vehicle"))
			{
				String[] s = new String[4];
				for(int j=0;j<4;j++)
				{
					s[j] = args[i];
					i++;	
				}
				inList.add(s);
				//System.out.println("Parked");
			}
			else if(args[i].equals("unpark_vehicle"))
			{
				String[] s = new String[2];
				for(int j=0;j<2;j++)
				{
					s[j] = args[i++];	
				}
				inList.add(s);
				//System.out.println("UnParked");
			}
			else if(args[i].equals("display"))
			{
				String[] s = new String[3];
				for(int j=0;j<3;j++)
				{
					s[j] = args[i++];	
				}
				inList.add(s);
				//System.out.println("Displayed");
			}
			else if(args[i].equals("exit"))
				break;
		}
		p.runMethod(inList);
		p.displayAll();
	}	
}