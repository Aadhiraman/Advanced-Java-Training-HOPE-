
import java.util.*;
public class GetterSetter {
    public static void main(String [] args)
    {
        Name n = new Name();
        n.setName("Criston infanto Rex R");
        System.out.println(n.getName());
    }
}
class Name
{
    private String name;
    void setName(String name1)
    {
        this.name = name1;
    }
    String getName()
    {
        return name;
    }
}

