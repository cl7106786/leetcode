package lafenglong;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static void main(String[] args) {
        int []nums = new int[]{-1,0,1,2,-1,-4};
        List<List<Integer>> lists = threeSum(nums);
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        if(nums == null || nums.length ==0 ) return null;
        //先给数组排序，递增排序
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList();
        for(int i = 0; i < nums.length -2; i++)
        {
            if(i >0 && nums[i] == nums[i-1]) continue;
            for(int j = i +1; j < nums.length -1; j ++)
            {
                if(nums[j] == nums[j+1]) continue;
                for(int k = j +1; k < nums.length; k++)
                {
                    if(nums[k] == nums[k-1]) continue;
                    if(nums[i] + nums[j] + nums[k] ==0)
                    {
                        List<Integer> temp = new ArrayList();
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[k]);
                        result.add(temp);
                    }
                }
            }
        }
        return result;
    }
}
