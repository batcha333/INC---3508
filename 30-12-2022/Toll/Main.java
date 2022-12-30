import java.util.*;
public class Main
{
	Scanner in = new Scanner(System.in);
	int count = 0;
	char[] locations = {'A','B','C','D','E','F'};
	Vehicle[] vehicle = new Vehicle[100];
	Toll[] tolls = new Toll[locations.length*2];
	
	public void showVehicles()
	{
		for(Vehicle v : vehicle)
		{
			if(v!=null)
				System.out.println(v.log);
		}
	}

	public void calculateTollRate(int s,int e,Vehicle v)
	{	
		System.out.println(s+"    "+e);
		System.out.println("iN CALCULATION");	
		int n = locations.length;
		int p = Math.abs(s-e);
		int path = Math.min(p,n-p);
		String s1 ="";
		String s2 ="";
		int rate1 = 0,rate2 =0;
		if(e>s)
		{
			int i = 2*(e)+1;
			if(v.getType().equals("CAR")) 
			{
				rate1 += tolls[i].carFee;
				rate2 += tolls[i+1].carFee;
			} 
			else if(v.getType().equals("VAN")) 
			{
				rate1 += tolls[i].vanFee;
				rate2 += tolls[i+1].vanFee;
			}
			else if(v.getType().equals("TRUCK")) 
			{
				rate1 += tolls[i].truckFee;
				rate2 += tolls[i+1].truckFee;
			}
			if(v.getVip()){
				rate1 = rate1 - (2*rate1/10);
				rate2 = rate2 - (2*rate2/10);
			}
			System.out.println(rate1+"         "+rate2);
			tolls[i].addToTollList("v.getNumber()"+"\t"+"rate1");
			tolls[i+1].addToTollList("v.getNumber()"+"\t"+"rate2");
		}
		else
		{
			int i = 2*(s)+1;
			if(v.getType().equals("CAR")) 
			{
				rate1 += tolls[i].carFee;
				rate2 += tolls[i+1].carFee;
			} 
			else if(v.getType().equals("VAN")) 
			{
				rate1 += tolls[i].vanFee;
				rate2 += tolls[i+1].vanFee;
			}
			else if(v.getType().equals("TRUCK")) 
			{
				rate1 += tolls[i].truckFee;
				rate2 += tolls[i+1].truckFee;
			}
			if(v.getVip()){
				rate1 = rate1 - (2*rate1/10);
				rate2 = rate2 - (2*rate2/10);
			}
			System.out.println(rate1+"         "+rate2);
			tolls[i].addToTollList("v.getNumber() "+"\t"+" rate1");
			tolls[i+1].addToTollList("v.getNumber() "+"\t"+" rate2");
		}
		System.out.println(s+"    "+e+"   "+path);
	}
	
	public void newEntry()
	{
		System.out.println("\nWelcome !!\n");
		System.out.print("Enter Vehicle Type : ");
		String type = in.next();
		System.out.print("Enter Start : ");
		char start = in.next().charAt(0);
		System.out.print("Enter Destination : ");
		char dest = in.next().charAt(0);
		System.out.print("Enter Vehicle Number : ");
		String number = in.next();
		System.out.print("Is the Customer - VIP (Y/N): ");
		char v = in.next().charAt(0);
		boolean access = (v=='Y')?true:false;
		int s = (int)(start-65);
		int e = (int)(dest-65);
		vehicle[count]=new Vehicle(type,number,access);
		calculateTollRate(s,e,new Vehicle(type,number,access));
		count++;
		showVehicles();
	}

	public void showMenu()
	{
		boolean flag = true;
		while(flag)
		{
			System.out.print("MENU---->\n\n1.Vehicle Entry\n2.Toll Details\n3.Vehicle Details\n4.Exit\nEnter your choice : ");
			int choice = in.nextInt();
			switch(choice)
			{
				case 1 : newEntry();break;
				//case 2 : showTollDetails();break;
				//case 3 : showVehicleDetails();break;
				case 4 : System.out.println("Thank you!!!!");flag=false;break;
			}
		}
	}

	public static void main(String[] args)
	{
		Main m = new Main();
		m.showMenu();
	}
}