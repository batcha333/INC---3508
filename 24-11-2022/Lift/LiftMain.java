import java.util.*;
public class LiftMain
{
	static String[] lift = {"L1","L2","L3","L4","L5"};
	//static int[] access = {1,1,2,2,0};
	static int[] location = {0,0,0,0,0};
	//static int[] location = {-1,-1,-1,-1,-1};
	static Scanner in = new Scanner(System.in);

	void work1(int s,int d)
	{
		if(location[0]!=-1 && location[1]!=-1)
		{
			int l0 = location[0];
			l0 = (location[0]==0)?5:0;
			int l1 = location[1];
			l1 = (location[1]==0)?5:0;
			int a = Math.abs(s-l0);
			int b = Math.abs(s-l1);	
			int ans = Math.min(a,b);
			if(ans==b)
			{
				System.out.println(lift[1]+" is assigned!");		
				location[1] = d;	
			}
			else
			{
				System.out.println(lift[0]+" is assigned!");
				location[0] = d;
			}
		}
		else if(location[0]==-1 && location[1]!=-1)
		{
			System.out.println(lift[1]+" is assigned!");		
			location[1] = d;
		}
		else if(location[1]==-1 && location[0]!=-1)
		{
			System.out.println(lift[0]+" is assigned!");		
			location[0] = d;
		}
		else
		{
			work3(s,d);
		}
	}

	void work2(int s,int d)
	{
		if(location[2]!=-1 && location[3]!=-1)
		{
			int l2 = location[2];
			l2 = (location[2]==0)?5:0;
			int l3 = location[3];
			l3 = (location[3]==0)?5:0;
			int a = Math.abs(s-l2);
			int b = Math.abs(s-l3);	
			int ans = Math.min(a,b);
			if(ans==b)
			{
				System.out.println(lift[3]+" is assigned!");		
				location[3] = d;	
			}
			else
			{
				System.out.println(lift[2]+" is assigned!");
				location[2] = d;
			}
		}
		else if(location[2]==-1 && location[3]!=-1)
		{
			System.out.println(lift[3]+" is assigned!");		
			location[3] = d;
		}
		else if(location[3]==-1 && location[2]!=-1)
		{
			System.out.println(lift[2]+" is assigned!");		
			location[2] = d;
		}
		else
		{
			work3(s,d);
		}
	}

	void work3(int s,int d)
	{		
		if(location[4]!=-1)
		{
			System.out.println(lift[4]+" is assigned!");		
			location[4] = d;
		}
		else
		{
			System.out.println("\n\t\t<-------------------No Available Lifts for now, PLease Take the steps------------------->\n<-------------------Steps is on the left Side of the Lobby!!. Sorry for the Incovenience caused :(------------------->\n");
		}
	}

	void maintenance()
	{
		System.out.print("Enter Lift Number : ");
		int n = in.nextInt();
		if(location[n-1]==-1){location[n-1]=0;}
		else{location[n-1]=-1;}
	}

	void status()
	{
		String newStr = "";
		for(int i : location)
		{
			newStr += i+"\t";
		}
		System.out.println("Lift Positions -> ");
		System.out.println("L1\tL2\tL3\tL4\tL5\n"+newStr);
		System.out.println();
	}

	void run()
	{
		System.out.print("Enter floor Src & Dst : ");
		int s = in.nextInt();
		int d = in.nextInt();
		if(s<6 && d<6){work1(s,d);}
		else if(s>5 && d>5){work2(s,d);}
		else{work3(s,d);}
	}
	
	public static void main(String[] args)
	{
		LiftMain l = new LiftMain();
		boolean flag = true;
		while(flag)
		{
			System.out.println("\n\t\t\tLIFT MENU\t\t\t\n");
			System.out.println("1. Pick a Lift\n2. Lift Position\n3. Maintenance\n4. Exit\n");
			System.out.print("Enter Your choice : ");
			int choice = in.nextInt();	
			switch(choice)
			{
				case 1 : l.run();break;
				case 2 : l.status();break;
				case 3 : l.maintenance();break;
				case 4 : System.out.println("Thank You! :)");flag = false;break;
				default : System.out.println("Please enter corect choice : \n");break;
			}
		}
	}
}