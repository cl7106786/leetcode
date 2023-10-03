package lafenglong.数组;

/**
 * Create by chenlong on 2023/10/1 10:11
 */
public class 冒泡排序 {
    public static void main(String[] args) {
        int[]nums = {5,2,3,1,4};
        int[] ints = bubbleSort(nums);
        for(int i : ints) {
            System.out.println(i);
        }
    }

    private static int[] bubbleSort(int[] nums) {
        for(int i =0; i < nums.length; i++) {
            for(int j = 0; j < nums.length - i - 1; j++) {
                if(nums[j] > nums[j + 1]) {
                    int tmp = nums[j + 1];
                    nums[j + 1] = nums[j];
                    nums[j] = tmp;
                }
            }
        }
        return nums;
    }
}
