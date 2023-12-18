class Solution {
public:
    int majorityElement(vector<int>& nums) {
        unordered_map<int,int> m;
        for(int i = 0;i<nums.size();i++){
            m[nums[i]]++;
        }
        for(auto &[k,v]:m){
            if(v>nums.size()/2)return k;
        }
        return -1;
    }
};