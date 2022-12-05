import java.util.Scanner;
public class KnapSack
{
	public int knapSack(int w,int[] wt,int[] val,int n)
	{
		if(n==0 || w==0)
			return 0;
		if(wt[n-1]>w)
			return knapSack(w,wt,val,n-1);
		else
		{
			return Math.max(val[n-1]+knapSack(w-wt[n-1],wt,val,n-1),knapSack(w,wt,val,n-1));
		}
	}
	public static void main(String args[])
    	{
		KnapSack k = new KnapSack();
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a range : ");
		int n = in.nextInt();
        	int val[] = new int[n];
		System.out.print("Enter values array : ");
		for(int i=0;i<n;i++)
		{
			val[i] = in.nextInt();
		}
        	int wt[] = new int[n];
		System.out.print("Enter weights array : ");
		for(int i=0;i<n;i++)
		{
			wt[i] = in.nextInt();
		}
		System.out.print("Enter weight : ");
        	int w = in.nextInt();
        	System.out.println(k.knapSack(w, wt, val, n));
    	}
}