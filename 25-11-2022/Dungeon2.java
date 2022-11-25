import java.util.*;
public class Dungeon2
{
	static List<int[]> list = new ArrayList<>();
	int findMinimumDistance(char[][] map,int[] a,int[] g)
	{
		int min=0;	
		int i = a[0], j = a[1];
		while(i<=map.length && i>0)
		{
			if(i==g[0]){break;}
			else if(i>g[0]){min++;i--;}
			else{min++;i++;}
			//System.out.println("i,j : "+i+","+j);
				
		}
		while(j<map[0].length && j>0)
		{
			if(j==g[1]){break;}
			else if(j>g[1]){min++;j--;}
			else{min++;j++;}	
			//System.out.println("i,j : "+i+","+j);
		}
		//System.out.println("Minimum Distance : "+min);
		return min;
	}
	
	void findMinimumPath(char[][] map,int[] a,int[] g)
	{
		int min=0;	
		int i = a[0], j = a[1];
		int[] p = new int[2];
		System.out.println(Arrays.toString(a));
		while(j<map[0].length && j>0)
		{
			if(j==g[1]){break;}
			else if(j>g[1]){min++;j--;}
			else{min++;j++;}
			p[0] = i;p[1] = j;
			System.out.println(Arrays.toString(p));
			if(!list.contains(p)){list.add(p);}	
			//System.out.println("i,j : "+i+","+j);
		}
		while(i<=map.length && i>0)
		{
			if(i==g[0]){break;}
			else if(i>g[0]){min++;i--;}
			else{min++;i++;}
			p[0] = i;p[1] = j;
			System.out.println(Arrays.toString(p));
			if(!list.contains(p)){list.add(p);}
			//System.out.println("i,j : "+i+","+j);	
		}
		System.out.println("Minimum Distance : "+min);
		//System.out.println(list);
	}

	public static void main(String[] args)
	{	
		Dungeon2 d = new Dungeon2();
		Scanner in = new Scanner(System.in);
		System.out.print("Enter Dungeon dimension : ");	
		int m = in.nextInt(),n = in.nextInt();	
		char[][] map = new char[m][n];
		System.out.print("Enter Adventurer position : ");
		int adv[] = new int[2];
		for(int i=0;i<2;i++)
		{
			adv[i] = in.nextInt();
		}
		System.out.print("Enter Monster position : ");
		int mon[] = new int[2];
		for(int i=0;i<2;i++)
		{
			mon[i] = in.nextInt();
		}
		System.out.print("Enter Gold position : ");
		int gol[] = new int[2];
		for(int i=0;i<2;i++)
		{
			gol[i] = in.nextInt();
		}
		int aDistance = d.findMinimumDistance(map,adv,gol);
		int mDistance = d.findMinimumDistance(map,mon,gol);
		if(mDistance <= aDistance )
		{
			d.findMinimumPath(map,adv,gol);
		}
		else
		{
			System.out.print("No Result");
		}
	}
}