package lafenglong;

public class MaxArea {
    public static void main(String[] args) {
        int[] height = new int[]{1,8,6,2,5,4,8,3,7};
        int i = maxArea(height);
        System.out.println(i);
    }

    public static int maxArea(int[] height) {
        //双指针，在两个数直接选择

        //最大值，这种不应该是动态规划吗

        int i = 0;
        int j = height.length - 1;
        int max = 0;
        while(i < j)
        {
            int area = (j - i) * Math.min(height[i] , height[j]);
            max = Math.max(max , area);
            i++;
            j--;
        }
        return max;
    }
}
