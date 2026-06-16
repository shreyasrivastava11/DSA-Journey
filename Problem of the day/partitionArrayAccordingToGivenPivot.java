class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];
        int ind = 0;
        int ind1 = 0;
        int pivotCount = 0;

        for(int i = 0;i<nums.length;i++){
            if(nums[i] < pivot){
                left[ind] = nums[i];
                ind++;
            }else if(nums[i] > pivot){
                right[ind1] = nums[i];
                ind1++;
            }else {
                pivotCount++;
            }
        }

        int j = 0;
        for(int i = 0;i<ind;i++){
            nums[j] = left[i];
            j+=1;
        }

        while(pivotCount != 0){
            nums[j] = pivot;
            pivotCount-=1;
            j+=1;
        }

        for(int i = 0;i<ind1;i++){
            nums[j] = right[i];
            j+=1;
        }

        return nums;
    }
}