package lafenglong.数组;

import java.util.Arrays;

/**
 * Create by chenlong on 2023/9/30 06:59
 */
public class 三个数的最大乘机 {
    public static void main(String[] args) {
        int[] nums =  {10000,10000,10000,10000,10000,10000,10000,10000,10000,10000,10000,10000,10000,10000,10000,10000,10000,10000,10000,10000};
        long solve = solve(nums);
        System.out.println(solve);
    }
    public static long solve (int[] A) {
        // write code here
        // 三个数的最大乘机
        if(A == null || A.length < 3) {
            return 0;
        }
        Arrays.sort(A);
        long result  = 0L;
        // 全部是正数       1.三个最大正数
        // 全部是负数       2.三个最大负数
        // 有正有负         3.两个最小负数*一个最大正数, 或者3个正数
        int length = A.length;
        long max1 = A[length - 1];
        long max2 = A[length - 2];
        long max3 = A[length - 3];
        long min1 = A[0];
        long min2 = A[1];
        result =  Math.max(max1 * max2 * max3, min1 * min2 * max1);
        return result;

    }
}
