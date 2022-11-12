import java.io.*;	

public class LowerToUpper
{
	public static void main(String[] args) throws IOException
	{
		FileInputStream fi = new FileInputStream("C:\\Users\\Administrator\\Desktop\\INC - 3508\\03-11-2022\\lowerToUpper.txt");
		String toUpper ="",newStr="";
		int c=0,j=0;
		while((c=fi.read())!=-1)
		{
			toUpper += (char)(c);
		}
		System.out.println("String before change : "+toUpper);
		fi.close();
		FileOutputStream fo = new FileOutputStream("C:\\Users\\Administrator\\Desktop\\INC - 3508\\03-11-2022\\lowerToUpper.txt");
		newStr = toUpper.toUpperCase();
		while(j<newStr.length())
		{
			fo.write((int)(newStr.charAt(j)));
			j++;
		}
		fo.close();
	}
}