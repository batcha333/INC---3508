import java.util.Scanner;
class Test
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("ENter Array Elements");
		String[] arr = sc.nextLine().split(" ");
		String sum="";
		for(String s : arr)
		{
			sum+=s;
		}
		System.out.println(sum);
	}
}