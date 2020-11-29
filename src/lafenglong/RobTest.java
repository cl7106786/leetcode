package lafenglong;

public class RobTest {
    public static void main(String[] args) {
        int[] nums = new int[]{1,3,1,3,100};
        int rob = rob(nums);
    }
    public static int rob(int[] nums) {
        if(nums.length == 0) return 0;
        if(nums.length == 1) return nums[0];
        if(nums.length == 2) return Math.max(nums[0] , nums[1]);
        //在不偷窃第一个房子的情况下
        int first = nums[1];
        int second = nums[2];
        for(int i = 3; i < nums.length; i++)
        {
            int tmp = second;
            second = Math.max(second , first + nums[i]);
            first = tmp;
        }
        int p1 = second;
        //在不偷窃最后一个房子的情况下
        first = nums[0];
        second = nums[1];
        for(int i = 2; i < nums.length - 1; i++)
        {
            int tmp = second;
            second = Math.max(second , first + nums[i]);
            first = tmp;
        }
        return Math.max(second , p1);
    }
}
