class Solution {
public:
    int solve(int n, int m, int i, int j,vector<vector<int>>&dp){
        if(i == n-1 && j == m-1)return 1;
        if(i == n || j == m)return 0;
        if(dp[i][j] != -1)return dp[i][j];
        return dp[i][j] = solve(n,m,i+1,j,dp) + solve(n,m,i,j+1,dp);
        

    }
    int uniquePaths(int m, int n) {
        vector<vector<int>> dp(n,vector<int>(m,-1));
        return solve(n,m,0,0,dp);
    }
};