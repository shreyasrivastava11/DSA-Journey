class Solution {
    public int rob(int[] nums) {
        return adjRob(nums, 0);
    }
class Solution {
    public int rob(int[] nums) {
        return adjRob(nums, 0);
    }

    public int adjRob(int[] nums, int i){
        if(i >= nums.length){
            return 0;
        }

        int take = nums[i] + adjRob(nums, i+2);
        int notTake = adjRob(nums, i+1);

        return Math.max(take, notTake);
    }
}
    public int adjRob(int[] nums, int i){
        if(i >= nums.length){
            return 0;
        }

        int take = nums[i] + adjRob(nums, i+2);
        int notTake = adjRob(nums, i+1);

        return Math.max(take, notTake);
    }
}
