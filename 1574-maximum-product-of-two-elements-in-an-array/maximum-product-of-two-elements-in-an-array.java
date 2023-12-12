class Solution {
    public int maxProduct(int[] nums) {
        Arrays.sort(nums);
        return Math.max((nums[0]-1)*(nums[1]-1), (nums[nums.length-2]-1)*(nums[nums.length-1]-1));
    }
}