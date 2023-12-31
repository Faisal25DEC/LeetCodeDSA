class Solution {
public:
    int maxLengthBetweenEqualCharacters(string s) {
        unordered_map<char, int> m;
        int maxLen = -1;
        for(int i = 0;i<s.size();i++){
            char c = s[i];
            if(m.find(c)!=m.end()){
                maxLen = max(maxLen, i-m[c]-1);
            }
            else{
m[c] = i;
            }
            
        }
        return maxLen;
    }
};