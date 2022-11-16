public class Days
{
	public static void main(String[] args)
	{
		int[] y1 = {10,2,2014};
		int[] y2 = {10,2,2014
};
		int yd = y1[2]-y1[2];
		int md = (12-y1[1])+y2[1];
		int dd = y2[0]-y1[0];
		int n = (yd-1)*30 + md*30 + dd;
		System.out.println("No of days : "+n);
	}
}