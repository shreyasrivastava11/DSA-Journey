class Solution {
    public long maxTotalValue(int[] nums, int k) {
        long min = nums[0];
        long max = nums[0];

        for(int i = 0;i<nums.length;i++){
            if(nums[i] > max){
                max = nums[i];
            }

            if(nums[i] < min){
                min = nums[i];
            }
        }

        long ans = max - min;

        return ans * k;
    }
}