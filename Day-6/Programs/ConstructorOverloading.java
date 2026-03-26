package Day6.Programs;
import java.util.*;
public class ConstructorOverloading {
    public static void main(String [] args)
    {
        Overloading load1 = new Overloading("Hello");
        Overloading load2 = new Overloading("Hello","Criston");
        Overloading load3 = new Overloading("Hello","Criston","St.Joseph's");

    }
}
class Overloading
{
    String a,b,c,d;
    public Overloading(String a)
    {
        this.a = a;
        System.out.println(a+a);
    }
    public Overloading(String a, String b)
    {
        this.a = a;
        this.b = b;
        System.out.println(a+b);
    }
    public Overloading(String a,String b,String c)
    {
        this.a = a;
        this.b = b;
        this.c = c;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
