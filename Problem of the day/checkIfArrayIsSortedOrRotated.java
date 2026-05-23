class Solution {
    public boolean check(int[] nums) {
        int cnt = 0;

        for(int i = 0;i<nums.length-1;i++){
            if(nums[i] > nums[i+1]){
                cnt+=1;
            }
        }

        if(nums[nums.length-1] > nums[0]){
            cnt+=1;
        }

        return cnt <= 1;
    }
}