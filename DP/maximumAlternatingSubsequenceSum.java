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
