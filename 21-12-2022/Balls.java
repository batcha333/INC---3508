import java.util.Scanner;
public class Balls
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter testcases number : ");
		int t = in.nextInt();
		for(int j=0;j<t;j++)
		{
			System.out.print("Enter size : ");
			int n = in.nextInt();
			char[] s = new char[n];
			int count = 0;
			for(int i=0;i<n;i++)
			{
				s[i] = in.next().charAt(0); 		
			}
			for(int i=0;i<n;i++)
			{
				if(s[i]=='B')
				{
					if(i==0)
					{
						if(s[i+1] == 'R'){
							System.out.println((i+1)+" "+(i+2));
							count++;
						}
					}
					
					else if(i==n-1)
					{
						if(s[i-1] == 'R'){
							System.out.println((i)+" "+(i+1));
							count++;
						}
					}

					
					else
					{
						if(s[i-1] == 'R'){
							System.out.println((i)+" "+(i+1));	
							count++;		
						}
						else if(s[i+1] == 'R'){
							System.out.println((i+1)+" "+(i+2));
							count++;
						}
					}
				}
			}
			System.out.println(count);
		}
	}
}