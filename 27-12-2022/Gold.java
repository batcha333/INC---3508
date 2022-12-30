import java.util.*;
public class Gold
{
	static int max = Integer.MIN_VALUE;
	static int[][] b;
	static int[][] c;
	public void collectTopDown(int[][] arr,int x,int y,int gold)
	{
		if(x==arr.length || y==arr[x].length || arr[x][y]==-1)
		{
			if(max<gold)
			{
				max = gold;
				for(int i=0;i<arr.length;i++)
				{
					for(int j=0;j<arr[i].length;j++)
					{
						b[i][j] = arr[i][j];
					}
				}
			}
			return;
		}
		int temp = arr[x][y];
		arr[x][y] = 0;
		collectTopDown(arr,x,y+1,gold+temp);
		collectTopDown(arr,x+1,y,gold+temp);
		arr[x][y] = temp;
	}

	public void collectDownTop(int[][] b,int x,int y,int gold)
	{
		if(x<0 || y<0 || b[x][y]==-1)
		{
			if(max<gold)
			{
				max = gold;
				for(int i=0;i<b.length;i++)
				{
					for(int j=0;j<b[i].length;j++)
					{
						c[i][j] = b[i][j];
					}
				}
			}
			return;
		}
		int temp = b[x][y];
		b[x][y] = 0;
		collectDownTop(b,x,y-1,gold+temp);
		collectDownTop(b,x-1,y,gold+temp);
		b[x][y] = temp;
	}

	public static void main(String[] args)
	{
		Gold g = new Gold();
		Scanner in = new Scanner(System.in);
		System.out.print("Enter range : ");
		int n = in.nextInt();
		System.out.println("Enter path  : ");
		int[][] arr = new int[n][n];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				arr[i][j] = in.nextInt();
			}
		}
		b = new int[n][n];
		c = new int[n][n];
		//int[][] arr = {{0,1,0,-1,1},{1,1,1,0,-1},{1,-1,1,1,1},{0,1,1,0,1},{-1,0,-1,1,1}};
		for(int[] i : arr)
			System.out.println(Arrays.toString(i));

		g.collectTopDown(arr,0,0,0);
		System.out.println("\nAftr Top - Down\n");
		for(int[] i : b)
			System.out.println(Arrays.toString(i));
		System.out.println("Max Gold - 1 way : "+max);
		
		g.collectDownTop(b,b.length-1,b[0].length-1,max);
		System.out.println("\nAftr Down - Top\n");
		for(int[] i : c)
			System.out.println(Arrays.toString(i));
		System.out.println("Max Gold - 2 way : "+max);
	}
}