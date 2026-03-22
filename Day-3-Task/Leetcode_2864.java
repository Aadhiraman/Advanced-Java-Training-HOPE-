import java.util.Scanner;

public class Leetcode_2864 {
    public static String maximumOddBinaryNumber(String s) {
        int ones = 0;
        int zeros = 0;
        for (char c:s.toCharArray()) {
            if (c =='1') {
                ones++;
            } else {
                zeros++;
            }
        }
        StringBuilder result =new StringBuilder();
        for (int i=0;i<ones-1; i++) {
            result.append('1');
        }
        for (int i=0;i<zeros;i++) {
            result.append('0');
        }
        result.append('1');
        return result.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String result = maximumOddBinaryNumber(s);
        System.out.println(result);

    }
}
