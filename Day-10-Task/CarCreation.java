package Day10.Task;
import java.util.*;
public class CarCreation {
    public static void main(String [] args)
    {
        Car car = new Car("Mahindra-Scorpio","wds1234r4089",1200000,"12May2022");
        car.printValues();
    }
}
class Car
{
    String carModel;
    String chaseNumber;
    int costOfCar;
    String DOM;
    Car(String carModel, String chaseNumber, int costOfcar, String DOM)
    {
       this.carModel = carModel;
       this.chaseNumber = chaseNumber;
       this.costOfCar = costOfCar;
       this.DOM = DOM;
    }
    void printValues()
    {
        System.out.print("The Model of the Car is: "+this.carModel+" ");
        System.out.print("The Chase Number of the car is: "+this.chaseNumber+" ");
        System.out.print("The Cose of the Car is: "+this.costOfCar+" ");
        System.out.println("The Date of Manufacture is: "+this.DOM+" ");
    }

}
