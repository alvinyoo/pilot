/*
Define a “Employee” POJO class and make it serializable
 */
import java.io.*;

public class TopicSerializable
{
    public static void main(String [] args)
    {
        Employee e = new Employee();
        e.name = "Harry Potter";
        e.address = "12 Grimmauld Place";

        try
        {
            FileOutputStream fileOut = new FileOutputStream("/tmp/employee.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(e);
            out.close();
            fileOut.close();
            System.out.println("Serialized data is saved in /tmp/employee.ser");
        }catch(IOException i)
        {
            i.printStackTrace();
        }
    }
}

class Employee {
    String name;
    String address;
}
