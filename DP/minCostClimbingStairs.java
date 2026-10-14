class Solution {
    //Recursion
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;

        return costClimbingStairs(n, cost);
    }

    public int costClimbingStairs(int i, int[] cost){
        if(i == 0 || i == 1) return 0;

        int oneStep = costClimbingStairs(i-1,cost) + cost[i-1];
        int twoStep = costClimbingStairs(i-2,cost) + cost[i-2];

        return Math.min(oneStep, twoStep);
    }
}

class Solution {
    //Memoization (Top-Downn approach)
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int[] dp = new int[n + 1];

        Arrays.fill(dp, -1);

        return costClimbingStairs(n, cost, dp);
    }

    public int costClimbingStairs(int i, int[] cost, int[] dp){
        if(i == 0 || i == 1) return 0;

        if(dp[i] != -1) return dp[i];

        int oneStep = costClimbingStairs(i-1,cost, dp) + cost[i-1];
        int twoStep = costClimbingStairs(i-2,cost, dp) + cost[i-2];

        dp[i] = Math.min(oneStep, twoStep);

        return Math.min(oneStep, twoStep);
    }
}

class Solution {
    //Tabular (Bottom-Up Approach)
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int[] dp = new int[n+1];

        //State define
        dp[0] = 0;
        dp[1] = 0;

        for(int i = 2;i<=n;i++){
            dp[i] = Math.min(dp[i-1] + cost[i-1], dp[i-2] + cost[i-2]); 
        }

        return dp[n];
    }
}
