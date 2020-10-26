package lafenglong;

import java.util.HashMap;
import java.util.Map;

public class TwoSumTest {
    public static void main(String[] args) {
        int[] nums = new int[]{3 , 2, 4};
        int[] ints = twoSum(nums, 6);
        System.out.println(ints);
    }

    public static int[] twoSum(int[] nums, int target) {
        //借助hash来解决
        int []result = new int[2];
        Map<Integer , Integer> map = new HashMap();
        //要找a + b = target ,也就是要找target - a = b ，所以我们转换题目到找b
        for(int i = 0; i < nums.length; i++)
        {
            map.put(nums[i] , i);
        }
        for(int i = 0; i < nums.length; i++)
        {
            int a = target - nums[i];
            if(map.containsKey(a))
            {
                return new int[]{i , map.get(a)};
            }
        }
        return result;
    }
}
