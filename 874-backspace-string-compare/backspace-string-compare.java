class Solution {
    public String getString(String s){
 Stack<Character> st = new Stack<>();
        int n = s.length();
        for(int i = 0;i<n;i++){
            if(s.charAt(i) == '#' && st.size()>0){
                st.pop();
                continue;
            }
            if(s.charAt(i)!='#'){
   st.push(s.charAt(i));
            }
         
        } 

        String ans = "";
        while(!st.isEmpty()){
            ans+=st.pop();
        }  
        return ans;
    }
    public boolean backspaceCompare(String s, String t) {
       String s1 = getString(s);
       String s2 = getString(t);
       return s1.equals(s2);
    }
}