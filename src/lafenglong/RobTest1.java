package lafenglong;

public class RobTest1 {

    public static void main(String[] args) {
        int[] nums = {2, 3 ,2};
        int rob = rob(nums);
        System.out.println(rob);
    }
    public static int rob(int[] nums) {
        if(nums == null | nums.length == 0) {
            return 0;
        }
        if(nums.length == 1) {
            return nums[0];
        }
        if(nums.length == 2) {
            return Math.max(nums[0], nums[1]);
        }
        //拆分成2块
        //0 , length - 1
        //1 , length
        //dp[i] 经过每个房屋的时候，偷窃到的最大金额
        //经过当前房屋的时候，可以选择偷或者不偷
        //如果偷的话，那就是dp[i - 2] + nums[i];
        //如果当前不偷，那就是dp[i - 1];

        return Math.max(maxRob(nums, 0, nums.length - 1), maxRob(nums, 1, nums.length));
    }

    private static int maxRob(int[] nums , int start , int end) {
        int[] dp = new int[nums.length - 1];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);
        for(int i = 2; i < end; i++) {
            dp[i] = Math.max(dp[i - 2] + nums[i], dp[i - 1]);
        }
        return dp[nums.length - 1];
    }
}
