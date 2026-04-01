package Day9.Programs;

public class AbstarctEMployee {
    public static void main(String [] args)
    {
        FullTimeEmployee fte  = new FullTimeEmployee(19273);
        fte.getSalary(10000);
        PartTimeEmployee pte = new PartTimeEmployee(75521);
        pte.getSalary(4000);
    }
}

abstract class Employee
{
    int Employee_id;
    abstract void  getSalary(int sal);
    Employee(int id)
    {
        this.Employee_id = id;
    }
}
class FullTimeEmployee extends Employee
{
    FullTimeEmployee(int id)
    {
        super(id);
    }
    public void getSalary(int sal)
    {
        System.out.println("The salary of the Full Time Employee with id "+Employee_id +" is: "+sal);
    }

}
class PartTimeEmployee extends Employee{
    PartTimeEmployee(int id)
    {
        super (id);
    }
    public void getSalary(int sal)
    {
        System.out.println("The salary of the Full Time Employee with id "+Employee_id+" is: "+sal);
    }
}
