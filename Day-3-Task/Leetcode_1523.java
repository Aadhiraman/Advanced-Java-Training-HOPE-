import java.util.Scanner;

class Leetcode_1523 {
    public static int countOdds(int low, int high) {
        return ((high + 1) / 2) - (low / 2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int low = sc.nextInt();
        int high = sc.nextInt();
        int op = countOdds(low,high);
        System.out.print(op);
    }
}