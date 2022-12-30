import java.util.*;
public class Balloons
{
	public int path(int index,int[] arr)
	{
		int count = 0;
		for(int j=0;j<arr.length;j++)
		{	
			if(arr[j]==1)
			{
				count = count + Math.abs(index-j);
			}
		}
		return count;
	}
	public static void main(String[] args)
	{
		Balloons ball = new Balloons();
		Scanner in = new Scanner(System.in);		
		System.out.print("Enter a string : ");
		String s = in.next();
		int n = s.length();
		int[] arr = new int[n];
		int index = 0;
		for(char c : s.toCharArray())
			arr[index++] = (int)(c-48);
		int[] b = new int[n];
		for(int i=0;i<n;i++)
		{
			b[i] = ball.path(i,arr);
		}
		System.out.println(Arrays.toString(b));
		in.close();
	}
}