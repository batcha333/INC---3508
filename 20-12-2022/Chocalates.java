import java.util.Scanner;
public class Chocalates
{
	/*public int count(int a,int c,int w)
	{
		int totalCandy = a/c;
		int wrapper = totalCandy;
		int extra = 0;
		while(wrapper>=w)
		{
			extra = wrapper/w;
			totalCandy += extra;
			wrapper = extra + wrapper%w;	
		}
		return totalCandy;
	}*/

	public int recursion(int wrapper,int w)
	{
		if(wrapper<w)
			return 0;
		return wrapper/w + recursion(wrapper/w+wrapper%w ,w);
	}
	
	public static void main(String[] args)
	{
		Chocalates ch = new Chocalates();
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a Amount : ");
		int a = in.nextInt();
		System.out.print("Enter cost  : ");
		int c = in.nextInt();
		System.out.print("Enter wrapper : ");
		int w = in.nextInt();	
		//System.out.println("No of chocalates : "+ch.count(a,c,w));
		int n = a/c;
		System.out.println("No of chocalates : "+(n+ch.recursion(n,w)));
	}
}