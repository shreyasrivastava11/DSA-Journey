// LeetCode 1855: Maximum Distance Between a Pair of Values

class Solution {
    public int maxDistance(int[] nums1, int[] nums2) {
        int j = 0;
        int i = 0;
        int max = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] <= nums2[j]) {
                int diff = j - i;
                if (max < diff) {
                    max = diff;
                }
                j += 1;
            } else if (nums1[i] > nums2[j]) {
                i = i + 1;
                j = j + 1;
            }
        }
        return max;
    }
}
