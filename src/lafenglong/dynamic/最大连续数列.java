package lafenglong.dynamic;

/**
 * Create by chenlong on 2023/10/1 15:52
 * 给定一个整数数组，找出总和最大的连续数列，并返回总和。
 */
public class 最大连续数列 {
    public static void main(String[] args) {
        int[] nums = {-2,1};
        int i = maxSubArray(nums);
        System.out.println(i);

    }
    public static int maxSubArray(int[] nums) {
        if(nums == null || nums.length == 0) {
            return 0;
        }
        int length = nums.length;
        int[] dp = new int[length];
        dp[0] = nums[0];
        int max = nums[0];
        for(int i = 1; i < length; i++) {
            dp[i] = Math.max(dp[i] , dp[i - 1] + nums[i]);
            max = Math.max(dp[i] , max);
        }
        return max;
    }
}
