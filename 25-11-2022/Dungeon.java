import java.util.*;
public class Dungeon
{
	void findMinimumDistance(char[][] map,int[] a,int[] g)
	{
		int min=0;	
		int i = a[0];
		while(i<=map.length && i>=0)
		{
			if(i==g[0]){break;}
			else if(i>g[0]){min++;i--;}
			else{min++;i++;}
			System.out.println("i : "+i);	
		}
		int j = a[1];
		while(j<map[0].length && j>=0)
		{
			if(j==g[1]){break;}
			else if(j>g[1]){min++;j--;}
			else{min++;j++;}	
			System.out.println("j : "+j);
		}
		System.out.println("Minimum Distance : "+min);
	}

	public static void main(String[] args)
	{	
		Dungeon d = new Dungeon();
		Scanner in = new Scanner(System.in);
		System.out.print("Enter Dungeon dimension : ");	
		int m = in.nextInt(),n = in.nextInt();	
		char[][] map = new char[m][n];
		System.out.print("Enter Adventurer position : ");
		int a[] = new int[2];
		for(int i=0;i<2;i++)
		{
			a[i] = in.nextInt();
		}
		System.out.print("Enter Gold position : ");
		int g[] = new int[2];
		for(int i=0;i<2;i++)
		{
			g[i] = in.nextInt();
		}
		d.findMinimumDistance(map,a,g);
	}
}