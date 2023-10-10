class Solution {
    public int characterReplacement(String s, int k) {
        int n = s.length();
       int [] arr = new int[26];
       int i = 0;
       int maxCount = 0;
       int maxFreq = 0;
       for(int j = 0;j<n;j++){
           arr[s.charAt(j) - 'A']++;
            maxFreq = Math.max(maxFreq, arr[s.charAt(j) -'A']);
           if(j-i+1 - maxFreq > k ){
               arr[s.charAt(i)-'A']--;
               i++;
           }
           maxCount = Math.max(maxCount, j-i+1);
       } 
       return maxCount;
    }
}