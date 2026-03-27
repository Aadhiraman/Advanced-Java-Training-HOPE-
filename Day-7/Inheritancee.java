package Day7.Programs;

public class Inheritancee {
    public static void main(String [] args)
    {
        Parentt par = new Childd();
        /*Here par object is created only for Parentt so child display1 cant be accessed so that
         it wont be executed....and also here child class is created along with the object only for
         accessing the parent....the childd class created is for no use it is used only to ACCESS the parent
         ...You cant utilize it anywhere...just to know some concept is present like this*/
        par.display();
    }
}
class Parentt{
    void display()
    {
        System.out.println("Hi from Parent class");
    }
}
class Childd extends Parentt{
    void display1()
    {
        System.out.println("Hi from Child Class");
    }
}
