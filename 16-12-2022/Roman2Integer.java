import java.util.Scanner;
public class Roman2Integer
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a Roman : ");
		String s = in.next();
		int ans=0,prev=0;
		char[] arr = s.toCharArray();
		int number = 0;
		for(int i=arr.length-1;i>=0;i--)
		{
			switch(arr[i])
			{
				case 'I' : number = 1;break;
				case 'V' : number = 5;break;
				case 'X' : number = 10;break;
				case 'L' : number = 50;break;
				case 'C' : number = 100;break;
				case 'D' : number = 500;break;
				case 'M' : number = 1000;break;
			}	
			if(number>=prev)
				ans += number;
			else
				ans -= number;
			prev = number;
		}
		in.close();
		System.out.println("Answer : "+ans);
	}
}