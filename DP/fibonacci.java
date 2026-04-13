class Solution {
    public int fib(int n) {
        int[] dp = new int[n+1];
        //Initializing the array with -1
        Arrays.fill(dp, -1);

        return solveDP(n, dp);
    }

    public int solveDP(int n, int[] dp){
        if(n == 0) return 0;
        if(n == 1) return 1;

        //Storing the values of the repeated subset in the array
        //Memoization
        if(dp[n] != -1) return dp[n];

        dp[n] = solveDP(n-1,dp) + solveDP(n-2,dp);
        return dp[n];
    }
}