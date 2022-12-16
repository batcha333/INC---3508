import java.util.*;
import java.sql.*;
public class JDBC_connection
{
	static Connection con = null;

	static Connection getConnection()
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank","root","root");
		}
		catch(Exception e){}
		return con;
	}
	public static void insert()
	{
		try
		{
			Scanner in = new Scanner(System.in);	
			PreparedStatement ps = con.prepareStatement("insert into Customer values(?,?,?,?,?)");
			System.out.print("Enter customer Id : ");
			int id = in.nextInt();
			System.out.print("Enter customer AccoutNo : ");
			int acc = in.nextInt();
			System.out.print("Enter customer Name : ");
			String name = in.next();
			System.out.print("Enter customer Account Balance : ");
			int bal = in.nextInt();
			System.out.print("Enter customer password : ");
			String pass = in.next();			
			ps.setInt(1,id);
			ps.setInt(2,acc);
			ps.setString(3,name);
			ps.setInt(4,bal);
			ps.setString(5,pass);
			ps.executeUpdate();
			System.out.println("------------------------------------------------");
			System.out.println("Values Inserted successfully!");
			System.out.println("------------------------------------------------");
			//String sql="insert into Customer values(22,22022,'Mari',10000,'doraemon')";
		}
		catch(SQLException e){}
	}

	public static void read()
	{
		String sql = "SELECT * FROM Customer";
		try
		{
			Statement smt = con.createStatement();
			ResultSet rs = smt.executeQuery(sql);
			System.out.println("Id\tAcc.No\tName\tBalance\tPassword");
			System.out.println("------------------------------------------------");
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+"\t"+rs.getInt(2)+"\t"+rs.getString(3)+"\t"+rs.getInt(4)+"\t"+rs.getString(5));
			}
			smt.close();
			System.out.println("------------------------------------------------");
		}
		catch(SQLException e){}
	}
	
	public static void update()
	{
		try
		{
			Scanner in = new Scanner(System.in);
			System.out.print("Enter customer Id : ");
			int id = in.nextInt();	
			PreparedStatement ps = con.prepareStatement("update Customer set balance = ? where custId = "+id);
			System.out.print("Enter new customer Account Balance : ");
			int bal = in.nextInt();			
			ps.setInt(1,bal);
			ps.executeUpdate();
			System.out.println("------------------------------------------------");
			System.out.println("Balance updated successfully!");
			System.out.println("------------------------------------------------");
			//String sql="insert into Customer values(22,22022,'Mari',10000,'doraemon')";
		}
		catch(SQLException e){}
	}

	public static void delete()
	{
		try
		{
			Scanner in = new Scanner(System.in);
			System.out.print("Enter customer Id : ");
			int id = in.nextInt();	
			PreparedStatement ps = con.prepareStatement("delete from Customer where custId = "+id);		
			ps.executeUpdate();
			System.out.println("------------------------------------------------");
			System.out.println("Values deleted successfully!");
			System.out.println("------------------------------------------------");
		}
		catch(SQLException e){}
	}
	
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		con = getConnection();
		boolean flag = true;
		while(flag)
		{
			System.out.print("\nMenu-->\n1.Insert\n2.Read\n3.Update\n4.Delete\n5.Exit\nEnter your choice : ");
			int choice = in.nextInt();
			switch(choice)
			{
				case 1 : insert();break;
				case 2 : read();break;
				case 3 : update();break;
				case 4 : delete();break;
				case 5 : System.out.println("Thank you!");flag=false;break;
			}
		}
	}
}