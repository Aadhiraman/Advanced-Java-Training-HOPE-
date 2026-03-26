package Day6.Programs;
import java.util.*;
public class defaultConstructor {
    public defaultConstructor()
    {
        System.out.println("Hello from Default Constructor");
    }
    public static void main(String [] args)
    {
        defaultConstructor def = new defaultConstructor();
        System.out.println("Hello from MAin Method");
        //Inga constructor um main method um ore class ulla tha iruku so antha class a call panna odane athuku ulla irukathu execute airum..
    }
}
