package lafenglong.dynamic;

/**
 * Create by chenlong on 2023/10/2 18:51
 */
public class 使用最小话费爬楼梯 {
    public static void main(String[] args) {
        int n = 3;
        int[]costs = {2, 5, 20};
        int[]dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 0;
        for(int i = 2; i <= n; i++) {
            dp[i] = Math.min(dp[i - 2] + costs[i - 2], dp[i - 1] + costs[i - 1]);
        }
        String str = "1";
        System.out.print(dp[n]);

    }
}
