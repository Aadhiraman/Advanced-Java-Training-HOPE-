

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionHandling {
    public static void main(String [] args)
    {
        try
        {
            FileReader file = new FileReader("Hope_B1.txt");
        }
        catch(FileNotFoundException e)
        {
            System.out.println("The Exception is: "+e);
        }
    }
}
