import java.util.*;
public class Game2048
{
	int[][] game = new int[4][4];
	Scanner in = new Scanner(System.in);
	
	public void winMessage()
	{
		System.out.println("Congratulations!!!");
		System.exit(0);
	}

	public void loseMessage()
	{
		System.out.println("Game Over!!!");
		System.exit(0);
	}

	public void checker()
	{
		for(int i=0;i<game.length;i++)
		{
			for(int j=0;j<game[i].length;j++)
			{
				if(game[i][j]==2048)
					winMessage();
			}
		}	
	}

	public void loser()
	{
		int zeroCount = 0;
		for(int i=0;i<game.length;i++)
		{
			for(int j=0;j<game[i].length;j++)
			{
				if(game[i][j]==0)
					zeroCount++;
			}
		}	
		if(zeroCount==0)
		{
			loseMessage();
		}
	}
	
	public void insertRandom()
	{
		int x,y;
		do
		{
			x = (int)(Math.random()*4);
			y = (int)(Math.random()*4);
		}while(game[x][y]!=0);
		game[x][y] = 2;
	}
	
	public void showBoard()
	{
		for(int[] i : game)
			System.out.println(Arrays.toString(i));
	}

	public void moveUp()
	{
		for(int j=0;j<game.length;j++)
		{
			for(int i=0;i<game.length;i++)
			{
				int temp = 0;
				if(game[i][j]!=0)
				{
					boolean flag = true;
					int k = i;
					while(k>=1)
					{
						temp = game[k-1][j];
						if(temp==0)
						{
							game[k-1][j] = game[k][j];	
							game[k][j] = 0;
						}	
						else if(game[k][j]==temp && flag)
						{
							flag = false;
							game[k-1][j] += game[k][j];
							game[k][j] = 0;
						}
						k--;
					}
				}
					
			}
		}
	}

	public void moveDown()
	{
		for(int j=game.length-1;j>=0;j--)
		{
			for(int i=game.length-1;i>=0;i--)
			{
				int temp = 0;
				if(game[i][j]!=0)
				{
					boolean flag = true;
					int k = i;
					while(k<game.length-1)
					{
						temp = game[k+1][j];
						if(temp==0)
						{
							game[k+1][j] = game[k][j];	
							game[k][j] = 0;
						}	
						else if(game[k][j]==temp && flag)
						{
							flag = false;
							game[k+1][j] += game[k][j];
							game[k][j] = 0;
						}
						k++;
					}
				}
					
			}
		}
	}

	public void moveLeft()
	{
		for(int i=0;i<game.length;i++)
		{
			for(int j=0;j<game[i].length;j++)
			{
				int temp = 0;
				if(game[i][j]!=0)
				{
					int k = j;
					boolean flag = true;
					while(k>=1)
					{
						temp = game[i][k-1];
						if(temp==0)
						{
							game[i][k-1] = game[i][k];	
							game[i][k] = 0;
						}	
						else if(game[i][k]==temp && flag)
						{
							flag = false;
							game[i][k-1] += game[i][k];
							game[i][k] = 0;
						}
						k--;
					}
				}
					
			}
		}

	}

	public void moveRight()
	{
		for(int i=game.length-1;i>=0;i--)
		{
			for(int j=game.length-1;j>=0;j--)
			{
				int temp = 0;
				if(j<game.length-1)
				{
					int k = j;
					boolean flag = true;
					while(k<game.length-1)
					{
						temp = game[i][k+1];
						if(temp==0)
						{
							game[i][k+1] = game[i][k];	
							game[i][k] = 0;
						}	
						else if(game[i][k]==temp && flag)
						{
							flag = false;
							game[i][k+1] += game[i][k];
							game[i][k] = 0;
						}
						k++;
					}
				}
					
			}
		}
		
	}
	
	public void startGame()
	{
		boolean flag = true;
		while(flag)
		{
			System.out.print("Enter a move (L | R | U | D): ");
			char c = in.next().charAt(0);
			switch(c)
			{
				case 'L' : moveLeft();break;
				case 'R' : moveRight();break;
				case 'U' : moveUp();break;
				case 'D' : moveDown();break;
				default : System.out.println("Wrong choice!!!");flag=false;break;	
			}
			insertRandom();
			showBoard();
			checker();
			loser();
		}
	}	

	public static void main(String[] args)
	{
		Game2048 g = new Game2048();
		g.insertRandom();
		g.insertRandom();
		g.showBoard();
		g.startGame();	
	}
}