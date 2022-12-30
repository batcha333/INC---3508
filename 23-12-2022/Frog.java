import java.util.*;
public class Frog
{
	static int t;
	
	public void run(char[][] map,int x,int y,int s)
	{
		if(t==0 || map[x][y]=='R' || x<0 || x+s>map.length-1 || y<0 || y+s>map.length-1)
			return;
		t--;
		map[x][y] = 'R';
		run(map,x+1,y,s);
		run(map,x,y,s);
		run(map,x,y+1,s);
	}
	
	public static void main(String[] args)
	{
		Frog f = new Frog();
		Scanner in = new Scanner(System.in);
		System.out.print("Enter x y s t : ");
		int x = in.nextInt();
		int y = in.nextInt();
		int s = in.nextInt();
		t = in.nextInt();
		char[][] map = new char[x+x+s][y+y+s];
		for(char[] c : map)
			Arrays.fill(c,'o');
		f.run(map,x,y,s);
		for(char[] c : map)
			System.out.println(Arrays.toString(c));
	}
}