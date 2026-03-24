import java.util.Scanner;

public class GradingSystem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the cgpa for grading : ");
        double cgpa=sc.nextDouble();
        if(cgpa>=8.5){
            System.out.println("FirstClass with Distinction");
        }
        else if(cgpa>=7.5){
            System.out.println("FirstClass");
        }
        else if(cgpa>=6.5){
            System.out.println("Second class");
        }
        else if(cgpa>5){
            System.out.println("ThirdClass");
        }
        else{
            System.out.println("Not Graduated");
        }

    }
}