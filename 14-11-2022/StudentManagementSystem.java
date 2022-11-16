import java.util.Scanner;

class StudentDetails
{
	private int studentId;
	private String studentName;
	private String studentMail;
	private int engMark;
	private int matMark;
	private int cpMark;
	final String mailDomain = "@zoho.com";
	
	public StudentDetails(int studentId,String studentName,int engMark,int matMark,int cpMark)
	{
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentMail = studentName+mailDomain;
		this.engMark = engMark;
		this.matMark = matMark;
		this.cpMark = cpMark;
	}
		
	public String printDetails()
	{
		String str = studentId+"\t|"+studentName+"\t|"+studentMail+"\t|"+engMark+"\t|"+matMark+"\t|"+cpMark;
		return str;
	}
	
	public String printDetails(StudentDetails[] stud)
	{
		String str = studentId+"\t|"+studentName+"\t|"+studentMail+"\t|"+engMark+"\t|"+matMark+"\t|"+cpMark;
		return str;
	}
	
}
public class StudentManagementSystem
{
	static Scanner in = new Scanner(System.in);
	static StudentDetails[] stud = new StudentDetails[10];
	static StudentManagementSystem sms = new StudentManagementSystem();
	
	boolean validatePassword(String pass)
	{
		return true;
	}

	void createDetails(StudentDetails[] stud)
	{
		stud[0] = new StudentDetails(101,"Tharun",99,99,99);
		stud[1] = new StudentDetails(102,"Dinesh",100,99,100);
		stud[2] = new StudentDetails(103,"Muthu",99,100,99);
	}

	void createNewEntry(StudentDetails[] stud,int count)
	{
		System.out.print("Enter Student name : ");
		String name = in.next();
		System.out.print("Enter Student English mark : ");
		int mark1 = in.nextInt();
		System.out.print("Enter Student Maths mark : ");
		int mark2 = in.nextInt();
		System.out.print("Enter Student CP mark : ");
		int mark3 = in.nextInt();
		stud[count] = new StudentDetails(101+count,name,mark1,mark2,mark3);
	}

	void staffUtilities()
	{
		System.out.println("\nWelcome, Staff-X");
		sms.createDetails(stud);
		int choice = 0;
		while(choice<=3)
		{
			System.out.println("\n1.Add new Student Details\n2.Show Student Details\n3.Exit");
			System.out.print("\nEnter your choice : ");
			choice = in.nextInt();
			switch(choice)
			{
				case 1 : 
					int dataCount=0;	
					for(int j=0;j<stud.length && stud[j]!=null;j++){dataCount++;}
					sms.createNewEntry(stud,dataCount);
					System.out.println("Data successfully added!");
					break;
				case 2 : 
					System.out.println("Student Details\nStud_id Stud_name Stud_mail Eng_marks Mat_marks Cp_marks");	
					for(int i=0;i<stud.length && stud[i]!=null;i++)
					{
						System.out.println(stud[i].printDetails());
					}
					break;
				default :
					System.out.println("Exit successfully!");
					System.exit(0);
			}
		}
	}

	void staffLogin()
	{
		System.out.print("Enter Login Id (6-number): ");
		int staff_id = in.nextInt();
		System.out.print("Enter Login password : ");
		String staff_pass = in.next();
		if((staff_id == 111111) && (staff_pass.equals("1234")) && sms.validatePassword(staff_pass))
		{
			sms.staffUtilities();
		}
		else{System.out.println("Wrong username && password!!!");}
	}
	
	public static void main(String[] args)
	{
		System.out.println("\n...............STUDENT MANAGEMENT SYSTEM...............\n");
		System.out.println("Login : \n1.Staff Login\n2.Student Login");
		System.out.print("Enter choice: ");
		int choice = in.nextInt();
		switch(choice)
		{
			case 1 : 
				sms.staffLogin();
				break;
			case 2 : 
				//sms.studentLogin();
				break;	
		}
		
		in.close();
	}
}