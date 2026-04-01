package Day9.Programs;

public class Abstraction {
    public static void main(String [] args)
    {
        Dog dog = new Dog();
        dog.sound();
        dog.eat();
    }
}
abstract class Animal
{
    void eat()
    {
        System.out.println("Eating....");
    }
    abstract void sound();
}
class Dog extends Animal
{
    void sound()
    {

        System.out.println("Dog Barks");
    }
}
class Cat extends Animal
{
    void sound()
    {
        System.out.println("Cat Meows.......");
    }
}
