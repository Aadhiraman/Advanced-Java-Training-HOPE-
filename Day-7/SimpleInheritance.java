package Day7.Programs;
import java.util.*;
public class SimpleInheritance {
    public static void main(String [] args)
    {
        Child child = new Child();
        child.display();
    }

}
class Parent
{
    public void display()
    {
        System.out.println("You will see this when Child class is called,but the child will inherit this statement from its parent");
    }
}
class Child extends Parent
{

}
