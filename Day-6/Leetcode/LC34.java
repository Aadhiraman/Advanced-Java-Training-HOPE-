package Day6.Leetcode;

public class LC34 {

        public int[] searchRange(int[] nums, int target) {
            int left = 0;
            int right = nums.length-1;
            boolean leftb = false, rightb = false;
            int[] arr = new int[]{-1,-1};
            while(left<=right)
            {
                if(nums[left] != target)
                {
                    left++;
                } else {
                    arr[0] = left;
                    leftb = true;


                }

                if(nums[right] != target)
                {
                    right--;
                }
                else
                {
                    arr[1] = right;
                    rightb = true;
                }
                if(leftb && rightb)
                {
                    break;
                }
            }
            return arr;

        }
}
