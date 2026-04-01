package Day10.Task;
import java.util.*;
public class AccessModifiersEx {
    public static void main(String[] args) {

        ElectricCar car = new ElectricCar();

        car.showDetails();
        car.showElectricDetails();

        System.out.println("Type: " + car.type);
        System.out.println("Wheels: " + car.wheels);
        System.out.println("Brand: " + car.brand);
    }
}

class Vehicle {

    private String engine = "V8 Engine";
    String type = "General Vehicle";
    protected int wheels = 4;
    public String brand = "Generic Brand";

    public String getEngine() {
        return engine;
    }
}

class Carr extends Vehicle {

    public void showDetails() {
        System.out.println("Type: " + type);
        System.out.println("Wheels: " + wheels);
        System.out.println("Brand: " + brand);
        System.out.println("Engine: " + getEngine());
    }
}

class ElectricCar extends Carr {

    public void showElectricDetails() {
        System.out.println("Type: " + type);
        System.out.println("Wheels: " + wheels);
        System.out.println("Brand: " + brand);
        System.out.println("Engine: " + getEngine());
    }
}
