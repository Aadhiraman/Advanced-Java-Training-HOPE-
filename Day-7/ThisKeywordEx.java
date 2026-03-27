package Day7.Programs;
import java.util.*;
public class ThisKeywordEx {
    public static void main(String[] args) {
        var student1 = new NameAndRollNo("Criston", "312324104060");
        var student2 = new NameAndRollNo("Cable Osebert", "312324104002");
        var student3 = new NameAndRollNo("Babu", "3123241034016");
        student1.display();
        student2.display();
        student3.display();
        System.out.println(student1.hashCode());
        System.out.println(student2.hashCode());
        System.out.println(student3.hashCode());

    }
}
class NameAndRollNo
{
    String name;
    String  rollno;
    public NameAndRollNo(String stdname, String stdrollno)
    {
          this.name = stdname;
          this.rollno = stdrollno;

    }
    void display()
    {
        IO.println("Name is:"+name);
        IO.println("RollNo is: "+rollno);
    }

    }

