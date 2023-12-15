class Solution {
public:
    string destCity(vector<vector<string>>& paths) {
        unordered_set<string> m;
        for(vector<string> s:paths){
           m.insert(s[0]);
            
          
        }
        //for each loop
       for(vector<string> s:paths){
          if(m.find(s[1]) == m.end())return s[1];
        }
        return "";
    }
};