package Day2;

import java.util.Scanner;

public class MathematicalOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("The sum is "+ (a+b));
        System.out.println("The sub is "+ (a-b));
        System.out.println("Multiplication of a and b is "+ (a*b));
        System.out.println("Division of a and b is "+ (a/b));
        System.out.println("Remainder of a and b is "+a%b);
        sc.close();   
    }
}
