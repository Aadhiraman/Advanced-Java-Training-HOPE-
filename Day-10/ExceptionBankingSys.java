
import java.util.*;
public class ExceptionBankingSys {
    public static void main(String [] args)
    {
        try
        {
            Bank customer1 = new Bank(12000,0417);
            customer1.deposit(200,044);
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
class InheritanceException extends Exception{
    InheritanceException(String message)
    {
        super(message);
    }
}
class Bank
{
    private double balance;
    private int password;
    int account_number;
    Bank(double balance,int password)
    {
         this.balance = balance;
        this.password = password;
    }
    void deposit(int val,int pwd) throws InheritanceException
    {
        if(this.password == pwd) {
            if (val != 0) {
                this.balance += val;
                System.out.println("The balance is: "+this.balance);
            } else {
                throw new InheritanceException("Amount can't be negative");
            }
        }
        else
        {
            throw new InheritanceException("Wrong Password");
        }
     }
     void withdraw(int val,int pwd) throws InheritanceException
     {
         if(this.password == pwd)
         {
             if (balance == 0) {
                 throw new InheritanceException("Amount cant be withdrawed");
             } else {
                 System.out.println("Rupees " + val + " Debbited");
                 this.balance -= val;
             }
         }
         else
         {
             throw new InheritanceException("Password was Wrong");
         }
     }
     void getBAlance(int pwd) throws InheritanceException
     {
        if(this.password == pwd)
        {
            System.out.println("The balance is: "+this.balance);
        }
        else
        {
            throw new InheritanceException("Enter the correct password");

         }
     }
}

