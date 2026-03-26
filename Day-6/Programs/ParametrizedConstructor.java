package Day6.Programs;
import java.util.*;
public class ParametrizedConstructor {
    public static void main(String [] args)
    {
        dConstructor d = new dConstructor(10);
    }
}
class dConstructor
{
    public dConstructor(int x)
    {
        //this.x = x;
        System.out.println("This is a Parametrized Constructor "+x);
    }
}
