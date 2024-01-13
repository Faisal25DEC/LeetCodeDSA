class Solution {
public:
    int minSteps(string s, string t) {
        unordered_map<char,int> sm;
        unordered_map<char,int> tm;
        for(int i = 0;i<s.size();i++){
            sm[s[i]]++;
            tm[t[i]]++;
        }
        int count = 0;
        for(int i = 0;i<s.size();i++){
            if(tm.find(s[i]) == tm.end()){
                count+=sm[s[i]];
                sm[s[i]] = 0;
            }
            else if(tm.find(s[i])!=tm.end()){
                if(tm[s[i]]<sm[s[i]]){
                    count+=sm[s[i]] - tm[s[i]];
                    sm[s[i]] = 0;
                    tm[s[i]] = 0;
                }
            }
        }
        return count;
    }
};