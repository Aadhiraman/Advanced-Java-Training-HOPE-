package model;

public class Customer {
    private int customerId;
    private String name;

    public Customer(int id, String name) {
        this.customerId = id;
        this.name = name;
    }

    public void display() {
        System.out.println(customerId + " - " + name);
    }
}
