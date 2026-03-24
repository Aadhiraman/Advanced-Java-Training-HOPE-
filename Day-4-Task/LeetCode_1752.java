import java.util.Scanner;

public class LeetCode_1752 {
    public static boolean check(int[] nums) {
        int n = nums.length;
        int count = 0;
        for(int i=0;i<n;i++){
            if(nums[i]> nums[(i+1) %n]){
                count ++;
                if(count >1){
                    return false;
                }
            }
            
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(check(arr));
    }
}
