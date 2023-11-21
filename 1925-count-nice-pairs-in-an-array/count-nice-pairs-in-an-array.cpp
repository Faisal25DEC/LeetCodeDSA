class Solution {
public:

    int rev(int n){
        int revNum = 0;
        while(n>0){
            int rem = n%10;
            revNum = revNum*10 + rem;
            n/=10;
        }
        return revNum;
    }
    int countNicePairs(vector<int>& nums) {
        int mod = 1e9 + 7;
        int count = 0;
        unordered_map<int,int> m;
        int n = nums.size();
        for(int i = 0;i<n;i++){
            nums[i] = nums[i] - rev(nums[i]);
        }
        for(int i = 0;i<n;i++){
            count=(count + m[nums[i]])%mod;
            m[nums[i]]++;
        }        
        return count;
    }

};