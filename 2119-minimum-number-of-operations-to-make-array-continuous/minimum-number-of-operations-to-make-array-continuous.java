class Solution {
    public int upperBound(int []nums, int target, int n){
        int lo = 0, hi = n-1;
        int ans = -1;
        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            if(nums[mid] > target){
                ans = mid;
                hi = mid-1;
            }
            else{
                lo = mid+1;
            }
        }
        return ans == -1?n:( ans);
    }
    public int minOperations(int[] nums) {
        int n = nums.length;
        int minCount = Integer.MAX_VALUE;
        Arrays.sort(nums);
        int uniqueLen = 1;
        for(int i = 1;i<n;i++){
            if(nums[i] !=nums[i-1]){
                nums[uniqueLen++] = nums[i];
            }
        }
        for(int i = 0;i<uniqueLen;i++){
            int curr_min = nums[i];
            int min = curr_min;
            int max = curr_min + n-1;
            int gtc = upperBound(nums, max, uniqueLen);

            minCount = Math.min(n - (gtc-i), minCount);
        }
            return minCount;
    }

}