class Solution {
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        while(n != 1){
            if(set.contains(n)){
                return false;
            }

            set.add(n);
            n = sqDig(n);
        }

        return true;
        
    }

    public static int sqDig(int n){
        int sum = 0;
        while(n > 0){
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }

        return sum;
    }
}