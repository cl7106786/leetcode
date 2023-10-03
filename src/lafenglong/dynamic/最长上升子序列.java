package lafenglong.dynamic;

import java.util.Arrays;

/**
 * Create by chenlong on 2023/10/1 15:29
 */
public class 最长上升子序列 {
    public static void main(String[] args) {
        int[] nums = {6,3,1,5,2,3,7};
        int lis = LIS(nums);
        System.out.println(lis);
    }
    public static int LIS (int[] arr) {
        // write code here
        if(arr == null || arr.length == 0) {
            return 0;
        }
        int length = arr.length;
        int[]dp = new int[length];
        Arrays.fill(dp, 1);
      //  dp[0] = 1;
        int max = 0;
        for(int i = 0; i < length; i++) {
            for(int j = 0; j < i; j++) {
                if(arr[i] > arr[j]) {
                    dp[i] = Math.max(dp[j] + 1, dp[i]);
                    max = Math.max(dp[i], max);
                }
            }
        }
        return max;
    }
}
