package Day7.Programs;
import java.sql.SQLOutput;
import java.util.*;
public class HeirarchialInheritance {
    public static void main(String [] args)
    {
        Son_ son = new Son_();
        Daughter daughter = new Daughter();
        son.father();
        daughter.father();
    }
}
class Father
{
    void father()
    {
        System.out.println("I'm the Father");
    }
}
class Son_ extends Father{
    void son()
    {
        System.out.println("Im the Son");
    }
}
class Daughter extends Father{
    void daughter()
    {
        System.out.println("Im the Daughter");
    }
}
