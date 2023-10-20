class Solution {
    public int minCost(String colors, int[] neededTime) {
        int n = colors.length();
        int minTime = 0;
        for(int i = 0;i<n;i++){
            int sum = 0;
            int max =0;

            while(i<n-1 && colors.charAt(i) == colors.charAt(i+1)){
                sum+= neededTime[i];
                max = Math.max(neededTime[i], max);
                i++;
            }
            sum+=neededTime[i];
            max = Math.max(neededTime[i], max);
            minTime += sum-max;
        }
        return minTime;
    }
}