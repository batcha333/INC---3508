import java.io.*;
import java.util.*;
public class Main
{	
	static Scanner in = new Scanner(System.in);
	static SerializationClass sc = new SerializationClass();
	ArrayList<Product> productList;
		
	public Main(){}
	
	public Main(ArrayList<Product> productList)
	{
		this.productList = productList;
	}

	void addProduct()
	{
		ArrayList<Integer> temp = sc.doDeSerializationforId();
		System.out.println();
		System.out.print("Enter Product Name : ");
		String name = in.next();
		System.out.print("Enter Product Cost : ");
		double cost = in.nextDouble();
		System.out.print("Enter Product Type : ");
		char type = in.next().charAt(0);	
		Product p = new Product();
		p.setProductName(name);
		p.setProductCost(cost);
		p.setProductType(type);	
		productList.add(p);
		int id = temp.get(temp.size()-1)+1;
		p.setProductId(id);
		sc.doSerialization(p);
		System.out.println("Successfully Added");
		sc.doSerializationforId(id);
	}

	void updateProduct()
	{
		System.out.print("Enter Product Name : ");
		String name = in.next();
		for(Product p : productList)
		{
			if(p.getProductName().equals(name))
			{
				System.out.print("Enter new cost : ");
				double newCost = in.nextDouble();
				p.setProductCost(newCost);
				System.out.println("Successfully Updated");
			}
			else
			{
				System.out.println("No such Product Available!!!");
			}
		}
		sc.doSerialization(productList);
	}

	void deleteProduct()
	{
		System.out.print("Enter Product Name : ");
		int id = in.nextInt();
		for(Product p : productList)
		{
			if(p.getProductId()==id)
			{
				productList.remove(p);
				System.out.println("Successfully deleted");
			}
			else
			{
				System.out.println("No such Product Available!!!");
			}
		}
		sc.doSerialization(productList);
	}
	
	void showProduct()
	{
		ArrayList<Product> productList = sc.doDeSerialization();
		if(productList.isEmpty())
			System.out.println("Empty List");
		else
		{
			System.out.println("ProductId\tProductName\tProductCost\tProductType");
			for(Product p : productList)
			{
				System.out.println(p.getProductId()+"\t\t"+p.getProductName()+"   \t   "+p.getProductCost()+"\t\t    "+p.getProductType());
			}
		}
	}
	
	void productMenu()
	{
		System.out.println("MENU---->\n");
		/*productList.add(new Product("SurfExcel",75,'W'));
		productList.add(new Product("Dettol",50,'W'));
		productList.add(new Product("LifeBuoy",60,'W'));
		productList.add(new Product("DairyMilk",20,'E'));
		productList.add(new Product("5Star",15,'E'));
		sc.doSerialization(productList);*/
		boolean flag = true;
		while(flag)
		{
			System.out.print("1. Add Product\n2. Update Product\n3. Delete Product\n4. Show Product\n5. Exit\nEnter Your choice : ");
			int choice = in.nextInt();
			switch(choice)
			{
				case 1 : addProduct();break;
				case 2 : updateProduct();break;
				case 3 : deleteProduct();break;
				case 4 : showProduct();break;
				case 5 : System.out.println("ThankYou!!!!");flag = false;break;
				default : System.out.println("Enter Valid Choice!");break;
			}
		}
	}	
	
	public static void main(String[] args)
	{
		Main m = new Main(new ArrayList<>());
		Admin a = new Admin("Faadil","faadil#2001");
		System.out.println("\t\t\t\tWelcome to Product Inventory\n");
		System.out.print("Enter Admin UserName : ");
		String aName = in.next();
		String aPass = "";
		do
		{
			System.out.print("Enter Admin Password : ");
			aPass = in.next();
		}while(!aPass.equals(a.passWord));
		m.productMenu();
		in.close();
	}
}
