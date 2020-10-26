package lafenglong;

import java.util.HashMap;
import java.util.Map;

public class SubArray {
    public static void main(String[] args) {
        int[] nums = new int[]{1 ,1 ,1};
        int i = subarraySum(nums, 2);
        System.out.println(i);
    }
    public static int subarraySum(int[] nums, int k) {
        //和为k的连续子数组个数
        //sum{j , i} == sum{0, j} - sum{0 , i};
        //那我吧{0 ,nums.length} 都存下来
        //num{ i , j} = k,
        //key 是数组元素下标索引，value是0到索引的和
        Map<Integer , Integer> map = new HashMap();
        int sumArray = 0;
        for(int i = 0; i < nums.length; i++)
        {
            sumArray+= nums[i];
            map.put(i , sumArray);
        }
        int counter = 0;
        //先暴力解法
        if(nums == null || nums.length == 0) return 0;
        for(int i = 0; i < nums.length; i++)
        {
            for(int j = i; j < nums.length; j++)
            {
                int sum = 0;
                if(i == 0) {
                    sum = map.get(j);
                }
                else
                {
                    if(i == j)
                    {
                        sum = nums[j];
                    }
                    else{
                        sum = map.get(j) - map.get(i);
                    }

                }
                if(sum == k)
                {
                    counter++;
                }
            }
        }
        return counter;
    }
}
