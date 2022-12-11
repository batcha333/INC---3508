import java.io.*;
public class DeSerializationClass
{
	public static void main(String[] args) throws IOException,ClassNotFoundException 
	{
		Employee emp = null;
		try 
		{
			FileInputStream fin = new FileInputStream("D:\\Files\\newFile.txt");
			ObjectInputStream in = new ObjectInputStream(fin);
			emp = (Employee)in.readObject();
			System.out.println("Name : "+emp.name+"\nAddress : "+emp.address);
			in.close();
			fin.close();
		}
		finally
		{
			System.out.println("The End");
		}
	}
}