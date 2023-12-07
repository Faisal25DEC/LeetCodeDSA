class Solution {
    public String largestOddNumber(String num) {
        int maxI = -1;

        for(int i = 0;i<num.length();i++){
          if((num.charAt(i)-'0')%2 == 1){
            maxI = i;
          }
        }
        return maxI == -1?"":num.substring(0,maxI+1);
    }
}