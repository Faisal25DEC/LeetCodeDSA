class Solution {
public:
    bool solve(vector<int>&nums,int idx, int sum, int currSum,vector<vector<int>>&dp){
         if(sum == 2*currSum)return true;
        if(idx == nums.size()){
            return false;
        }
       
        if(dp[idx][currSum]!=-1)return dp[idx][currSum];
        bool ans = solve(nums,idx+1,sum,currSum,dp) || solve(nums,idx+1,sum,currSum+nums[idx],dp);
        dp[idx][currSum] = ans?1:0;
        return ans;
    }
    bool canPartition(vector<int>& nums) {
        int sum = 0;
        for(int num:nums)sum+=num;
        if(sum%2)return false;
        vector<vector<int>> dp(nums.size(),vector<int>(sum+1,-1));
        return solve(nums,0,sum,0,dp);
    }
};