package lafenglong.dynamic;

import java.util.Arrays;
import java.util.Map;

public class MaxContinuous {
    public static int maxSum(int []nums) {
        //[-2, 1, -3, 1, -1, 6, 2, -5, 4], 有正数，有负数
        int []dp = new int[nums.length];
        //dp[i] 代表数组第i个结尾的最大子数和
        dp[0] = nums[0];
        Arrays.fill(dp   , 0);
        int max = 0;
        for(int i = 1; i < nums.length; i++) {
            dp[i] = Math.max(nums[i] , dp[i - 1] + nums[i]);
            max = Math.max(max , dp[i]);
        }
        return max;
    }

    public static void main(String[] args) {
        int []nums = {-2, 1, -3, 1, -1, 6, 2, -5, 4};
        int i = maxSum(nums);
        System.out.println(i);
    }
}
