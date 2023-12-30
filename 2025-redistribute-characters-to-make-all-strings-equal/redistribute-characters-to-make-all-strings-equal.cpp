class Solution {
public:
    bool makeEqual(vector<string>& words) {
        if(words.size() ==1 )return true;
       unordered_map<char, int> m;
       for(string s: words){
           for(char c:s){
               m[c]++;
           }
       } 

       unordered_set<int> st;
       for(auto&[k,v]:m){
           if(v%words.size()!=0)return false;
           st.insert(v);
       }

       return true;

       
    }
};