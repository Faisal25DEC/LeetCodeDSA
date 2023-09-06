class Solution {
public:
    int lengthOfLongestSubstring(string s) {
        if(s.size() == 1)return 1;
        if(s == "")return 0;
        unordered_map<char,int> m;
        int i = 0;
        int j = 1;
        int ans = 0;
        m[s[0]]++;
        bool flag = true;
        while(j<s.size()){
          if(flag){
            m[s[j]]++;
          }
            if(j-i+1 == m.size()){
                flag = true;
                int size = m.size();
                ans = max(ans,size);
                j++;
            } //all unique characters
            //!(all unique character)
            else{
                flag = false;
                m[s[i]]--;
                if(m[s[i]] == 0)m.erase(s[i]);
                i++;
            }
                
        }
        return ans;
      
        
        
    }
};