package lafenglong.huawei.od;

import java.util.Scanner;

/**
 * Create by chenlong on 2023/9/21 15:13
 */
public class HJ101输入整型数组和排序标识 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String num = scanner.next();
            String str = scanner.next();
            String sort = scanner.next();
            String[] strs = str.split(" ");
            int[] ints = strArrayConvertInt(strs);
            int[] result = bubbleSort(ints, Integer.parseInt(sort));
            System.out.println(result);

        }
    }
    private static int[] strArrayConvertInt(String[] strs) {
        int[] ints = new int[strs.length];
        for(int i = 0; i < strs.length; i++) {
            ints[i] = Integer.parseInt(strs[i]);
        }
        return ints;
    }
    /**
     * 冒泡排序，升序和降序
     * @return
     */
    private static int[] bubbleSort(int[] nums, int sort) {
        for(int i = 0; i < nums.length; i++) {
            for(int j = i; j < nums.length - 1; j++) {
                if(sort == 0) {
                    //升序
                    if(nums[j] > nums[j + 1]) {
                        int temp = nums[j];
                        nums[j] = nums[j + 1];
                        nums[j + 1] = temp;

                    }
                }else {
                    //升序
                    if(nums[j] < nums[j + 1]) {
                        int temp = nums[j];
                        nums[j] = nums[j + 1];
                        nums[j + 1] = temp;

                    }
                }

            }
        }
        return nums;
    }
}
