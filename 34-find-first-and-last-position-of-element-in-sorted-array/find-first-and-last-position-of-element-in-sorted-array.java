class Solution {

    public int upperBound(int [] arr, int target, int n){
        int lo = 0, hi = n-1;
        int ans = -1;
        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            if(arr[mid]>target){
                 hi = mid-1;
                
                
            }
            else{
               lo = mid+1;
               ans = mid;
                
            }
        }
      if(ans == -1)return -1;
        return arr[ans] == target?ans:-1;
    }
    public int lowerBound(int [] arr, int target, int n){
        int lo = 0, hi = n-1;
        int ans = -1;
        while(lo<=hi){
            int mid = lo+(hi-lo)/2;
            if(arr[mid]<target){
              
                lo = mid+1;
            }
            else{
                  ans = mid;
                hi = mid-1;
            }
        }
        if(ans == -1)return ans;
        return arr[ans] == target?ans:-1;
    }
    public int[] searchRange(int[] nums, int target) {
        int lb = lowerBound(nums, target, nums.length);
        int up = upperBound(nums, target, nums.length);
        return new int[]{lb,up};
    }
}