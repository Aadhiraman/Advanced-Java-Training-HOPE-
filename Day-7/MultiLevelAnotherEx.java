package Day7.Programs;
import java.util.*;
public class MultiLevelAnotherEx {
    public static void main(String [] args)
    {
        GrandSon grandson = new GrandSon();
        grandson.GS();
        grandson.son();

    }
}
class GrandFather
{
    void GF()
    {
        System.out.println("GrandFather");
    }
}
class Son extends GrandFather {
    void son() {
        System.out.println("Son");
    }
}
class GrandSon extends Son
{
   void GS()
   {
       System.out.println("Grandson");
   }
}
