//Top Down Approach
class Solution {
    public int rob(int[] nums) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp,-1);

        return solveTopDownDP(nums, dp, 0);
    }

    public int solveTopDownDP(int[] nums, int[] dp,int i){
        if(i >= nums.length){
            return 0;
        }

        if(dp[i] != -1){
            return dp[i];
        }

        int take = nums[i] + solveTopDownDP(nums, dp , i+2);
        int notTake = solveTopDownDP(nums, dp, i+1);

        return dp[i] = Math.max(take, notTake);
    }
}