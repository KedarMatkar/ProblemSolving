// Kadanes algorithm

public class leetcode_53 {
    public int maxSubArray(int[] nums) {
        int sum = 0;
        int maximum = nums[0];
        for (int i=0; i<nums.length; i++) {
            sum += nums[i];
            maximum = Math.max(maximum, sum);
            if (sum < 0) {
                sum = 0;
            } 
        }
        return maximum;
    }
}
