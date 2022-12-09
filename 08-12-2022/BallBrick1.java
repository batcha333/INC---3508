import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class BallBrick1
{
	public void printGame(char[][] game,ArrayList<char[]> list)	
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
		for(int i=0;i<7;i++)
		{
			for(int j=0;j<7;j++)
			{
				System.out.print(game[i][j]+" ");
			}System.out.println();
		}
		
	}
	public static void main(String[] args)
	{
		ArrayList<char[]> list = new ArrayList<>();
		BallBrick1 b = new BallBrick1();
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
		int count = in.nextInt();
		b.printGame(game,list);
		System.out.println("Ball count : "+count);
	}
}