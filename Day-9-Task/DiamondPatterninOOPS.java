package Day9.Task;
import java.util.*;
public class DiamondPatterninOOPS {
    public static void main(String [] args)
    {
       Child child = new Child();
       child.show();
       child.print();
    }
}
class TopTier
{
    void show()
    {
        System.out.println("This is the top tier in the DIAMOND PATTERN Hierarchy");
    }
}
interface B
{
    void show();
    default void print()
    {
        System.out.println("This is a Default function");
    }
}
interface C
{
    void show();
    default void print()
    {
        System.out.println("This is a Default Constructor1");
    }
}
class Child extends TopTier implements B,C
{
    @Override
    public void show()
    {
        super.show();
    }
    public void print()
    {
        System.out.println("Hello from Child class");
    }
}
