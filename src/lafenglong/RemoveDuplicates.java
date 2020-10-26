package lafenglong;

import java.util.HashMap;
import java.util.Map;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] nums = new int[]{1 , 1 , 2};
        int i = removeDuplicates(nums);
        Map<Integer , Integer> map = new HashMap<>();
    }
    public static int removeDuplicates(int[] nums) {
        if(nums == null || nums.length <= 1) return 1;
        //每碰到跟上一个数相同就停下来
        int i = 0;
        //j去寻找数组的跟i不一样的数
        int j = 1;
        while(j < nums.length)
        {
            //总是去寻找下一个不等于i的数字
            while( nums[j] == nums[i])
            {
                j++;
                if(j == nums.length)
                {
                    return i;
                }
            }
            //找到之后，替换掉i的后一个元素
            nums[++i] = nums[j];
        }
        return i+1;
    }
}
