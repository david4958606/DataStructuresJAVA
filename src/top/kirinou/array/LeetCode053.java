package top.kirinou.array;

public class LeetCode053 {
    public int maxSubArray(int[] nums) {
        if (nums.length == 1) return nums[0];
        int ans = nums[0];
        int sum = 0;
        for (int num : nums) {
            if (sum > 0) sum += num;
            else sum = num;
            ans = Math.max(ans, sum);
        }
        return ans;
    }
}
