class Solution {
    public int buyChoco(int[] prices, int money) {
       int cost = 0;
       int count = 0;
       int min = Integer.MAX_VALUE, smin = Integer.MAX_VALUE;
       int n = prices.length;
       for(int i = 0;i<n;i++){
           if(prices[i]<min){
               smin = min;
               min = prices[i];
           }
           else if(prices[i]<smin && prices[i]>=min){
        smin = prices[i];
           }
       } 
       int diff = money - (smin+min);
       return diff>=0?diff:money;
    }
}