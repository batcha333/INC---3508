public class PayPal
{
	public static void main(String[] args)
	{
		String s= "PAYPALISHIRING";
		char[] str = s.toCharArray();
		int n = 3;
		char[][] arr = new char[3][str.length];
		int v=0;
		int col = 0;
		while(v<str.length)
		{
			int i=0;
			while(i<n && v<str.length)
			{
				arr[i++][col] = str[v++];
			}col++;
			int j=n-2;
			while(j>=1 && v<str.length)
			{
				arr[j--][col++] = str[v++];
			}
		}	
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<str.length/2;j++)
			{
				//if(arr[i][j] != '\0')
				System.out.print(arr[i][j]+" ");
			}//System.out.println();
		}
	}
}