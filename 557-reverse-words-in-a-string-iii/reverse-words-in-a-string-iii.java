class Solution {
    public String reverseWords(String s) {
        int n = s.length();
        StringBuilder ans = new StringBuilder();
        StringBuilder temp = new StringBuilder();
        for(int i = 0;i<n;i++){
            if(s.charAt(i) == ' '){
                ans.append(temp.reverse() + " " );
                temp = new StringBuilder();
            }
            else{
                temp.append(s.charAt(i));
            }
       }
       return ans.append(temp.reverse()).toString();
    }
}