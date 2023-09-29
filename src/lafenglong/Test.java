package lafenglong;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Create by chenlong on 2023/8/31 15:57
 */
public class Test {
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        Set<Integer> set = new HashSet();
        List<Integer> result = new ArrayList();
        for(int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        for(int i = 1; i <= nums.length; i++) {
            if(!set.contains(i)) {
                result.add(Integer.valueOf(i));
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int []nums= {4,3,2,7,8,2,3,1};
        List<Integer> disappearedNumbers = findDisappearedNumbers(nums);
        System.out.println(disappearedNumbers);
    }
}
