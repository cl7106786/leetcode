package lafenglong;

import java.util.HashMap;
import java.util.Map;

public class MostFrequency {

    public static void main(String[] args) {
        int[] nums = new int[] {1 ,3 ,2 ,3};
        int i = mostFrequency(nums);

        System.out.println(i);
    }
    /**
     *  1, 1 ,2 ,3  最高频率1
     * @param nums
     * @return
     */
    public static int mostFrequency(int[] nums) {
        if(nums == null || nums.length == 0) {
            return 0;
        }
        Map<Integer , Integer> map = new HashMap<>();
        for(int num : nums) {
            map.put(num , map.getOrDefault(num, 0) + 1);
        }
        int res = 0;
        int max = 0;
        for(Map.Entry<Integer, Integer> entry: map.entrySet()) {
            Integer value = entry.getValue();
            if (value > max) {
                max = value;
                res = entry.getKey();
            }
        }
        return res;
    }
}
