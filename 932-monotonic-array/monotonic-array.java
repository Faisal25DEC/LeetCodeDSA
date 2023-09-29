class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean flag1 = false, flag2 =false, flag3 = false;
        for(int i = 0;i<nums.length-1;i++){
            if(nums[i]<nums[i+1])flag1= true;
            else if(nums[i]>nums[i+1])flag2 = true;
            else flag3 = true;
        }
        if(flag1 && flag2)return false;
        return true;

    }
}