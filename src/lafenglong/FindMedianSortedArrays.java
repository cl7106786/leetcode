package lafenglong;

import java.util.Arrays;

public class FindMedianSortedArrays {
    public static void main(String[] args) {
        int[] nums1 = new int[]{1 , 2};
        int[] nums2 = new int[]{2 , 4};
        double medianSortedArrays = findMedianSortedArrays(nums1, nums2);
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        //最直观的方法
        //两个数组组合在一起，然后排序
        int length = nums1.length + nums2.length;
        int[] result = new int[length];
        for(int i = 0; i < nums1.length; i++)
        {
            result[i] = nums1[i];
        }
        int index = nums1.length;
        for(int i = 0; i < nums2.length; i++)
        {
            result[index++] = nums2[i];
        }
        Arrays.sort(result);
        int mid_index = length / 2 -1;
        if(length % 2 ==0)
        {
            return (result[mid_index] + result[mid_index + 1]) / 2.0;
        }
        else
        {
            return result[mid_index];
        }
    }
}
