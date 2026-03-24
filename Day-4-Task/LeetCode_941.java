import java.util.Scanner;

public class LeetCode_941 {
    public static boolean validMountainArray(int[] arr) {
        int n = arr.length;
        if(n<3){
            return false;
        }
        int ind = -1;
        for(int i=0;i<n-1;i++){
            if(arr[i]>arr[i+1]){
                ind = i;
                break;
            }
        }
        if(ind == -1|| ind == 0 || ind == n-1)
            return false;
            for(int i=0;i<ind;i++){
                if(arr[i]>=arr[i+1]){
                    return false;
                }
            }
        
        for(int i=ind;i<n-1;i++){
            if(arr[i]<=arr[i+1]){
                return false;
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
        boolean valid = validMountainArray(arr);
        System.out.print(valid);
    }
}

