class Solution {
    public int numTilings(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        
        int MOD = 1000000007;
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 2;
        
        for (int i = 3; i <= n; i++) {
            dp[i] = (2 * dp[i - 1] % MOD + dp[i - 3]) % MOD;
        }
        
        return dp[n];
    }
}
