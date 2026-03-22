import java.util.ArrayList;
import java.util.Scanner;

public class Leetcode_2525 {

    public static String categorizeBox(int length, int width, int height, int mass) {
        ArrayList<String>str=new ArrayList<>();
        long volume=(long)length*width*height;
        if(length>=10000|| width>=10000||height>=10000||volume>=1000000000){
            str.add("Bulky");
        }
        if(mass>=100){
            str.add("Heavy");
        }
        int n=str.size();
        if(n==2){
            return "Both";
        }
        else if(n==0){
            return "Neither";
        }
        return str.get(0);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int width = sc.nextInt();
        int height = sc.nextInt();
        int mass = sc.nextInt();
        String result = categorizeBox(length, width, height, mass);
        System.out.println(result);
    }

}

