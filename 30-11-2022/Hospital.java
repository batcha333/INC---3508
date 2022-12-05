import java.util.*;
public class Hospital
{
	static List<Patient> patientList = new ArrayList<>();
	static int c1Time = 5;
	static int c2Time = 5;
	static int pTime = 5;
	static int count = 1;
	static int c1FreeTime = 0;
	static int c2FreeTime = 0;
	static int dFreeTime = 0;
	static int pFreeTime = 0;
	static int waitTime = 0;

	public void calculateC1FreeTime(int iTime)
	{
		if(c1FreeTime<=iTime)
		{
			c1FreeTime = iTime + c1Time;
		}	 
		else
		{
			int temp = c1FreeTime - iTime;
			waitTime = temp;
			//iTime += temp;
			//c1FreeTime  += waitTime;
		}
	}
	
	
	
	public void calculateC2FreeTime(int iTime)
	{
		c2FreeTime = c2Time + c1FreeTime; 
	}

	public void calculateDFreeTime(int dTime)
	{
		int temp = 0;
		if(dFreeTime<=(c2FreeTime+temp))
		{
			dFreeTime = dTime+c2FreeTime;
		}
		else
		{
			temp = dFreeTime - c2FreeTime;
			waitTime += temp;
			//c2FreeTime += dTime;	
		}
	}

	public void calculatePFreeTime()
	{
		int temp = 0;
		if(pFreeTime<=(dFreeTime+temp))
		{
			pFreeTime = pTime + dFreeTime;
		}
		else
		{
			temp = pFreeTime - dFreeTime;
			waitTime += temp;
		}
	}

	public int calculateOutTime(int iTime,int dTime)
	{
		calculateC1FreeTime(iTime);
		calculateC2FreeTime(iTime);
		calculateDFreeTime(dTime);	
		calculatePFreeTime();
		int out = pFreeTime;
		System.out.println("\nC1FreeTime : "+c1FreeTime+"\nC2FreeTime : "+c2FreeTime+"\nDTime : "+dTime+"\nDFreeTime : "+dFreeTime+"\nPFreeTime : "+pFreeTime+"\nOut Time : "+out+"\nTotal Wait Time : "+waitTime);
		return out;
	}
	
	public int diagnoseTime()
	{
		double time = Math.random()*20;
		if(time<2)
			diagnoseTime();
		else 
			return (int)time;
		return (int)time;
	}

	public void display()
	{
		System.out.println("\t\t\t\tHOSPITAL OPD MANAGEMENT SERVICES\n\nPATIENT NAME   |   PATIENT ID    |   PATIENT IN-TIME   |   PATIENT OUT-TIME   |   PATIENT WAIT-TIME \n");
		int[] dTime = {10,4,8};
		int k=0;
		for(Patient i : patientList)
		{
			String temp = i.getInTime();
			String inTime = "",outTime = "";
			char[] str = temp.toCharArray();
			for(char j : str)
			{
				if(j>='0' && j<='9')
				{
					inTime += j;
				}
			}
			//System.out.println("Patient In-Time : "+inTime);
			int iTime = Integer.parseInt(inTime)%100;
			//int dTime = diagnoseTime();
			int out = calculateOutTime(iTime,dTime[k++]);	
			outTime += Integer.parseInt(inTime)/100+":";	
			outTime += Integer.toString(out);
			//System.out.println("Diagnose Time : "+dTime[0]);
			//System.out.println("Patient "+(count++)+" Out-Time : "+outTime);
			System.out.println(i.getPatientName()+"\t\t|\t"+i.getPatientId()+"\t\t|\t"+i.getInTime()+"\t\t|\t"+outTime+"\t\t|\t"+waitTime);
			outTime = "";
		}
	}

	public static void main(String[] args)
	{
		
		Scanner in = new Scanner(System.in);
		Hospital h = new Hospital();
		System.out.print("Enter no. of Patients : ");
		int n = in.nextInt();
		String outTime = "";
		for(int i=0;i<n;i++)
		{
			Patient p = new Patient();
			System.out.print("Enter Patient "+(i+1)+" name : ");
			String name = in.next();
			System.out.print("Enter Patient "+(i+1)+" ID : ");
			int id = in.nextInt();
			System.out.print("Enter Patient "+(i+1)+" In-Time : ");
			String inTime = in.next();
			p.setPatientName(name);
			p.setPatientId(id);
			p.setInTime(inTime);
			patientList.add(p);
			System.out.println();
		}	
		
		h.display();		
		//System.out.println("Diagnose Time : "+h.diagnoseTime());
	}
}