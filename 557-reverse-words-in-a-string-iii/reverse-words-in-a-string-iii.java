class Solution {
    public String reverseWords(String s) {
        int n = s.length();
        String ans = "";
        String temp = "";
        for(int i = 0;i<n;i++){
            if(s.charAt(i) == ' '){
                ans+= temp + " ";
                temp = "";
            }
            else{
                temp = s.charAt(i) + temp;
            }
       }
       return ans + temp;
    }
}