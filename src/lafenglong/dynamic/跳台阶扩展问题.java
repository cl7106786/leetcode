package lafenglong.dynamic;

/**
 * Create by chenlong on 2023/10/2 17:41
 */
public class 跳台阶扩展问题 {
    public static void main(String[] args) {
        int n  = 3;
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 2;
        for(int i = 3; i <=n; i++) {
            int j = i;
            while(j > 0) {
                dp[i] += dp[--j];
            }
        }
        System.out.print(dp[n]);
    }
}
