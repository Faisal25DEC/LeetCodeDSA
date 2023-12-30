class Solution {
public:
    int solve(vector<int>&nums, int idx, vector<int>&dp,int n){

        if(idx == n)return 0;

        if(dp[idx]!=-1)return dp[idx];
        int skipTwo = nums[idx];
        if(idx<n-1){
            skipTwo +=  solve(nums,idx+2,dp,n);
        }
        int skipOne = solve(nums,idx+1,dp,n);
        return dp[idx] = max(skipTwo, skipOne);
    }
    int rob(vector<int>& nums) {
        int n = nums.size();
        vector<int> dp(n+1,-1);
        return solve(nums,0,dp,n);
    }
};