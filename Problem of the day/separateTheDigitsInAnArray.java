class Solution {
    public int[] separateDigits(int[] nums) {
        int k = 0;
        int totalLength = 0;

        for(int num : nums){
            totalLength+=String.valueOf(num).length();
        }

        int[] ans = new int[totalLength];

        for(int i = nums.length - 1;i>=0;i--){
            int n = nums[i];
            while(n != 0){
                ans[k] = n % 10;
                n = n / 10;
                k+=1;
            }
        }

        int i = 0;
        int j = ans.length - 1;
        while(i < j){
            int temp = ans[i];
            ans[i] = ans[j];
            ans[j] = temp;
            i+=1;
            j-=1;
        }

        return ans;
    }
}