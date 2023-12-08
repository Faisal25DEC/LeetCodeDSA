class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 0;
        int count = 0;
        for(int i= 0;i<nums.length-1;i++){
          if(nums[i] !=nums[i+1]){
              nums[k++] = nums[i];
              
              count+=1;
          }
        }
       nums[k] = nums[nums.length-1];
       count++;
       return count;
    }
}