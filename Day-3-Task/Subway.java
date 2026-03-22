import java.util.Scanner;

public class Subway {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Subway Game");
        System.out.println("1 -Run");
        System.out.println("2 -Jump");
        System.out.println("3 -Slide");
        System.out.println("4 -Move Left");
        System.out.println("5 -Move Right");
        System.out.println("0 -Exit Game");

        boolean flag = true;
        while(flag){
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            switch (choice) {
            
            case 1:
                System.out.println("You are running!");
                break;
            case 2:
                System.out.println("You jumped!");
                break;
            case 3:
                System.out.println("You slid");
                break;
            case 4:
                System.out.println("You moved left");
                break;
            case 5:
                System.out.println("You moved right");
                break;
            case 0:
                System.out.println("Exiting game..");
                flag = false;
                break;
            default:
                System.out.println("Wrong choice Try Again");
            }
        }
    }
}

