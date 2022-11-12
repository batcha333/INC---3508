import java.lang.Math;
import java.util.*;
public class Random
{
	public static void main(String[] args)
	{
		int random = (int)(Math.random() * 100.0);
		System.out.println(random);
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int guess;
		do
		{
			guess = in.nextInt();
			if(guess > random){System.out.print("Too High!,Try again : ");}
			if(guess < random){System.out.print("Too Low!,Try again :");}
		}
		while(guess != random);
		System.out.println("You won!!!");
		
	}
}