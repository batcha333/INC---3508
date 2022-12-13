import java.io.*;
public class SerializationClass
{
	public static void main(String[] args)
	{
		Employee emp = new Employee();
		emp.name = "Faadil";
		emp.address = "Pondicherry";
		try
		{
			FileOutputStream fout = new FileOutputStream("D:\\Files\\newFile.txt");
			ObjectOutputStream out = new ObjectOutputStream(fout);
			out.writeObject(emp);
			out.close();
			fout.close();
			System.out.println("Serialization success!!");
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
}