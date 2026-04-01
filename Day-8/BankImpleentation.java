package Day8.Programs;
import java.util.*;
import java.util.ArrayList;
public class BankImpleentation {
    public static void main(String [] args)
    {
       Account Cable_Moorthi = new Account(789076483,"Cable Moorthi",400);
       Account  Babu = new Account(831854912,"Alan babu",8000);
       Account  Criston = new Account(428640972,"Criston",246673);
       Criston.deposit(10000);
       Criston.withdraw(100);
       Criston.Balance();
       Criston.PrintAccDetails();

    }
}
class Account
{
    int Acc_Num;
    String Holder_Name;
    int Balance;

    Account(int Acc_Num, String Holder_Name, int Balance)
    {
        this.Acc_Num = Acc_Num;
        this.Holder_Name = Holder_Name;
        this.Balance = Balance;
    }

    public void deposit(int amount)
    {
        Balance += amount;
        System.out.println(amount+" deposited");
    }

    public void withdraw(int amount)
    {
        Balance -= amount;
        System.out.println(amount+" debitted");
    }
    public void Balance()
    {
        System.out.println("The balance is: "+Balance);
    }
    public void PrintAccDetails()
    {
        System.out.println("The Account Number is: "+Acc_Num);
        System.out.println("The Account Holder Name is : "+ Holder_Name);
        System.out.println("The Balance is: "+ Balance);
    }
}
/*class Bank
{
    ArrayList <Account> accounts;
    Bank()
    {
        this.accounts = new ArrayList<Account>();

    }
    public void getbalance(int id)
    {

    }
}*/