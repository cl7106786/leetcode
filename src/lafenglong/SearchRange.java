package lafenglong;

public class SearchRange {
    public static void main(String[] args) {
        int[] nums = new int[]{2 , 2};
        int[] ints = searchRange(nums, 3);
        System.out.println(ints);
    }

    public static int[] searchRange(int[] nums, int target) {
        //二分查找的变种
        if(nums == null || nums.length == 0) return new int[]{-1 , -1};
        int i = 0;
        int j = nums.length - 1;
        while(i <= j)
        {
            int mid = i + (j - i) / 2;
            if(target == nums[mid])
            {
                //这里去找第一个和最后一个
                int start = mid;
                //找第一个
                while(start >= 0 && nums[start] == target)
                {
                    start--;
                }
                int end = mid;
                while(end < nums.length && nums[end] == target)
                {
                    end++;
                }
                return new int[]{++start ,--end};
            }
            else if(target < nums[mid])
            {
                j = mid - 1;
            }
            else if(target > nums[mid])
            {
                i = mid + 1;
            }

        }
        return new int[]{-1 , -1};
    }
}
