class Solution {
public:
    // int numIdenticalPairs(vector<int>& nums) {
    // //     unordered_map<int,int> freq;
    // //     int count = 0;
    // //     for(int val:nums){
    // //         freq[val]++;
    // //     }
    // //     for(int val:nums){
    // //         count+=(freq[val]*(freq[val]-1))/2;
    // //         freq.erase(val);
    // //     }
    // //     return count;
    // // }
    int numIdenticalPairs(vector<int>& A) {
        int res = 0;
        int *count  = new int[101]();
        for (int a: A) {
            res += count[a]++;
        }
        return res;
    }
};