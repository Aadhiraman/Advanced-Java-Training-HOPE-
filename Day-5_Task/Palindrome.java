import java.util.*;
public class Palindrome {
  public static boolean isPalindrome(String s) {
        s= s.toLowerCase();
        s=s.replaceAll("[^A-Za-z0-9]","");
        int start=0,end=s.length()-1;
        while(start<end){
            if(s.charAt(start)!=s.charAt(end)){
                return false;
            }start++;
            end--;
        }return true;
    }
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String s = sc.nextLine();
      System.out.println(isPalindrome(s));
    }
}
