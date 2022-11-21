import java.util.*;
public class Seats
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter seat number : ");
		int s = in.nextInt();
		if(s%6==0 || s%6==1){System.out.println("WS");}
		else if(s%6==5 || s%6==2){System.out.println("MS");}
		else if(s%6==4 || s%6==3){System.out.println("AS");}
	}
}