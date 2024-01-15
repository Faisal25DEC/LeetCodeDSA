class Solution {
public:
    vector<vector<int>> findWinners(vector<vector<int>>& matches) {
       
        unordered_set<int> winner;
        unordered_map<int,int> loser;
        for(auto v:matches){
          
            winner.insert(v[0]);
            loser[v[1]]++;
        }
        vector<vector<int>> ans;
        vector<int> w;
        vector<int> l;
        for(int val:winner){
            if(loser.find(val) == loser.end())w.push_back(val);
        }
        for(auto &[key,value]:loser){
            if(value == 1)l.push_back(key);
        }
        sort(w.begin(),w.end());
        sort(l.begin(),l.end());
        ans.push_back(w);
        ans.push_back(l);
        return ans;
    }
};