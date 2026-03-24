
import java.util.Scanner;

public class parameters { 
    // 1. Parameter, no return
    public static void fun1(int x) {
        System.out.println("Value of x: " + x);
    }
    // 2. Parameter, return value
    public static int fun2(int x, int y) {
        return x + y;
    }
    // 3. No parameter, return value
    public static int fun3() {
        return 10;
    }
    // 4. No parameter, no return
    public static void fun4() {
        System.out.println("No parameter, no return");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Parameter, no return:");
        fun1(5);
        System.out.println("\n2. Parameter, return value:");
        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int result = fun2(a, b);
        System.out.println("Result: " + result);
        System.out.println("\n3. No parameter, return value:");
        int result2 = fun3();
        System.out.println("Result: " + result2);
        System.out.println("\n4. No parameter, no return:");
        fun4();
        sc.close();
    }
}

