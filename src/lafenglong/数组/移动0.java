package lafenglong.数组;

/**
 * Create by chenlong on 2023/10/1 16:19
 */
public class 移动0 {
    public static void main(String[] args) {
        int[] nums = {1,2,0,3};
        int[] ints = moveZeroes(nums);
        for(int num: ints) {
            System.out.println(num);
        }
    }
    public static int[] moveZeroes (int[] nums) {
        if (nums == null) return null;
        //第一次遍历 找到非0的元素
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[j++] = nums[i];
            }
        }
        //第二次遍历将j指针以后 的元素 赋0
        for (int i = j; i < nums.length; i++) {
            nums[i] = 0;
        }

        return nums;
    }
}
