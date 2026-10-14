class Solution {
    //Memoization (Top - Down Approach)
    public int tribonacci(int n) {
        int[] dp = new int[n+1];

        return memo(n, dp);
    }

    public int memo(int n, int[] dp){
        if(n == 0) return 0;
        if(n == 1) return 1;
        if(n == 2) return 1;

        if(dp[n] != 0) return dp[n];

        dp[n] = memo(n-1, dp) + memo(n-2, dp) + memo(n-3, dp);

        return dp[n];
    }
}

class Solution {
    //Tabular (Bottom Up Approach)
    public int tribonacci(int n) {
        int[] dp = new int[n+1];

        //State Define
        dp[0] = 0;
        if(n >= 1){
            dp[1] = 1;
        }

        if(n >= 2){
            dp[2] = 1;
        }

        for(int i = 3;i<=n;i++){
            dp[i] = dp[i-1] + dp[i-2] + dp[i-3];
        }

        return dp[n];
    }
}

class Solution {
    //Constant Space
    public int tribonacci(int n) {
        if(n == 0){
            return 0;
        }
        
        int a = 0;
        int b = 1;
        int c = 1;
        int d = 1;

        for(int i = 3;i<=n;i++){
            d = a + b + c;
            a = b;
            b = c;
            c = d;
        }

        return d;
    }
}
