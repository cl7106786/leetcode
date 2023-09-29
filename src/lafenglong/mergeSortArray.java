package lafenglong;

/**
 * Create by chenlong on 2023/8/31 15:14
 */
public class mergeSortArray {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int k = m + n;
        int[]tmp = new int[k];
        int index = 0;
        for(int i = 0, j = 0; index < k; index++) {
            if(i >= m) {
                tmp[index] = nums2[j++];
            } else if(j >= n) {
                tmp[index] = nums1[i++];
            }else if(nums1[i] >= nums2[j]) {
                tmp[index++] = nums2[j++];
            }else {
                tmp[index++] = nums1[i++];
            }
        }

        for(int i = 0; i < k; i++) {
           // nums1[i] = tmp[i];
            System.out.println(tmp[i]);
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        merge(nums1, 3, nums2, 3);
    }
}
