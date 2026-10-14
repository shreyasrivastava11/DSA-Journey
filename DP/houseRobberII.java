class Solution {
    //Recursion
    public int rob(int[] nums) {
        if(nums.length == 1) return nums[0];

        int startIndex = robbery(nums.length - 2, nums, 0);
        int endIndex = robbery(nums.length - 1, nums, 1);

        return Math.max(startIndex, endIndex);
    }

    public int robbery(int i, int[] nums, int ind){
        if(i < ind) return 0;

        int skip = robbery(i - 1, nums, ind);
        int notSkip = robbery(i - 2, nums, ind) + nums[i];

        return Math.max(skip, notSkip);
    }
}
class Solution {
  //Memoization
    public int rob(int[] nums) {
        if(nums.length == 1) return nums[0];
        int[] dp1 = new int[nums.length + 1];
        int[] dp2 = new int[nums.length + 1];

        Arrays.fill(dp1, -1);
        Arrays.fill(dp2, -1);

        int startIndex = robbery(nums.length - 2, nums, 0, dp1);
        int endIndex = robbery(nums.length - 1, nums, 1, dp2);

        return Math.max(startIndex, endIndex);
    }

    public int robbery(int i, int[] nums, int ind, int[] dp){
        if(i < ind) return 0;

        if(dp[i] != -1) return dp[i];

        int skip = robbery(i - 1, nums, ind, dp);
        int notSkip = robbery(i - 2, nums, ind, dp) + nums[i];

        dp[i] = Math.max(skip, notSkip);

        return Math.max(skip, notSkip);
    }
}
class Solution {
    //Tabulation form
    public int rob(int[] nums) {
        if(nums.length == 1) return nums[0];
        
        int[] dp1 = new int[nums.length + 1];
        int[] dp2 = new int[nums.length + 1];

        dp1[0] = nums[0];
        if(nums.length > 1){
            dp1[1] = Math.max(nums[0], nums[1]);
            dp2[1] = nums[1];
        }

        for(int i = 2;i<nums.length - 1;i++){
            dp1[i] = Math.max(dp1[i-1], dp1[i-2] + nums[i]);
        }

        for(int i = 2;i<nums.length;i++){
            dp2[i] = Math.max(dp2[i-1], dp2[i-2] + nums[i]);
        }

        return Math.max(dp1[nums.length-2], dp2[nums.length-1]);
    }
}
class Solution {
    //Constant Space
    public int rob(int[] nums) {
        if(nums.length == 1) return nums[0];

        if(nums.length == 2) return Math.max(nums[0], nums[1]);

        int indexFirst = solve(0, nums.length - 2, nums);
        int indexSecond = solve(1, nums.length - 1, nums);

        return Math.max(indexFirst, indexSecond);
    }

    public int solve(int start, int end, int[] nums){
        int prevPrev = nums[start];
        int prev = Math.max(nums[start], nums[start+1]);

        for(int i = start+2;i<=end;i++){
            int temp = Math.max(prev, prevPrev + nums[i]);
            prevPrev = prev;
            prev = temp;
        }

        return prev;
    }
}
