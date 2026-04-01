package Day9.Programs;

public class Interface {
    public static void main(String [] args)
    {
        C c = new C();
        c.display();
        c.show();
    }
}
interface A
{
    void show();
}
interface B
{
    void display();
}
class C implements B,A
{
    public void display()
    {
        System.out.println("Hello...");
    }
    public void show()
    {
        System.out.println("Hi...");
    }
}