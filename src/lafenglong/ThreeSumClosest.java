package lafenglong;

import java.util.Arrays;

public class ThreeSumClosest {

    public static void main(String[] args) {
        int []nums = new int[]{-1,2,1,-4};
        threeSumClosest(nums ,1);
    }
    public static int threeSumClosest(int[] nums, int target) {
        if(nums == null || nums.length < 3) return -1;
        // 也就是需要a + b + c = sum  , Math.abs(sum - target) = close, 找到一个最小的close

        int result = 0;
        //给数组来个排序
        Arrays.sort(nums);
        int ans = nums[0] + nums[1] + nums[2];
        int length = nums.length;
        for(int i = 0; i < length - 2; i++)
        {
            int j = i + 1;
            int k = length -1;
            while(j < k)
            {
                int sum = nums[i] + nums[j] + nums[k];
                //如果sum和target的距离，小于之前三数之后与target的距离，则替换
                if(Math.abs(sum - target) < Math.abs(ans - target))
                {
                    ans = sum;
                }
                if(sum > target)
                {
                    k--;
                }
                if(sum < target)
                {
                    j++;
                }
                //如果已经找到一个sum和target相等，那就是最接近的
                if(sum == target)
                {
                    return sum;
                }
            }
        }
        return ans;
    }
}
