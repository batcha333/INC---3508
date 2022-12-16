import java.io.*;
import java.util.*;

public class SerializationClass
{
	public void doSerialization(ArrayList<Customer> custList)
	{
		try
		{
			FileOutputStream fout = new FileOutputStream("C:\\Users\\Administrator\\Desktop\\INC - 3508\\14-12-2022\\Bank\\CustomerList.ser");
			ObjectOutputStream out = new ObjectOutputStream(fout);
			out.writeObject(custList);
			out.flush();
			out.close();
			fout.close();
			System.out.println("Serialization Success!");
		}
		catch(IOException e){}
	}

	public ArrayList<Customer> doDeSerialization()
	{
		ArrayList<Customer> list = new ArrayList<>();
		try
		{
			FileInputStream fin = new FileInputStream("C:\\Users\\Administrator\\Desktop\\INC - 3508\\14-12-2022\\Bank\\CustomerList.ser");
			ObjectInputStream in = new ObjectInputStream(fin);
			list = (ArrayList<Customer>)in.readObject();
			in.close();
			fin.close();
			System.out.println("Deserialization Success!");
		}
		catch(IOException e){}
		catch(ClassNotFoundException e){}
		return list;
	}

	public void doSerialization(Customer cust) 
	{
		ArrayList<Customer> list = doDeSerialization();
		list.add(cust);
		try
		{
			FileOutputStream fout = new FileOutputStream("C:\\Users\\Administrator\\Desktop\\INC - 3508\\14-12-2022\\Bank\\CustomerList.ser");
			ObjectOutputStream out = new ObjectOutputStream(fout);
			out.writeObject(list);
			out.flush();
			out.close();
			fout.close();
			System.out.println("Serialization success");
		}
		catch(IOException e){}
	}
}