class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int i = 0;
        int j=  nums.length - 1;
        int maxSum = Integer.MIN_VALUE;
        while(i<j){
            maxSum = Math.max(maxSum, nums[i]+nums[j]);
            i++;
            j--;
        }
        return maxSum;
    }
}