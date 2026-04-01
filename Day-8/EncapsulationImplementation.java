
import java.util.*;
public class EncapsulationImplementation {
    public static void main(String [] args)
    {
        Encapsulation encap = new Encapsulation();
        encap.display();
    }
}
class Encapsulation
{
    int a;
    public Encapsulation()
    {
        a=10;
    }
    void display()
    {
        IO.println("X:"+a);
    }
}
