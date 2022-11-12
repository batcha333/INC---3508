import java.util.*;
class Student
{
	private String studentName;
	private int studentRollNo;
	public void setRollNo(int roll)
	{
		studentRollNo = roll;
	}
	public void setName(String name)
	{
		studentName = name;
	}
	public int getRollNo()
	{
		return studentRollNo;
	}
	public String getName()
	{
		return studentName;
	}
	public void demo()
	{
		System.out.print("IN Demo");
	}
}
public class StudentClassObj
{
	public static void main(String[] args)
	{
		Student stud = new Student();
		//stud.demo();
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the roll num : ");
		int roll = in.nextInt();
		stud.setRollNo(roll);
		in.nextLine();
		System.out.print("Enter the Name : ");
		String name = in.nextLine();
		stud.setName(name);
	}
}