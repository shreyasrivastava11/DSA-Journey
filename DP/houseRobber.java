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

//Bottom Up Approach
class Solution {
    public int rob(int[] nums) {
        int[] dp = new int[nums.length];
        if(nums.length == 1){
            return nums[0];
        }

        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);

        for(int i = 2;i<nums.length;i++){
            dp[i] = Math.max(dp[i-1], nums[i] + dp[i-2]);
        }

        return dp[nums.length - 1];
    }
}
