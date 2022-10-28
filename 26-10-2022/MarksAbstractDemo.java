abstract class Marks
{
	abstract double getPercentage(double marks[]);	
}
class StudentA extends Marks
{
	double percentage = 0;
	double getPercentage(double marks[])
	{
		for(double i : marks)
			percentage += i;	
		return percentage/3; 
	}
}
class StudentB extends Marks
{
	double percentage = 0;
	double getPercentage(double marks[])
	{
		for(double i : marks)
			percentage += i;	
		return percentage/4; 		
	}
}
public class MarksAbstractDemo
{
	public static void main(String[] args)
	{
		Marks m1 = new StudentA();
		Marks m2 = new StudentB();
		double[] marks1 = {80,90,80};
		double[] marks2 = {80,90,80,90};
		System.out.println("Student - A percentage : "+m1.getPercentage(marks1));
		System.out.println("Student - B percentage : "+m2.getPercentage(marks2));
	}
}