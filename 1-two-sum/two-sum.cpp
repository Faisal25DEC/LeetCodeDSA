class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        unordered_map<int,int> indices;
   
        for(int i = 0;i<nums.size();i++){
            
            int currNum = nums[i];
            if(indices.find(target-currNum)!=indices.end()){
                return {indices[target-currNum],i};
            }
          indices[nums[i]] = i;
            
        }
        //This is  a new commit 
        return {};
    }
};