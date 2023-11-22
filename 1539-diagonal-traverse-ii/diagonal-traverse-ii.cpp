class Solution {
public:
    vector<int> findDiagonalOrder(vector<vector<int>>& nums) {
        unordered_map<int, vector<int>> m;
        for(int i = nums.size()-1;i>=0;i--){
            for(int j =nums[i].size()-1;j>=0;j--){
                m[i+j].push_back(nums[i][j]);
            }
        }
        vector<int> ans;
        int dia = 0;
        while(m.find(dia)!=m.end()){
            for(int &num:m[dia]){
                ans.push_back(num);
            }
            dia++;
        }
        return ans;
    }
};