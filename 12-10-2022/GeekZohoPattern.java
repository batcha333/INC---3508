public class GeekZohoPattern
{
	public static void main(String[] args)
	{
		int i,j;
		char str[]= {'P','R','O','G','R','A','M'};
		int len = str.length; 
		for(i=0;i<len;i++)
		{
			for(j=0;j<len;j++)
			{
				if(i==j){System.out.print(str[j]);}
				else if(i+j+1==len){System.out.print(str[j]);}
				else System.out.print(" ");
			}System.out.println();
		}
	}
}