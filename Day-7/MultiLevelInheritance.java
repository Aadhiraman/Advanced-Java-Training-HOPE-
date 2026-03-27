package Day7.Programs;
import java.util.*;
public class MultiLevelInheritance {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.bark();
        System.out.println(dog.hashCode());
    }
}
class Animal
{
    void display()
    {
        System.out.println("This is an Animal");
    }
}
class Dog extends Animal{
        void bark()
        {
            System.out.println("Dog is Barking");
        }
}


