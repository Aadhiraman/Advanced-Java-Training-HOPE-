import java.util.*;

public class Mathematics{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("a: ");
        int a=sc.nextInt();
        System.out.print("b: ");
        int b=sc.nextInt();
        System.out.print("Op: ");
        String op=sc.next();
        switch (op) {
            case "+":
                System.out.println("a+b="+(a+b));
                break;
            case "-":
                System.out.println("a-b="+(a-b));
                break;
            case "*":
                System.out.println("a*b="+(a*b));
                break;
            case "/":
                System.out.println("a/b="+(a/b));
                break;
            case "%":
                System.out.println("a%b="+(a%b));
                break;
        }
    }
} 
