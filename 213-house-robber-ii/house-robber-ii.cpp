class Solution {
public:
    int solve(vector<int>&arr, int idx, int range,vector<int>&dp){
        if(idx == range){
            return 0;
        }
        if(dp[idx]!=-1)return dp[idx];

        int skipTwo = arr[idx];
        if(idx<range-1){
            skipTwo+=solve(arr,idx+2,range,dp);
        }
        int skipOne = solve(arr,idx+1,range,dp);
        return dp[idx] = max(skipTwo, skipOne);
    }
    int rob(vector<int>& arr) {
        if(arr.size() == 1)return arr[0];
        int n = arr.size();
        vector<int> dp(n+1,-1);
        int ans1 = solve(arr,0,n-1,dp);
        dp = vector<int>(n+1,-1);
        int ans2 = solve(arr,1,n,dp);
        return max(ans1,ans2);
    }
};