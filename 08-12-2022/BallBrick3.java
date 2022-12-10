import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class BallBrick3
{
	static int count = 0;
	static int x = 6,y = 3;
	static Scanner in = new Scanner(System.in);
	public void printGame(char[][] game)
	{
		for(int i=0;i<7;i++)
		{
			for(int j=0;j<7;j++)
			{
				System.out.print(game[i][j]+" ");
			}System.out.println();
		}
	}
	public void play(char[][] game,String d)
	{
		int mid = game.length/2;
		if(d.equals("ST"))
		{
			for(int i=x-1;i>=0;i--)
			{
				if(game[i][y]=='1')
				{
					game[i][y] = ' ';
				}
				if(game[i][y]!=' ' && game[i][y]>'1')
				{
					int n = game[i][y]-'0';
					n -= 1;
					System.out.println(game[i][y]+"hhhhhhhhhhhh : "+n);
					char t = (char)(n+48);
					game[i][y] = t;
					break;
				}
			}
			x = game.length-1;
			game[x][y] = 'o';
		}
		if(d.equals("LD"))
		{
			for(int i=x,j=y;i>=0 && j>=0;i--,j--)
			{
				if(game[i][j]=='W')
				{
					y=j;
					x=i;	
				}
				if(game[i][j]=='1')
				{
					game[i][j] = ' ';
					y=j;
					x=i;
					break;
				}
				if(game[i][y]!=' ' && game[i][y]>'1')
				{
					int n = game[i][y]-'0';
					n -= 1;
					System.out.println(game[i][y]+"hhhhhhhhhhhh : "+n);
					char t = (char)(n+48);
					game[i][y] = t;
					break;
				}
			}
			if(y==0)
			{
				for(int j=y;j<game.length;j++)
				{
					if(game[x][j] == '1')
					{
						game[x][j] = ' ';
						count--;
						y = j;
						x = game.length-1;
						break;
					}
				}
				game[x][y] = 'o';
				for(int j=y+1;j<game.length;j++)
				{
					if(game[x][j] == 'o')
						game[x][j] = 'G';
				}
			}		
		}
		if(d.equals("RD"))
		{
			for(int i=x,j=y;i>=0 && j<game.length;i--,j++)
			{
				if(game[i][j]=='W')
				{
					y=j;
					x=i;	
				}
				if(game[i][j]=='1')
				{
					game[i][j] = ' ';
					count--;
					y=j;
					x=i;
					break;
				}
				if(game[i][y]!=' ' && game[i][y]>'1')
				{
					int n = game[i][y]-'0';
					n -= 1;
					System.out.println(game[i][y]+"hhhhhhhhhhhh : "+n);
					char t = (char)(n+48);
					game[i][y] = t;
					break;
				}
			}
			if(y==game.length-1)
			{
				for(int j=y;j>=0;j--)
				{
					if(game[x][j] == '1')
					{
						game[x][j] = ' ';
						y = j;
						x = game.length-1;
						break;
					}
				}
				game[x][y] = 'o';
				for(int j=y-1;j>=0;j--)
				{
					if(game[x][j] == 'o')
						game[x][j] = 'G';
				}
			}		
		}
		printGame(game);
	}
	public void getDirection(char[][] game)
	{
		boolean flag = true;
		char[][] temp = new char[7][7];
		while(flag)
		{
			System.out.print("Enter the direction : ");
			String d = in.next();
			if(!d.equals("ST") && !d.equals("LD") && !d.equals("RD"))
			{
				flag = false;
				break;
			}		
			System.out.println("HIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII");
			play(game,d);
		}
	}
	public void setGame(char[][] game,ArrayList<char[]> list)	
	{
		for(int i=0;i<game.length;i++)
		{
			game[i][0] = 'W';
			game[0][i] = 'W';
			game[i][game.length-1] = 'W';
		}
		int mid = game.length/2;
		game[game.length-1][mid] = 'o';
		for(int i=0;i<7;i++)
		{
			if(game[game.length-1][i]!='o' && game[game.length-1][i]!='W')
			{
				game[game.length-1][i] = 'G';
			}
		}
		for(char[] i : list)
		{
			game[i[0]-'0'][i[1]-'0'] = i[2];
		}		
	}
	public static void main(String[] args)
	{
		ArrayList<char[]> list = new ArrayList<>();
		BallBrick3 b = new BallBrick3();
		Scanner in = new Scanner(System.in);
		System.out.print("Enter size : ");
		int n = in.nextInt();
		char[][] game = new char[n][n];
		char c;
		char[] array = new char[3];
		System.out.print("Enter brick's position and brick type : ");
		for(int i=0;i<3;i++)
		{
			array[i] = in.next().charAt(0);
		}
		list.add(array);
		System.out.print("Do you want to continue(Y/N)?: ");
		char choice = in.next().charAt(0);
		do
		{
			char[] temp = new char[3];
			System.out.print("Enter brick's position and brick type : ");
			for(int i=0;i<3;i++)
			{
				temp[i] = in.next().charAt(0);
			}
			list.add(temp);
			System.out.print("Do you want to continue(Y/N)?: ");
			choice = in.next().charAt(0);
		}while(choice!='N');
		/*for(char[] i : list)
		{
			System.out.println(i);
		}*/
		System.out.print("Enter ball count : ");
		count = in.nextInt();
		b.setGame(game,list);
		b.getDirection(game);
		System.out.println("Ball count : "+count);
	}
}