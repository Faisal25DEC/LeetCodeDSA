class Solution {
    public int countWays(List<Integer> nums) {
        int count = 0;
        nums.add(Integer.MAX_VALUE);
        Collections.sort(nums);
        for(int i = 0;i<nums.size();i++){
            if(i+1>nums.get(i) && i+1<nums.get(i+1))count++;
        }
        if(nums.get(0)!=0){
            count++;
        }
        return count;
    }
}