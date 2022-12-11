
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationDemo {
    public static void main(String[] args) throws IOException{
        Employee emp = new Employee();
        emp.name = "Faadil Batcha";
        emp.address = "Pondicherry";
        try{
            FileOutputStream fileOut = new FileOutputStream("D:\\JAVA\\file1.txt");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(emp);
            out.close();
            fileOut.close();
            System.out.println("Successfully created!");
        }
        finally{
            System.out.println("Finale");
        }
    }
}
