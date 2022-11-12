//import java.util.*;
class Student
{
	private int rollNr;
	private char name;
	public void setRollNo(int r)
	{
		rollNr = r;
	}
	public int getRollNo()
	{
		return rollNr;
	}
}
public class Encapsulation
{
	public static void main(String args[])
	{
		Student s = new Student(); 
		s.setRollNo(24);
		System.out.println(s.getRollNo());
	}
}