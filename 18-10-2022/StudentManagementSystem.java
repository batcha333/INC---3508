import java.util.*;
class Student
{
	private int studentRollno;
	private String studentName;
	private String studentDept;
	private int[] studentMarks;
	public void setRollno(int roll)
	{
		studentRollno = roll;
	}
	public int getRollno()
	{
		return studentRollno;
	}
	public void setName(String name)
	{
		studentName = name;
	}
	public String getName()
	{
		return studentName;
	}
	public void setDept(String dept)
	{
		studentDept = dept;
	}
	public String getDept()
	{
		return studentDept;
	}
	public void setMarks(int[] marks)
	{
		studentMarks = marks;
	}
	public int[] getMarks()
	{
		return studentMarks;
	}
}

public class StudentManagementSystem
{
	static Student s1 = new Student();
	static int totalSum = 0;
	public void dataRead()
	{
		//Student s1 = new Student();
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the Student Roll no : ");
		int roll = in.nextInt();
		System.out.print("Enter the Student Name : ");
		String name = in.next();
		System.out.print("Enter the Student Department : ");
		String dept = in.next();
		System.out.print("Enter the Student Marks(M1 M2 M3) : ");
		int[] marks = new int[3];	
		for(int i=0;i<3;i++)
		{
			marks[i] = in.nextInt();
			totalSum += marks[i];
		}
		s1.setRollno(roll);
		s1.setName(name);
		s1.setDept(dept);
		s1.setMarks(marks);	
	}
	public void dataShow()
	{
		//Student s1 = new Student();
		System.out.println("*******************************************************");
		System.out.println("Student Roll Nr. : "+s1.getRollno());
		System.out.println("Student Name : "+s1.getName());
		System.out.println("Student Department : "+s1.getDept());
		System.out.println("Student Marks : "+Arrays.toString(s1.getMarks()));
	}
	public void calculateTotal(int total)
	{
		System.out.println("Total Marks obtained : "+total);
	}
	public void calculateAverage(int total)
	{
		System.out.println("Average : "+(float)total/3);
	}
	public static void main(String args[])
	{
		StudentManagementSystem stud = new StudentManagementSystem();
		stud.dataRead();
		stud.dataShow();
		stud.calculateAverage(totalSum);
		System.out.println("*******************************************************");
		stud.calculateTotal(totalSum);
		System.out.println("*******************************************************");
	}
}