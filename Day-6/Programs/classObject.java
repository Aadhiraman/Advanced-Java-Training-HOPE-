package Day6.Programs;
import java.util.*;
public class classObject {
     public static void  main(String [] args)
     {
         apartment apt = new apartment(273,"2BHK",3);
         apt.display();
     }
}
class apartment
{
    int house_no;
    String  house_type;
    int floor;

    public apartment(int house_no, String house_type, int floor)
    {
        this.house_no = house_no;
        this.house_type = house_type;
        this.floor = floor;
    }
    public void display()
    {
        System.out.println("The house number is: "+house_no);
        System.out.println("The type opf house is: "+house_type);
        System.out.println("The floor is: "+floor+"rd floor");

    }
}
