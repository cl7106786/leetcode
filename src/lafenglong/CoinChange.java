package lafenglong;

import java.util.Arrays;

public class CoinChange {
    public static void main(String[] args) {
        int[] coins = new int[]{1 , 2 ,5};
        int i = coinChange(coins, 11);
    }

    public static int coinChange(int[] coins, int amount) {
        //用动态方程来解决
        //这里的dp存储的也就是如果amout是i的时候，最少的硬币数量
        int[] dp = new int[amount + 1];

        Arrays.fill(coins , amount + 1);

        dp[0] = 0;
        //需要填充dp的每一个值
        for(int i = 1; i <= amount; i++)
        {
            for(int j = 0; j < coins.length; j++)
            {
                if(i - coins[j] >= 0 && dp[i - coins[j]] != amount + 1)
                {
                    dp[i] = Math.min(dp[i] , dp[i - coins[j]] + 1);
                }
            }
        }
        if(dp[amount] == amount + 1)
        {
            return -1;
        }
        return dp[amount];
    }
}
