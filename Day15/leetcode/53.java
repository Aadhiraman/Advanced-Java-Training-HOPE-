class Solution {
    public int maxSubArray(int[] nums) {
        int sum = 0, best = Integer.MIN_VALUE;

        for(int i: nums){
            sum = Math.max(i, sum + i);
            best = Math.max(sum, best);
        }

        return best;

    }
}