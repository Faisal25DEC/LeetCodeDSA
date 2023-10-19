class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        int n = tokens.length;
        int i = 0, j= n-1;
        Arrays.sort(tokens);
        int score = 0;
        int maxScore = Integer.MIN_VALUE;
        while(i<=j){
            if(power>=tokens[i]){
                score++;
                power-=tokens[i];
                i++;
                          maxScore = Math.max(maxScore, score);
            }
            else if(score>=1){
                power+=tokens[j];
                score--;
                j--;
            }
            else{
                break;
            }
         
  
            
        }
        return maxScore<0?0:maxScore;
    }
}