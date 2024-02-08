class Solution {
    public int numSquares(int n) {
        int [] dp = new int[n+1];
        for(int i = 1;i<dp.length;i++){
            dp[i] = dp[i-1]+1;
            int j = 2;
            while(true){
                if(i-j*j>=0){
                    dp[i] = Math.min(dp[i-j*j]+1,dp[i]);
                }
                else{
                    break;
                }
                j++;
            }
        }
        return dp[n];
    }
}