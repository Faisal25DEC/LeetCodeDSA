class Solution {
public:
    vector<vector<int>>adj = {
       {4,6},
       {6,8},
       {7,9},
       {4,8},
       {0,3,9},
       {},
       {0,1,7},
       {2,6},
       {1,3},
       {2,4}
    };
    int mod = 1e9 + 7;
    int solve(int n, int cell, vector<vector<int>> &dp){
        if(n == 0)return 1;
        int ans = 0;
        if(dp[n][cell]!=-1)return dp[n][cell];
        for(int &nbr:adj[cell]){
            ans= (ans + solve(n-1, nbr, dp))%mod;
        }
        return dp[n][cell] = ans;
    }
    int knightDialer(int n) {
        int ans = 0;
        vector<vector<int>> dp(n, vector<int> (10, -1));
        for(int cell = 0;cell<10;cell++){
            ans=(ans +solve(n-1,cell, dp) )%mod;
        }
        return ans;
    }
};