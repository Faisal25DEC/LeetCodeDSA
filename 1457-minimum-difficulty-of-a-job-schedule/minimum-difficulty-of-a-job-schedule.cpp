class Solution {
public:
    int solve(vector<int>&arr, int d, int idx,vector<vector<int>>&dp){
           if (d == 1) {
            return *max_element(begin(arr) + idx, end(arr ));
        }
        
        if(dp[idx][d]!=-1)return dp[idx][d];
        int maxD = INT_MIN;
         int finalResult = INT_MAX;
        for(int i = idx;i<=arr.size()-d;i++){
           maxD = max(maxD, arr[i]);
            finalResult = min(finalResult, solve(arr, d-1, i+1,dp)+maxD);
        }
        return dp[idx][d] =  finalResult;
    }
    int minDifficulty(vector<int>& jobDifficulty, int d) {
        if(jobDifficulty.size()<d)return -1;
        vector<vector<int>> dp(jobDifficulty.size(),vector<int>(d+1,-1));
        return solve(jobDifficulty, d, 0,dp);
    }
};