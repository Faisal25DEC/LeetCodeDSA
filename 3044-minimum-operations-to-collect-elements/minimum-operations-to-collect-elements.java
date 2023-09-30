class Solution {
    public int minOperations(List<Integer> nums, int k) {
        
        int n = nums.size();
        HashSet<Integer> set = new HashSet<>();
        
        for(int i = n-1;i>=0;i--){
            int ele = nums.get(i);
            if(ele<=k){
                set.add(ele);
            }
            if(set.size() == k)return n-i;
        }
        return -1;
        
    }
}