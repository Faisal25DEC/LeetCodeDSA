class Solution {
public:
    bool arrayStringsAreEqual(vector<string>& word1, vector<string>& word2) {
        string w1 = "", w2 = "";
        for(int i = 0;i<max(word1.size(),word2.size());i++){
            if(i<word1.size()){
                w1+=word1[i];
            }
            if(i<word2.size()){
                w2+=word2[i];
            }
        }
        return w1 == w2;
    }
};