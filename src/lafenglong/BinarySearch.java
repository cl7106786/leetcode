package lafenglong;

public class BinarySearch {
    public static void main(String[] args) {

        BinarySearch binarySearch = new BinarySearch();
        int []nums = new int[]{5,7,7,8,8,10};
        int search = binarySearch.search(nums, 8);

    }
    int count = 0;
    public int search(int[] nums, int target) {
        if(nums == null || nums.length ==0 ) return 0;

        //在有序的数组中，可以使用二分查找来解决
        int i = 0;
        int j = nums.length -1;
        helper(nums , target , i , j);
        return count;
    }

    private void helper(int []nums , int target , int low , int high)
    {
        if(low < high)
        {
            int mid = (low + high) / 2;
            if(target == nums[mid])
            {
                count++;
                //左边查找
                helper(nums, target , low , mid -1);
                //右边查找
                helper(nums , target , mid + 1 , high);
            }
            //如果大于target,说明等于target只能在左边
            else if(nums[mid] > target)
            {
                helper(nums , target , low , mid -1);
            }
            else
            {
                helper(nums , target , mid + 1 , high);
            }
        }
    }
}
