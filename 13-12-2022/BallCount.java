import java.util.*;
public class BallCount
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter LL : ");
		int l = in.nextInt();
		System.out.print("Enter HL : ");
		int h = in.nextInt();
		int[] count = new int[h];
		for(int i=l;i<=h;i++)
		{
			if(i/10==0)
			{
				count[i]++;	
			}
			else
			{
				int r = i%10;
				int sum = r + i/10;
				count[sum]++;
			}
		}
		System.out.println(Arrays.toString(count));
		int max = Integer.MIN_VALUE;
		for(int i=0;i<count.length;i++){
			if(count[i]>max)
				max = count[i];
		}
		System.out.println("Max : "+max);
	}
}