import java.util.Scanner;

public class LeetCode_1295 {
    public static int findNumbers(int[] nums) {
       int count = 0;
       for(int num:nums){
            if(even(num)){
                count++;
            }
       }
       return count;
    }
    public static boolean even(int num){
        int count = 0;
        while(num>0){
            count++;
            num/=10;
        }
        return count%2==0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int count = findNumbers(arr);
        System.out.println(count);
    }
}
