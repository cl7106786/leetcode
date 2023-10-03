package lafenglong.数组;

/**
 * Create by chenlong on 2023/9/30 21:17
 * 偶数放到后面，奇数放到前面，不在乎顺序
 */
public class 偶数全部放到后面 {

    public static void main(String[] args) {
        //int[]nums = {}
    }
    private int[] sortArray(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        while(start < end) {
          //后面的找到第一个奇数
            while(start < end && nums[end] % 2 == 0) {
                end--;
            }
            while (start < end && nums[start] % 2 != 0){
                start++;
            }
            int tmp = nums[end];
            nums[end]= nums[start];
            nums[start] = tmp;
            end--;
            start++;
        }
        return nums;

    }
}

