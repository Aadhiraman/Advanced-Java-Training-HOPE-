package Day6.Task;
import java.util.*;
public class LC41 {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int i = 0;
        int ctr = 1;
        while(i<nums.length && nums[i] <= 0)
        {
            i++;
        }
        for(;i<nums.length;i++)
        {
            if(nums[i] > ctr)
            {
                return ctr;
            }
            else if(nums[i] == ctr)
            {
                ctr++;
            }
        }
        return ctr;
    }
}
