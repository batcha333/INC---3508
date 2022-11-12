import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
public class DatabaseDemo {
    public static void main(String[] args) throws Exception {
        Connection con = null;
        Statement smt = null;
        try{
            System.out.println("Registering the Driver..........");
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/firstdb", "root", "");
            System.out.println("Connected..........");
            smt=con.createStatement();
            ResultSet rs = smt.executeQuery("SELECT * FROM mytable;");
            System.out.println("ResultSet generated..........");
           
            while(rs.next())
            {
                System.out.println("***********************************");
                System.out.println("Emp_ID-->"+rs.getInt(1));
                System.out.println("Emp_Name-->"+rs.getString(2));
		    System.out.println("Emp_Name-->"+rs.getString(3));
                System.out.println("Emp_Salary-->"+rs.getDouble(4));
            }
            smt.close();
            con.close();
        }catch(Exception e)
        {
           e.getMessage();
        }
    }
}
