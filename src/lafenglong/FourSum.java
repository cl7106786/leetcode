package lafenglong;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {
    public static void main(String[] args) {
        int[] nums = new int[]{-1,0,-5,-2,-2,-4,0,1,-2};
        List<List<Integer>> lists = fourSum(nums, -9);
        System.out.println(lists);
    }
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList();
        //如果数组元素小于4个，直接返回
        if(nums == null || nums.length < 4) return result;
        int length = nums.length;
        //对元素进行排序
        Arrays.sort(nums);
        for(int i = 0; i < nums.length - 3; i++)
        {
            //最小的元素之和,如果最小的元素之后都比target大，那就不需要再往下进行了
            if(nums[i] + nums[i + 1] + nums[i + 2] + nums[i + 3] > target)
            {
                break;
            }
            //如果最大的都比target小，则i要往后走
            if(nums[i] + nums[length - 3] + nums[length - 2] + nums[length - 1] < target)
            {
                continue;
            }
            //如果i元素与之前的相等,去重
            if(i > 0 && nums[i] == nums[i - 1])
            {
                continue;
            }
            for(int j = i + 1; j < nums.length - 2; j++)
            {
                //最小的元素
                if(nums[i] + nums[j] + nums[j + 1] + nums[j + 2] > target)
                {
                    break;
                }
                //最大的元素要比target还要小，j要往后走
                if(nums[i] + nums[j] + nums[length - 2] + nums[length - 1] < target)
                {
                    continue;
                }
                if(j > i + 1 && nums[j] == nums[j - 1])
                {
                    continue;
                }
                int k = j + 1;
                int l = nums.length - 1;
                while(k < l)
                {
                    int sum = nums[i] + nums[j] + nums[k] + nums[l];
                    if(sum == target)
                    {
                        result.add(Arrays.asList(nums[i] , nums[j] , nums[k] , nums[l]));
                        k++;
                        while(k < l && nums[k] == nums[k + 1])
                        {
                            k++;
                        }
                        l--;

                        while(k < l && nums[l] == nums[l - 1])
                        {
                            l--;
                        }

                    }
                    else if(sum > target)
                    {
                        l--;
                    }
                    else if(sum < target)
                    {
                        k++;
                    }
                }
            }
        }
        return result;
    }
}
