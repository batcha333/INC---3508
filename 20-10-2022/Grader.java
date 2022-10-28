import java.util.*;
public class Grader
{
	public static void main(String[] args)
	{
		int n =5;
		Scanner in = new Scanner(System.in);
		int[] mark = new int[5];
		int sum =0,avg = 0;
		System.out.print("Enter 5 marks : ");
		for(int i=0;i<n;i++)
		{
			mark[i] = in.nextInt();
			sum += mark[i];	
		}
		System.out.println("Total Marks : "+sum);
		avg = sum/n;	
		System.out.println("Average : "+avg);
		if(avg>=80){System.out.println("Grade : A+");}
		else if(avg<80 && avg>=65){System.out.println("Grade : A");}
		else if(avg<65 && avg>=50){System.out.println("Grade : B");}
		else if(avg<50 && avg>=42){System.out.println("Grade : A+");}
		else System.out.println("fail");
	} 
}