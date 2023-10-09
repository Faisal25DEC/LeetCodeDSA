class Solution {
    private int[][] dp = new int[505][505];  // Dynamic programming array
    private int nums1Size, nums2Size;  // Sizes of nums1 and nums2 arrays

    // Recursive function to calculate the maximum dot product
    private int calculateDotProduct(int[] nums1, int[] nums2, int idx1, int idx2) {
        if (idx1 == nums1Size || idx2 == nums2Size)
            return 0;

        if (dp[idx1][idx2] != -1)
            return dp[idx1][idx2];

        // Calculate dot product for three options
        int option1 = nums1[idx1] * nums2[idx2] + calculateDotProduct(nums1, nums2, idx1 + 1, idx2 + 1);
        int option2 = calculateDotProduct(nums1, nums2, idx1, idx2 + 1);
        int option3 = calculateDotProduct(nums1, nums2, idx1 + 1, idx2);

        dp[idx1][idx2] = Math.max(Math.max(option1, option2), option3);  // Store the maximum dot product
        return dp[idx1][idx2];
    }

    // Main function to calculate the maximum dot product
    public int maxDotProduct(int[] nums1, int[] nums2) {
        nums1Size = nums1.length;
        nums2Size = nums2.length;

        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        int firstMin = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        // Calculate maximum and minimum values for nums1
        for (int num : nums1) {
            firstMax = Math.max(firstMax, num);
            firstMin = Math.min(firstMin, num);
        }
        // Calculate maximum and minimum values for nums2
        for (int num : nums2) {
            secondMax = Math.max(secondMax, num);
            secondMin = Math.min(secondMin, num);
        }

        // Check special cases where all elements are negative
        if ((firstMax < 0 && secondMin > 0) || (firstMin > 0 && secondMax < 0)) {
            return Math.max(firstMax * secondMin, firstMin * secondMax);
        }

        // Initialize dp array with -1
        for (int i = 0; i < 505; i++) {
            Arrays.fill(dp[i], -1);
        }

        // Calculate the maximum dot product recursively
        return calculateDotProduct(nums1, nums2, 0, 0);
    }
}