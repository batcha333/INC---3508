import java.io.*;
import java.util.*;
public class SerializationClass
{
	public void doSerialization(Product p) 
	{
		ArrayList<Product> list = doDeSerialization();
		list.add(p);
		try
		{
			FileOutputStream fout = new FileOutputStream("C:\\Users\\Administrator\\Desktop\\INC - 3508\\12-12-2022\\ProductInventory\\ProductList.ser");
			ObjectOutputStream out = new ObjectOutputStream(fout);
			out.writeObject(list);
			out.flush();
			out.close();
			fout.close();
			System.out.println("Serialization success");
		}
		catch(IOException e)
		{
			e.printStackTrace();	
		}
	}
	public ArrayList<Product> doDeSerialization() 
	{
		ArrayList<Product> list = new ArrayList<>();
		try
		{
			FileInputStream fin = new FileInputStream("C:\\Users\\Administrator\\Desktop\\INC - 3508\\12-12-2022\\ProductInventory\\ProductList.ser");
			ObjectInputStream in = new ObjectInputStream(fin);
			list = (ArrayList<Product>)in.readObject();
			in.close();
			fin.close();	
			System.out.println("DeSerialization success");
		}
		catch(IOException e)
		{}
		catch(ClassNotFoundException e)
		{}
		return list;
	}
	public void doSerialization(ArrayList<Product> productList) 
	{
		try
		{
			FileOutputStream fout = new FileOutputStream("C:\\Users\\Administrator\\Desktop\\INC - 3508\\12-12-2022\\ProductInventory\\ProductList.ser");
			ObjectOutputStream out = new ObjectOutputStream(fout);
			out.writeObject(productList);
			out.flush();
			out.close();
			fout.close();
			System.out.println("Serialization success");
		}
		catch(IOException e)
		{
			e.printStackTrace();	
		}
		 
	}
	public void doSerializationforId(int n) 
	{
		ArrayList<Integer> list = doDeSerializationforId();
		list.add(n);
		try
		{
			FileOutputStream fout = new FileOutputStream("C:\\Users\\Administrator\\Desktop\\INC - 3508\\12-12-2022\\ProductInventory\\id.ser");
			ObjectOutputStream out = new ObjectOutputStream(fout);
			out.writeObject(list);
			out.flush();
			out.close();
			fout.close();
			System.out.println("Id Serialization success");
		}
		catch(IOException e)
		{
			e.printStackTrace();	
		}
	}
	public ArrayList<Integer> doDeSerializationforId() 
	{
		ArrayList<Integer> list = new ArrayList<>();
		try
		{
			FileInputStream fin = new FileInputStream("C:\\Users\\Administrator\\Desktop\\INC - 3508\\12-12-2022\\ProductInventory\\id.ser");
			ObjectInputStream in = new ObjectInputStream(fin);
			list = (ArrayList<Integer>)in.readObject();
			in.close();
			fin.close();	
			System.out.println("Id DeSerialization success");
		}
		catch(IOException e)
		{}
		catch(ClassNotFoundException e)
		{}
		return list;
	}
}

