package lafenglong;

import java.util.HashSet;

public class FindMaxConsecutiveOnes {

    public static void main(String[] args) {
        int[] nums = new int[]{1,0,1,1,0,1};
        int maxConsecutiveOnes = findMaxConsecutiveOnes(nums);
        System.out.println(maxConsecutiveOnes);
        HashSet<Object> objects = new HashSet<>();

        String s = "11123";


    }

    public static int findMaxConsecutiveOnes(int[] nums) {
        if(nums == null || nums.length == 0 ) return 0;
        int max = 0;
        int j = 0;
        boolean exchange = false;
        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] == 0 || (nums[i] == 1 && i == nums.length -1))
            {
                int gap = i - j;
                max = Math.max(gap , max);
                exchange = true;
            }
            if(nums[i] == 1 && exchange)
            {
                j = i;
                exchange = false;
            }
        }
        return max;
    }
}
