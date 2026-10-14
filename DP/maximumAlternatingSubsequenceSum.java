class Solution {
    //Recursion
    public long maxAlternatingSum(int[] nums) {
        return solve(0, nums, true);
    }

    public long solve(int i, int[] nums, boolean isEven){
        long take;
        if(i >= nums.length) return 0;

        long skip = solve(i+1, nums, isEven);
        if(isEven){
            take = solve(i+1, nums, false) + nums[i];
        }else{
            take = solve(i+1, nums, true) - nums[i];
        }

        return Math.max(skip, take);
    }
}

class Solution {
    //Memoization (Top - down Approach)
    public long maxAlternatingSum(int[] nums) {
        long[][] dp = new long[nums.length+1][2];
        
        for(int i = 0;i<dp.length;i++){
            Arrays.fill(dp[i], -1);
        }

        return solve(0, nums, 1, dp);
    }

    public long solve(int i, int[] nums, int isEven, long[][] dp){
        long take;
        if(i >= nums.length) return 0;

        if(dp[i][isEven] != -1) return dp[i][isEven];

        long skip = solve(i+1, nums, isEven, dp);
        if(isEven == 1){
            take = solve(i+1, nums, 0, dp) + nums[i];
            dp[i][isEven] = Math.max(skip, take);
        }else{
            take = solve(i+1, nums, 1, dp) - nums[i];
            dp[i][isEven] = Math.max(skip, take);
        }

        return Math.max(skip, take);
    }
}
