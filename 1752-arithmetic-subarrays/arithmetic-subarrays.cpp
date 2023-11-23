class Solution {
public:

    bool checkSequence (vector<int> &arr, int len){
        int mx = INT_MIN;
        int mn = INT_MAX;
        unordered_set<int> s;
        for(int i = 0;i<arr.size();i++){
            mx = max(mx, arr[i]);
            mn = min(mn, arr[i]);
            s.insert(arr[i]);
        }
        if((mx-mn)%(len) !=0)return false;
        int d = (mx-mn)/(len);
        int curr = mn + d;
        while(curr<mx){
            if(s.find(curr)==s.end())return false;
            curr = curr+d;
        }
        return true;
    }
    vector<bool> checkArithmeticSubarrays(vector<int>& nums, vector<int>& l, vector<int>& r) {
        
        vector<bool> ans;
        for(int i = 0;i<l.size();i++){
            vector<int> arr(nums.begin()+l[i], nums.begin() + r[i] + 1);
            if(checkSequence(arr, r[i]-l[i])){
                ans.push_back(true);
            }
            else{
                ans.push_back(false);
            }
        }
        return ans;
    }
};